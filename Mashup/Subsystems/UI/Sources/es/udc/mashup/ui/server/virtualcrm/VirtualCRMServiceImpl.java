package es.udc.mashup.ui.server.virtualcrm;

import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import es.udc.mashup.virtualcrm.service.LeadTO;
import es.udc.mashup.virtualcrm.service.VirtualCRMService;
import es.udc.mashup.virtualcrm.service.VirtualCRMServiceFactory;

public class VirtualCRMServiceImpl extends RemoteServiceServlet implements
		es.udc.mashup.ui.client.virtualcrm.VirtualCRMService {

	public List findLeads(String annualRevenueTypeAsString, String state) {

		/* Check for null. */
		checkForNull("annualRevenueTypeAsString", annualRevenueTypeAsString);
		checkForNull("state", state);

		/* Delegate operation to real service. */
		VirtualCRMService.RevenueType annualRevenueType = TypeConversor
				.toRevenueType(annualRevenueTypeAsString);
		List<LeadTO> leadTOs = getRealService().findLeads(annualRevenueType,
				state);

		return TypeConversor.toLeadJTOs(leadTOs);

	}

	private void checkForNull(String fieldName, String value) {

		if (value == null) {
			throw new RuntimeException("'" + fieldName + "' is null");
		}

	}

	private VirtualCRMService getRealService() {
		return VirtualCRMServiceFactory.getVirtualCRMService();
	}

}
