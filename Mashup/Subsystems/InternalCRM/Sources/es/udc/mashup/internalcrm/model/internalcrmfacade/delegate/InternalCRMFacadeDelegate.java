package es.udc.mashup.internalcrm.model.internalcrmfacade.delegate;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import es.udc.mashup.internalcrm.model.to.InternalCRMLeadTO;

public interface InternalCRMFacadeDelegate extends Serializable {

	public List<InternalCRMLeadTO> findLastLeads(Calendar startDate,
			Calendar endDate);

	public List<InternalCRMLeadTO> findLeads(double minAnnualRevenue,
			double maxAnnualRevenue, String state);

}
