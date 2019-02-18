package es.udc.mashup.ui.server.virtualcrm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.udc.mashup.ui.client.search.RevenueTypeAsStringConstants;
import es.udc.mashup.ui.client.virtualcrm.GeographicPointJTO;
import es.udc.mashup.ui.client.virtualcrm.LeadJTO;
import es.udc.mashup.virtualcrm.service.GeographicPointTO;
import es.udc.mashup.virtualcrm.service.LeadTO;
import es.udc.mashup.virtualcrm.service.VirtualCRMService.RevenueType;

public class TypeConversor {

	private final static Map<String, RevenueType> REVENUE_TYPE_MAPPING = getRevenueTypeMapping();

	private TypeConversor() {
	}

	public final static RevenueType toRevenueType(String revenueTypeAsString) {

		RevenueType revenueType = REVENUE_TYPE_MAPPING.get(revenueTypeAsString);

		if (revenueType == null) {
			throw new RuntimeException("'" + revenueTypeAsString + "'"
					+ " value can not be converted to "
					+ RevenueType.class.getName());
		}

		return revenueType;

	}

	public final static List toLeadJTOs(List<LeadTO> leadTOs) {

		List leadJTOs = new ArrayList();

		for (LeadTO l : leadTOs) {
			leadJTOs.add(toLeadJTO(l));
		}

		return leadJTOs;

	}

	private final static LeadJTO toLeadJTO(LeadTO leadTO) {

		return new LeadJTO(leadTO.getFirstName(), leadTO.getLastName(), leadTO
				.getCompany(), leadTO.getAnnualRevenue(), leadTO.getPhone(),
				leadTO.getStreet(), leadTO.getPostalCode(), leadTO.getCity(),
				leadTO.getState(), leadTO.getCountry(),
				toGeographicPointJTO(leadTO.getGeographicPointTO()));

	}

	/**
	 * @param geographicPointTO
	 *            it may be <code>null</code>
	 */
	private final static GeographicPointJTO toGeographicPointJTO(
			GeographicPointTO geographicPointTO) {

		if (geographicPointTO != null) {
			return new GeographicPointJTO(geographicPointTO.getLatitude(),
					geographicPointTO.getLongitude());
		} else {
			return null;
		}

	}

	private final static Map<String, RevenueType> getRevenueTypeMapping() {

		Map<String, RevenueType> revenueTypeMapping = new HashMap<String, RevenueType>();

		revenueTypeMapping.put(RevenueTypeAsStringConstants.HIGH,
				RevenueType.HIGH);
		revenueTypeMapping.put(RevenueTypeAsStringConstants.MEDIUM,
				RevenueType.MEDIUM);
		revenueTypeMapping.put(RevenueTypeAsStringConstants.LOW,
				RevenueType.LOW);

		return revenueTypeMapping;

	}

}
