package es.udc.mashup.salesforce.service.wsdlutil;

import java.util.ArrayList;
import java.util.List;

import com.sforce.soap.enterprise.sobject.Lead;

import es.udc.mashup.crm.service.CRMLeadTO;

public final class SalesforceWSDLTypeConversor {

	public final static CRMLeadTO fromWSDL(Lead lead) {
		CRMLeadTO CRMLeadTO = new CRMLeadTO(lead.getFirstName(), lead
				.getLastName(), lead.getCompany(), lead.getAnnualRevenue(),
				lead.getPhone(), lead.getStreet(), lead.getPostalCode(), lead
						.getCity(), lead.getState(), lead.getCountry(), lead
						.getCreatedDate());
		return CRMLeadTO;
	}

	public final static List<CRMLeadTO> fromWSDL(Lead[] leads) {
		List<CRMLeadTO> CRMLeadTOs = new ArrayList<CRMLeadTO>();
		for (int i = 0; i < leads.length; i++) {
			CRMLeadTOs.add(fromWSDL(leads[i]));
		}
		return CRMLeadTOs;
	}

	public final static Lead toWSDL(CRMLeadTO CRMLeadTO) {
		Lead lead = new Lead();
		lead.setAnnualRevenue(CRMLeadTO.getAnnualRevenue());
		lead.setCity(CRMLeadTO.getCity());
		lead.setCompany(CRMLeadTO.getCompany());
		lead.setCountry(CRMLeadTO.getCountry());
		lead.setCreatedDate(CRMLeadTO.getInsertionDate());
		lead.setFirstName(CRMLeadTO.getFirstName());
		lead.setLastName(CRMLeadTO.getLastName());
		lead.setPhone(CRMLeadTO.getPhone());
		lead.setPostalCode(CRMLeadTO.getPostalCode());
		lead.setState(CRMLeadTO.getState());
		lead.setStreet(CRMLeadTO.getStreet());
		return lead;
	}

	public final static Lead[] toWSDL(List<CRMLeadTO> CRMLeadTOs) {
		Lead[] leads = new Lead[CRMLeadTOs.size()];
		for (int i = 0; i < leads.length; i++) {
			leads[i] = toWSDL(CRMLeadTOs.get(i));
		}
		return leads;
	}

	private SalesforceWSDLTypeConversor() {
	}

}
