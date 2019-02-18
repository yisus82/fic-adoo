package es.udc.mashup.virtualcrm.service;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import es.udc.ws.util.exceptions.ServiceException;

/**
 * NOTE: Implementations can maintain global state. State should be initialized
 * in the constructor and never modified in the implementation of operations.
 */
public interface VirtualCRMService extends Serializable {

	public enum RevenueType {
		LOW, MEDIUM, HIGH
	};

	public List<LeadTO> findLastLeads(Calendar startDate, Calendar endDate)
			throws ServiceException;

	public List<LeadTO> findLeads(RevenueType annualRevenueType, String state)
			throws ServiceException;

}
