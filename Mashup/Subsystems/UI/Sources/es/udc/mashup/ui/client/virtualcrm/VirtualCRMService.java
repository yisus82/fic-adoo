package es.udc.mashup.ui.client.virtualcrm;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;

public interface VirtualCRMService extends RemoteService {

	/**
	 * @gwt.typeArgs <es.udc.mashup.ui.client.virtualcrm.LeadJTO>
	 */
	public List findLeads(String annualRevenueType, String state);

}