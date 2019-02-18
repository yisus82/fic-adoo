package es.udc.mashup.internalcrm.service.servicedef;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;

public interface InternalCRM extends Remote {

	public LeadWTO[] findLastLeads(Calendar startDate, Calendar endDate)
			throws RemoteException;

	public LeadWTO[] findLeads(double minAnnualRevenue,
			double maxAnnualRevenue, String state) throws RemoteException;

}
