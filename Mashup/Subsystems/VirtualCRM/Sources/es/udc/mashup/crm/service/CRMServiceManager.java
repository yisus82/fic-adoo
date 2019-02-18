package es.udc.mashup.crm.service;

import java.util.ArrayList;
import java.util.List;

import es.udc.ws.util.configuration.ConfigurationParametersManager;
import es.udc.ws.util.exceptions.ServiceException;

public class CRMServiceManager {

	private final static String CLASS_NAME_PARAMETER = "CRMServiceManager/className";

	private static List<CRMService> services;

	static {

		try {
			services = new ArrayList<CRMService>();
			for (int i = 1;; i++) {
				String implClassName = ConfigurationParametersManager
						.getParameter(CLASS_NAME_PARAMETER + i);
				Class implClass = Class.forName(implClassName);
				CRMService service = (CRMService) implClass.newInstance();
				services.add(service);
			}
		} catch (Exception e) {
		}

	}

	/**
	 * It always returns the same (singleton) list of instances.
	 */
	public final static List<CRMService> getCRMServices()
			throws ServiceException {

		if (services.isEmpty()) {
			throw new ServiceException("Can not create instances of CRMService");
		} else {
			return services;
		}

	}

	private CRMServiceManager() {
	}

}
