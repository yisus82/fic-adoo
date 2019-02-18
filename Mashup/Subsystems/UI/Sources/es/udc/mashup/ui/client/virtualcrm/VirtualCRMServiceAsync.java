package es.udc.mashup.ui.client.virtualcrm;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface VirtualCRMServiceAsync {

	public void findLeads(String annualRevenueType, String state,
			AsyncCallback callback);

}
