/**
 * InternalCRMSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.udc.mashup.internalcrm.service.wsdl;

import java.rmi.RemoteException;
import java.util.Calendar;

import es.udc.mashup.internalcrm.model.internalcrmfacade.delegate.InternalCRMFacadeDelegate;
import es.udc.mashup.internalcrm.model.internalcrmfacade.delegate.InternalCRMFacadeDelegateFactory;
import es.udc.mashup.internalcrm.service.wsdlutil.InternalCRMWSDLTypeConversor;

public class InternalCRMSoapBindingImpl implements InternalCRM {

	public LeadWTO[] findLastLeads(Calendar startDate, Calendar endDate)
			throws RemoteException {
		LeadWTO[] results;

		InternalCRMFacadeDelegate delegate = InternalCRMFacadeDelegateFactory
				.getInternalCRMFacadeDelegate();

		results = InternalCRMWSDLTypeConversor.toWSDL(delegate.findLastLeads(startDate,
				endDate));

		return results;
	}

	public LeadWTO[] findLeads(double minAnnualRevenue,
			double maxAnnualRevenue, String state) throws RemoteException {
		LeadWTO[] results;

		InternalCRMFacadeDelegate delegate = InternalCRMFacadeDelegateFactory
				.getInternalCRMFacadeDelegate();

		results = InternalCRMWSDLTypeConversor.toWSDL(delegate.findLeads(minAnnualRevenue,
				maxAnnualRevenue, state));

		return results;
	}

}
