package es.udc.mashup.geolocation.service;

import es.udc.ws.util.configuration.ConfigurationParametersManager;
import es.udc.ws.util.exceptions.ServiceException;

public class GeolocationServiceFactory {

	private final static String CLASS_NAME_PARAMETER = "GeolocationServiceFactory/className";

	private static GeolocationService instance;

	static {

		try {

			String implClassName = ConfigurationParametersManager
					.getParameter(CLASS_NAME_PARAMETER);
			Class implClass = Class.forName(implClassName);

			instance = (GeolocationService) implClass.newInstance();

		} catch (Exception e) {
		}

	}

	/**
	 * It always returns the same (singleton) instance.
	 */
	public final static GeolocationService getGeolocationService()
			throws ServiceException {

		if (instance == null) {
			throw new ServiceException("Can not create instance of "
					+ GeolocationService.class);
		} else {
			return instance;
		}

	}

	private GeolocationServiceFactory() {
	}

}
