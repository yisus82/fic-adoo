package es.udc.mashup.crm.service;

import java.util.ArrayList;
import java.util.List;

import es.udc.mashup.geolocation.service.AddressNotFoundException;
import es.udc.mashup.geolocation.service.GeolocationService;
import es.udc.mashup.geolocation.service.GeolocationServiceFactory;
import es.udc.mashup.virtualcrm.service.GeographicPointTO;
import es.udc.mashup.virtualcrm.service.LeadTO;

public final class CRMTypeConversor {

	public final static LeadTO fromCRM(CRMLeadTO CRMLeadTO) {
		GeographicPointTO geographicPointTO;
		GeolocationService geolocationService = GeolocationServiceFactory
				.getGeolocationService();
		try {
			geographicPointTO = geolocationService
					.getGeographicPointTO(CRMLeadTO.getStreet() + " "
							+ CRMLeadTO.getPostalCode() + " "
							+ CRMLeadTO.getCity() + " " + CRMLeadTO.getState()
							+ " " + CRMLeadTO.getCountry());
		} catch (AddressNotFoundException e) {
			geographicPointTO = null;
		}
		LeadTO leadTO = new LeadTO(CRMLeadTO.getFirstName(), CRMLeadTO
				.getLastName(), CRMLeadTO.getCompany(), CRMLeadTO
				.getAnnualRevenue(), CRMLeadTO.getPhone(), CRMLeadTO
				.getStreet(), CRMLeadTO.getPostalCode(), CRMLeadTO.getCity(),
				CRMLeadTO.getState(), CRMLeadTO.getCountry(), CRMLeadTO
						.getInsertionDate(), geographicPointTO);
		return leadTO;
	}

	public final static List<LeadTO> fromCRM(List<CRMLeadTO> CRMLeadTOs) {
		List<LeadTO> leadTOs = new ArrayList<LeadTO>();
		for (CRMLeadTO CRMleadTO : CRMLeadTOs) {
			leadTOs.add(fromCRM(CRMleadTO));
		}
		return leadTOs;
	}

	public final static CRMLeadTO toCRM(LeadTO leadTO) {
		CRMLeadTO CRMLeadTO = new CRMLeadTO(leadTO.getFirstName(), leadTO
				.getLastName(), leadTO.getCompany(), leadTO.getAnnualRevenue(),
				leadTO.getPhone(), leadTO.getStreet(), leadTO.getPostalCode(),
				leadTO.getCity(), leadTO.getState(), leadTO.getCountry(),
				leadTO.getInsertionDate());
		return CRMLeadTO;
	}

	public final static List<CRMLeadTO> toCRM(List<LeadTO> leadTOs) {
		List<CRMLeadTO> CRMLeadTOs = new ArrayList<CRMLeadTO>();
		for (LeadTO leadTO : leadTOs) {
			CRMLeadTOs.add(toCRM(leadTO));
		}
		return CRMLeadTOs;
	}

	private CRMTypeConversor() {
	}

}
