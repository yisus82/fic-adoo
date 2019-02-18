package es.udc.mashup.internalcrm.service.proxy;

import java.util.Calendar;
import java.util.List;

import javax.xml.rpc.Stub;

import es.udc.mashup.crm.service.CRMLeadTO;
import es.udc.mashup.crm.service.CRMService;
import es.udc.mashup.internalcrm.model.util.InternalCRMTypeConversor;
import es.udc.mashup.internalcrm.service.wsdl.InternalCRM;
import es.udc.mashup.internalcrm.service.wsdl.InternalCRMService;
import es.udc.mashup.internalcrm.service.wsdl.InternalCRMServiceLocator;
import es.udc.mashup.internalcrm.service.wsdlutil.InternalCRMWSDLTypeConversor;
import es.udc.ws.util.configuration.ConfigurationParametersManager;
import es.udc.ws.util.exceptions.ServiceException;

public class InternalCRMServiceSOAPProxy implements CRMService {

	private final static String ENDPOINT_ADDRESS_PARAMETER = "InternalCRMServiceSOAPProxy/endPointAddress";

	public List<CRMLeadTO> findLastLeads(Calendar startDate, Calendar endDate)
			throws ServiceException {

		try {
			/* Construct an instance of the port proxy. */
			InternalCRMService internalCRMService = new InternalCRMServiceLocator();

			String endPointAddress = ConfigurationParametersManager
					.getParameter(ENDPOINT_ADDRESS_PARAMETER);
			InternalCRM internalCRM = internalCRMService.getInternalCRM();
			((Stub) internalCRM)._setProperty(Stub.ENDPOINT_ADDRESS_PROPERTY,
					endPointAddress);

			/* Get the leads. */
			List<CRMLeadTO> CRMLeadTOs = InternalCRMTypeConversor
					.fromInternalCRM(InternalCRMWSDLTypeConversor.fromWSDL(internalCRM
							.findLastLeads(startDate, endDate)));

			return CRMLeadTOs;
		} catch (Exception e) {
			throw new ServiceException(e);
		}

	}

	public List<CRMLeadTO> findLeads(double minAnnualRevenue,
			double maxAnnualRevenue, String state) throws ServiceException {

		try {
			/* Construct an instance of the port proxy. */
			InternalCRMService internalCRMService = new InternalCRMServiceLocator();

			String endPointAddress = ConfigurationParametersManager
					.getParameter(ENDPOINT_ADDRESS_PARAMETER);
			InternalCRM internalCRM = internalCRMService.getInternalCRM();
			((Stub) internalCRM)._setProperty(Stub.ENDPOINT_ADDRESS_PROPERTY,
					endPointAddress);

			/* Get the leads. */
			List<CRMLeadTO> CRMLeadTOs = InternalCRMTypeConversor
					.fromInternalCRM(InternalCRMWSDLTypeConversor.fromWSDL(internalCRM
							.findLeads(minAnnualRevenue, maxAnnualRevenue,
									state)));

			return CRMLeadTOs;
		} catch (Exception e) {
			throw new ServiceException(e);
		}

	}

}
