package es.udc.mashup.virtualcrm.service;

import es.udc.ws.util.configuration.ConfigurationParametersManager;
import es.udc.ws.util.exceptions.ServiceException;

public class VirtualCRMServiceFactory {

	private final static String CLASS_NAME_PARAMETER = "VirtualCRMServiceFactory/className";

	private static VirtualCRMService instance;

	static {

		try {

			String implClassName = ConfigurationParametersManager
					.getParameter(CLASS_NAME_PARAMETER);
			Class implClass = Class.forName(implClassName);

			instance = (VirtualCRMService) implClass.newInstance();

		} catch (Exception e) {
		}

	}

	private VirtualCRMServiceFactory() {
	}

	/**
	 * It always returns the same (singleton) instance.
	 */
	public final static VirtualCRMService getVirtualCRMService()
			throws ServiceException {

		if (instance == null) {
			throw new ServiceException("Can not create instance of "
					+ VirtualCRMService.class);
		} else {
			return instance;
		}

	}

}
