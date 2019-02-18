package es.udc.mashup.virtualcrm.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import es.udc.mashup.crm.service.CRMService;
import es.udc.mashup.crm.service.CRMServiceManager;
import es.udc.mashup.crm.service.CRMTypeConversor;
import es.udc.mashup.virtualcrm.service.LeadTO;
import es.udc.mashup.virtualcrm.service.VirtualCRMService;
import es.udc.ws.util.exceptions.ServiceException;

public class VirtualCRMServiceImpl implements VirtualCRMService {

	public List<LeadTO> findLastLeads(Calendar startDate, Calendar endDate)
			throws ServiceException {

		List<LeadTO> leadTOs = new ArrayList<LeadTO>();
		List<CRMService> services = CRMServiceManager.getCRMServices();
		for (CRMService service : services) {
			leadTOs.addAll(CRMTypeConversor.fromCRM(service.findLastLeads(
					startDate, endDate)));
		}
		return leadTOs;

	}

	public List<LeadTO> findLeads(RevenueType annualRevenueType, String state)
			throws ServiceException {

		List<LeadTO> leadTOs = new ArrayList<LeadTO>();
		List<CRMService> services = CRMServiceManager.getCRMServices();
		for (CRMService service : services) {
			leadTOs.addAll(CRMTypeConversor.fromCRM(service.findLeads(
					getMinAnnualRevenue(annualRevenueType),
					getMaxAnnualRevenue(annualRevenueType), state)));
		}
		return leadTOs;

	}

	private double getMaxAnnualRevenue(RevenueType annualRevenueType) {
		double annualRevenue;

		switch (annualRevenueType) {
		case HIGH:
			annualRevenue = Double.MAX_VALUE;
			break;
		case MEDIUM:
			annualRevenue = 1000000;
			break;
		case LOW:
			annualRevenue = 500000;
			break;
		default:
			annualRevenue = Double.MAX_VALUE;
		}

		return annualRevenue;
	}

	private double getMinAnnualRevenue(RevenueType annualRevenueType) {
		double annualRevenue;

		switch (annualRevenueType) {
		case HIGH:
			annualRevenue = 1000000;
			break;
		case MEDIUM:
			annualRevenue = 500000;
			break;
		case LOW:
			annualRevenue = 0;
			break;
		default:
			annualRevenue = 0;
		}

		return annualRevenue;
	}

}
