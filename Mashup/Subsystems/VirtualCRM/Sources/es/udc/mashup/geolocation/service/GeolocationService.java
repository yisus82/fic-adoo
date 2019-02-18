package es.udc.mashup.geolocation.service;

import es.udc.mashup.virtualcrm.service.GeographicPointTO;
import es.udc.ws.util.exceptions.ServiceException;

public interface GeolocationService {

	public GeographicPointTO getGeographicPointTO(String address)
			throws ServiceException, AddressNotFoundException;

}
