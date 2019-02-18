package es.udc.mashup.geolocation.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;

import es.udc.mashup.geolocation.service.AddressNotFoundException;
import es.udc.mashup.geolocation.service.GeolocationService;
import es.udc.mashup.virtualcrm.service.GeographicPointTO;
import es.udc.ws.util.exceptions.ServiceException;

public class GoogleGeolocationServiceImpl implements GeolocationService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.udc.mashup.internalcrm.service.GeolocalizationService#getGeographicPointTO(java.lang.String)
	 */
	public GeographicPointTO getGeographicPointTO(String address)
			throws ServiceException, AddressNotFoundException {
		String encodedAddress;
		try {
			encodedAddress = URLEncoder.encode(address, "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			throw new ServiceException(e);
		}
		String url = "http://maps.google.com/maps/geo?q="
				+ encodedAddress
				+ "&output=csv&key=ABQIAAAApNr8EaxVvYPOXAJlY7JdbhTwM0brOpm-All5BF6PoaKBxRWWERS2chSj2KrEFQQgdZKVQXxifxDKEA";
		GetMethod method = new GetMethod(url);
		HttpClient client = new HttpClient();
		client.getHostConfiguration().setProxy("proxy", 3128);
		int statusCode;
		try {
			statusCode = client.executeMethod(method);
			if (statusCode == HttpStatus.SC_OK) {
				InputStream inputStream = method.getResponseBodyAsStream();
				InputStreamReader inputReader = new InputStreamReader(
						inputStream);
				BufferedReader bufferedReader = new BufferedReader(inputReader);
				StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.append(bufferedReader.readLine());
				bufferedReader.close();
				String response = stringBuilder.toString();
				String[] values = response.split(",");
				if (values[1].equals("0"))
					throw new AddressNotFoundException();
				else
					return new GeographicPointTO(new Double(values[2]),
							new Double(values[3]));
			} else
				throw new AddressNotFoundException();
		} catch (HttpException e) {
			throw new ServiceException(e);
		} catch (IOException e) {
			throw new ServiceException(e);
		} finally {
			method.releaseConnection();
		}
	}

}
