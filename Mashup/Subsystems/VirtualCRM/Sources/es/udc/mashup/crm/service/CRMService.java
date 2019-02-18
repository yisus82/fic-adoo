package es.udc.mashup.crm.service;

import java.util.Calendar;
import java.util.List;

public interface CRMService {

	public List<CRMLeadTO> findLastLeads(Calendar startDate, Calendar endDate);

	public List<CRMLeadTO> findLeads(double minAnnualRevenue,
			double maxAnnualRevenue, String state);

}
