package es.udc.mashup.virtualcrm.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import es.udc.mashup.virtualcrm.service.GeographicPointTO;
import es.udc.mashup.virtualcrm.service.LeadTO;
import es.udc.mashup.virtualcrm.service.VirtualCRMService;
import es.udc.ws.util.exceptions.ServiceException;

/**
 * Mock object for client-side testing.
 */
public class MockVirtualCRMService implements VirtualCRMService {

	private final static int DATA_SERVICE_STATE = 0;

	private final static int SERVICE_EXCEPTION_SERVICE_STATE = 1;

	private final static int NO_DATA_SERVICE_STATE = 2;

	private final static int NUM_SERVICE_STATES = NO_DATA_SERVICE_STATE + 1;

	private int serviceState;

	public MockVirtualCRMService() {
		serviceState = DATA_SERVICE_STATE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.udc.mashup.virtualcrm.service.VirtualCRMService#findLastLeads(java.util.Calendar,
	 *      java.util.Calendar)
	 */
	public List<LeadTO> findLastLeads(Calendar startDate, Calendar endDate)
			throws ServiceException {
		return getLeadTOS(RevenueType.HIGH, "A Coru�a");
	}

	public List<LeadTO> findLeads(RevenueType annualRevenueType, String state)
			throws ServiceException {

		List<LeadTO> leadTOs = null;
		int currentServiceState = serviceState;

		nextServiceState();

		switch (currentServiceState) {
		case DATA_SERVICE_STATE:
			leadTOs = getLeadTOS(annualRevenueType, state);
			break;
		case SERVICE_EXCEPTION_SERVICE_STATE:
			throw new ServiceException("Service exception test");
		case NO_DATA_SERVICE_STATE:
			leadTOs = new ArrayList<LeadTO>();
			break;
		}

		return leadTOs;

	}

	private double getAnnualRevenue(RevenueType annualRevenueType) {

		double annualRevenue = 0;

		switch (annualRevenueType) {
		case HIGH:
			annualRevenue = 1000000;
			break;
		case MEDIUM:
			annualRevenue = 500000;
			break;
		case LOW:
			annualRevenue = 100000;
			break;
		}

		return annualRevenue;

	}

	private List<LeadTO> getLeadTOS(RevenueType annualRevenueType, String state) {

		List<LeadTO> leadTOs = new ArrayList<LeadTO>();

		for (int i = 1; i <= 10; i++) {
			leadTOs.add(new LeadTO("FirstName-" + i, "LastNameA-" + i
					+ " LastNameB-" + i, "Acme1",
					getAnnualRevenue(annualRevenueType), "123456789",
					"Castro de Elviña 123", "15XXX", "A Coruña", state,
					"Spain", Calendar.getInstance(), new GeographicPointTO(
							43.332355, -8.407843)));
		}

		for (int i = 11; i <= 20; i++) {
			leadTOs.add(new LeadTO("FirstName-" + i, "LastNameA-" + i
					+ " LastNameB-" + i, "Acme2",
					getAnnualRevenue(annualRevenueType) - 10, "567801234",
					"Ronda de Nelle 123", "15XXX", "A Coruña", state, "Spain",
					Calendar.getInstance(), new GeographicPointTO(43.363273,
							-8.417281)));
		}

		leadTOs.add(new LeadTO("Person", "From As Pontes", "Acme3",
				getAnnualRevenue(annualRevenueType) - 20, "801234567",
				"Avenida de Ortigueira 12", "15XXX", "As Pontes", state,
				"Spain", Calendar.getInstance(), new GeographicPointTO(
						43.454143, -7.852015)));

		leadTOs.add(new LeadTO("Person", "Without GP", "Acme4",
				getAnnualRevenue(annualRevenueType) - 20, "345678901",
				"Strange Street", "XXXXX", "Strange city", state,
				"Strange country", Calendar.getInstance(), null)); // geographicalPointJTO
		// == null.

		return leadTOs;

	}

	private void nextServiceState() {
		serviceState = (++serviceState) % NUM_SERVICE_STATES;
	}

}
