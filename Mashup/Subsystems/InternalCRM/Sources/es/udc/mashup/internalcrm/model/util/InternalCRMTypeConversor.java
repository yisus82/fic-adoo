package es.udc.mashup.internalcrm.model.util;

import java.util.ArrayList;
import java.util.List;

import es.udc.mashup.crm.service.CRMLeadTO;
import es.udc.mashup.internalcrm.model.to.InternalCRMLeadTO;

public final class InternalCRMTypeConversor {

	public final static CRMLeadTO fromInternalCRM(
			InternalCRMLeadTO internalCRMLeadTO) {
		String lastName = internalCRMLeadTO.getName().split(", ")[0];
		String firstName = internalCRMLeadTO.getName().split(", ")[1];
		CRMLeadTO CRMLeadTO = new CRMLeadTO(firstName, lastName,
				internalCRMLeadTO.getCompany(), internalCRMLeadTO
						.getAnnualRevenue(), internalCRMLeadTO.getPhone(),
				internalCRMLeadTO.getStreet(), internalCRMLeadTO
						.getPostalCode(), internalCRMLeadTO.getCity(),
				internalCRMLeadTO.getState(), internalCRMLeadTO.getCountry(),
				internalCRMLeadTO.getInsertionDate());
		return CRMLeadTO;
	}

	public final static List<CRMLeadTO> fromInternalCRM(
			List<InternalCRMLeadTO> internalCRMLeadTOs) {
		List<CRMLeadTO> CRMLeadTOs = new ArrayList<CRMLeadTO>();
		for (InternalCRMLeadTO internalCRMLeadTO : internalCRMLeadTOs) {
			CRMLeadTOs.add(fromInternalCRM(internalCRMLeadTO));
		}
		return CRMLeadTOs;
	}

	public final static InternalCRMLeadTO toInternalCRM(CRMLeadTO CRMLeadTO) {
		InternalCRMLeadTO internalCRMLeadTO = new InternalCRMLeadTO(CRMLeadTO
				.getLastName()
				+ ", " + CRMLeadTO.getFirstName(), CRMLeadTO.getCompany(),
				CRMLeadTO.getAnnualRevenue(), CRMLeadTO.getPhone(), CRMLeadTO
						.getStreet(), CRMLeadTO.getPostalCode(), CRMLeadTO
						.getCity(), CRMLeadTO.getState(), CRMLeadTO
						.getCountry(), CRMLeadTO.getInsertionDate());
		return internalCRMLeadTO;
	}

	public final static List<InternalCRMLeadTO> toInternalCRM(
			List<CRMLeadTO> CRMLeadTOs) {
		List<InternalCRMLeadTO> internalCRMCRMLeadTOs = new ArrayList<InternalCRMLeadTO>();
		for (CRMLeadTO CRMLeadTO : CRMLeadTOs) {
			internalCRMCRMLeadTOs.add(toInternalCRM(CRMLeadTO));
		}
		return internalCRMCRMLeadTOs;
	}

	private InternalCRMTypeConversor() {
	}

}
