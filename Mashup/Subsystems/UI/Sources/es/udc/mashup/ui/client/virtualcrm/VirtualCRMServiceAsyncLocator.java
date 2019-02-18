package es.udc.mashup.ui.client.virtualcrm;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public class VirtualCRMServiceAsyncLocator {

	private final static String SERVICE_URL_SUFFIX = "VirtualCRMService";

	private VirtualCRMServiceAsyncLocator() {
	}

	public static VirtualCRMServiceAsync getVirtualCRMServiceAsync() {

		/* Create proxy. */
		VirtualCRMServiceAsync service = (VirtualCRMServiceAsync) GWT
				.create(VirtualCRMService.class);

		/* Set service URL. */
		ServiceDefTarget endpoint = (ServiceDefTarget) service;
		String serviceURL = GWT.getModuleBaseURL() + SERVICE_URL_SUFFIX;

		endpoint.setServiceEntryPoint(serviceURL);

		/* Return proxy. */
		return service;

	}

}
