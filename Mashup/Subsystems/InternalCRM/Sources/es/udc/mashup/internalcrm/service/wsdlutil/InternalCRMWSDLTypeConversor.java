package es.udc.mashup.internalcrm.service.wsdlutil;

import java.util.ArrayList;
import java.util.List;

import es.udc.mashup.internalcrm.model.to.InternalCRMLeadTO;
import es.udc.mashup.internalcrm.service.wsdl.LeadWTO;

public final class InternalCRMWSDLTypeConversor {

	public final static InternalCRMLeadTO fromWSDL(LeadWTO leadWTO) {
		InternalCRMLeadTO internalCRMLeadTO = new InternalCRMLeadTO(leadWTO
				.getName(), leadWTO.getCompany(), leadWTO.getAnnualRevenue(),
				leadWTO.getPhone(), leadWTO.getStreet(), leadWTO
						.getPostalCode(), leadWTO.getCity(),
				leadWTO.getState(), leadWTO.getCountry(), leadWTO
						.getInsertionDate());
		return internalCRMLeadTO;
	}

	public final static List<InternalCRMLeadTO> fromWSDL(LeadWTO[] leadWTOs) {
		List<InternalCRMLeadTO> internalCRMLeadTOs = new ArrayList<InternalCRMLeadTO>();
		for (int i = 0; i < leadWTOs.length; i++) {
			internalCRMLeadTOs.add(fromWSDL(leadWTOs[i]));
		}
		return internalCRMLeadTOs;
	}

	public final static LeadWTO toWSDL(InternalCRMLeadTO internalCRMLeadTO) {
		LeadWTO leadWTO = new LeadWTO(internalCRMLeadTO.getAnnualRevenue(),
				internalCRMLeadTO.getCity(), internalCRMLeadTO.getCompany(),
				internalCRMLeadTO.getCountry(), internalCRMLeadTO
						.getInsertionDate(), internalCRMLeadTO.getName(),
				internalCRMLeadTO.getPhone(),
				internalCRMLeadTO.getPostalCode(),
				internalCRMLeadTO.getState(), internalCRMLeadTO.getStreet());
		return leadWTO;
	}

	public final static LeadWTO[] toWSDL(
			List<InternalCRMLeadTO> internalCRMLeadTOs) {
		LeadWTO[] leadWTOs = new LeadWTO[internalCRMLeadTOs.size()];
		for (int i = 0; i < leadWTOs.length; i++) {
			leadWTOs[i] = toWSDL(internalCRMLeadTOs.get(i));
		}
		return leadWTOs;
	}

	private InternalCRMWSDLTypeConversor() {
	}

}
