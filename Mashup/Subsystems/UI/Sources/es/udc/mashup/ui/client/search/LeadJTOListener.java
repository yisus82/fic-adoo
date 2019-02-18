package es.udc.mashup.ui.client.search;

import es.udc.mashup.ui.client.virtualcrm.LeadJTO;

public interface LeadJTOListener {

	public void onLeadJTOSelected(LeadJTO leadJTO);

	public void onNoLeadJTOSelected();

}
