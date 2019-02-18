package es.udc.mashup.internalcrm.service;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import es.udc.mashup.internalcrm.service.wsdl.InternalCRMSoapBindingImpl;
import es.udc.mashup.internalcrm.service.wsdl.LeadWTO;

public class InternalCRMService extends InternalCRMSoapBindingImpl {

	private static List<LeadWTO> leadWTOs;

	static {
		leadWTOs = new ArrayList<LeadWTO>();
		Calendar date = Calendar.getInstance();

		date.add(Calendar.DAY_OF_YEAR, -2);

		for (int i = 1; i <= 10; i++) {
			leadWTOs.add(new LeadWTO(1000000, "A Coruña", "Acme1", "Spain",
					date, "LastNameA-" + i + " LastNameB-" + i + ", FirstName-"
							+ i, "123456789", "15003", "A Coruña", "Real 12"));
		}

		date = Calendar.getInstance();
		date.add(Calendar.HOUR_OF_DAY, -1);

		for (int i = 11; i <= 20; i++) {
			leadWTOs.add(new LeadWTO(200000, "A Coruña", "Acme2", "Spain",
					date, "LastNameA-" + i + " LastNameB-" + i + ", FirstName-"
							+ i, "567801234", "15007", "A Coruña",
					"Ronda de Nelle 123"));
		}

		leadWTOs.add(new LeadWTO(600000, "As Pontes", "Acme3", "Spain", date,
				"From As Pontes, Person", "801234567", "15320", "A Coruña",
				"Avenida de Ortigueira 12"));

		date = Calendar.getInstance();
		date.add(Calendar.MINUTE, -1);

		leadWTOs.add(new LeadWTO(800000, "Strange city", "Acme4",
				"Strange country", date, "Without GP, Person", "345678901",
				"XXXXX", "Strange state", "Strange Street"));
	}

	public LeadWTO[] findLastLeads(Calendar startDate, Calendar endDate)
			throws RemoteException {
		List<LeadWTO> results = new ArrayList<LeadWTO>();

		for (LeadWTO leadWTO : leadWTOs) {
			Calendar insertionDate = leadWTO.getInsertionDate();
			if (((insertionDate.equals(startDate)) || (insertionDate
					.after(startDate)))
					&& ((insertionDate.equals(endDate)) || (insertionDate
							.before(endDate))))
				results.add(leadWTO);
		}

		return results.toArray(new LeadWTO[results.size()]);
	}

	public LeadWTO[] findLeads(double minAnnualRevenue,
			double maxAnnualRevenue, String state) throws RemoteException {
		List<LeadWTO> results = new ArrayList<LeadWTO>();

		for (LeadWTO leadWTO : leadWTOs) {
			if ((leadWTO.getAnnualRevenue() >= minAnnualRevenue)
					&& (leadWTO.getAnnualRevenue() < maxAnnualRevenue)
					&& (leadWTO.getState().equalsIgnoreCase(state)))
				results.add(leadWTO);
		}

		return results.toArray(new LeadWTO[results.size()]);
	}

}
