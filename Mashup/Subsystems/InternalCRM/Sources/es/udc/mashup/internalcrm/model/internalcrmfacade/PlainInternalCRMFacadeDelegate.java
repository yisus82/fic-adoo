package es.udc.mashup.internalcrm.model.internalcrmfacade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import es.udc.mashup.internalcrm.model.internalcrmfacade.delegate.InternalCRMFacadeDelegate;
import es.udc.mashup.internalcrm.model.to.InternalCRMLeadTO;

public class PlainInternalCRMFacadeDelegate implements
		InternalCRMFacadeDelegate {

	private static List<InternalCRMLeadTO> internalCRMLeadTOs;

	static {
		internalCRMLeadTOs = new ArrayList<InternalCRMLeadTO>();
		Calendar date = Calendar.getInstance();

		date.add(Calendar.DAY_OF_YEAR, -2);

		for (int i = 1; i <= 10; i++) {
			internalCRMLeadTOs.add(new InternalCRMLeadTO("LastNameA-" + i
					+ " LastNameB-" + i + ", FirstName-" + i, "Acme1", 1000000,
					"123456789", "Real 12", "15003", "A Coruña", "A Coruña",
					"Spain", date));
		}

		date = Calendar.getInstance();
		date.add(Calendar.HOUR_OF_DAY, -1);

		for (int i = 11; i <= 20; i++) {
			internalCRMLeadTOs.add(new InternalCRMLeadTO("LastNameA-" + i
					+ " LastNameB-" + i + ", FirstName-" + i, "Acme2", 200000,
					"567801234", "Ronda de Nelle 123", "15007", "A Coruña",
					"A Coruña", "Spain", date));
		}

		internalCRMLeadTOs.add(new InternalCRMLeadTO("From As Pontes, Person",
				"Acme3", 600000, "801234567", "Avenida de Ortigueira 12",
				"15320", "As Pontes", "A Coruña", "Spain", date));

		date = Calendar.getInstance();
		date.add(Calendar.MINUTE, -1);

		internalCRMLeadTOs.add(new InternalCRMLeadTO("Without GP, Person",
				"Acme4", 800000, "345678901", "Strange Street", "XXXXX",
				"Strange City", "Strange State", "Strange Country", date));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.udc.mashup.internalcrm.model.internalcrmfacade.delegate.InternalCRMFacadeDelegate#findLastLeads(java.util.Calendar,
	 *      java.util.Calendar)
	 */
	public List<InternalCRMLeadTO> findLastLeads(Calendar startDate,
			Calendar endDate) {
		List<InternalCRMLeadTO> results = new ArrayList<InternalCRMLeadTO>();

		for (InternalCRMLeadTO internalCRMLeadTO : internalCRMLeadTOs) {
			Calendar insertionDate = internalCRMLeadTO.getInsertionDate();
			if (((insertionDate.equals(startDate)) || (insertionDate
					.after(startDate)))
					&& ((insertionDate.equals(endDate)) || (insertionDate
							.before(endDate))))
				results.add(internalCRMLeadTO);
		}

		return results;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.udc.mashup.internalcrm.model.internalcrmfacade.delegate.InternalCRMFacadeDelegate#findLeads(double,
	 *      double, java.lang.String)
	 */
	public List<InternalCRMLeadTO> findLeads(double minAnnualRevenue,
			double maxAnnualRevenue, String state) {
		List<InternalCRMLeadTO> results = new ArrayList<InternalCRMLeadTO>();

		for (InternalCRMLeadTO internalCRMLeadTO : internalCRMLeadTOs) {
			if ((internalCRMLeadTO.getAnnualRevenue() >= minAnnualRevenue)
					&& (internalCRMLeadTO.getAnnualRevenue() < maxAnnualRevenue)
					&& (internalCRMLeadTO.getState().equalsIgnoreCase(state)))
				results.add(internalCRMLeadTO);
		}

		return results;
	}

}
