package es.udc.mashup.salesforce.service.proxy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import com.sforce.soap.enterprise.LoginResult;
import com.sforce.soap.enterprise.QueryOptions;
import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.SessionHeader;
import com.sforce.soap.enterprise.SforceServiceLocator;
import com.sforce.soap.enterprise.SoapBindingStub;
import com.sforce.soap.enterprise.sobject.Lead;

import es.udc.mashup.crm.service.CRMLeadTO;
import es.udc.mashup.crm.service.CRMService;
import es.udc.mashup.salesforce.service.wsdlutil.SalesforceWSDLTypeConversor;
import es.udc.ws.util.exceptions.ServiceException;

public class SalesforceSOAPProxy implements CRMService {

	private SoapBindingStub binding;

	public SalesforceSOAPProxy() {
		LoginResult loginResult = null;

		try {
			binding = (SoapBindingStub) new SforceServiceLocator().getSoap();
		} catch (Exception e) {
			throw new ServiceException(e);
		}

		binding._setProperty("es.udc.ws.proxyHost", "proxy");
		binding._setProperty("es.udc.ws.proxyPort", "3128");

		// Time out after a minute
		binding.setTimeout(60000);

		try {
			loginResult = binding.login("djalma_fd@yahoo.es",
					"comeonSalesforce");
		} catch (Exception e) {
			throw new ServiceException(e);
		}

		// Set Service URL
		binding._setProperty(SoapBindingStub.ENDPOINT_ADDRESS_PROPERTY,
				loginResult.getServerUrl());

		// Create a new session header object and set the session id
		SessionHeader sh = new SessionHeader();
		sh.setSessionId(loginResult.getSessionId());
		binding.setHeader(new SforceServiceLocator().getServiceName()
				.getNamespaceURI(), "SessionHeader", sh);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.udc.mashup.crm.service.CRMService#findLastLeads(java.util.Calendar,
	 *      java.util.Calendar)
	 */
	public List<CRMLeadTO> findLastLeads(Calendar startDate, Calendar endDate) {
		/* Prepare query setting batch size */
		QueryResult qr = null;
		QueryOptions qo = new QueryOptions();
		qo.setBatchSize(new Integer(10));
		binding.setHeader(new SforceServiceLocator().getServiceName()
				.getNamespaceURI(), "QueryOptions", qo);

		/* Set query */
		DateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
		String query = "SELECT FirstName, LastName, Company, AnnualRevenue, "
				+ "Phone, Street, PostalCode, City, State, Country, CreatedDate FROM Lead WHERE "
				+ "CreatedDate >= " + dateFormat.format(startDate.getTime())
				+ " AND CreatedDate <= " + dateFormat.format(endDate.getTime());

		List<CRMLeadTO> CRMLeadTOs = new ArrayList<CRMLeadTO>();

		try {
			qr = binding.query(query);
			while (true) {
				// process the query results
				if (qr.getRecords() != null)
					for (int i = 0; i < qr.getRecords().length; i++) {
						Lead lead = (Lead) qr.getRecords()[i];
						CRMLeadTOs.add(SalesforceWSDLTypeConversor
								.fromWSDL(lead));
					}
				else
					break;
				if (qr.isDone())
					break;
				else
					qr = binding.queryMore(qr.getQueryLocator());
			}
		} catch (Exception e) {
			throw new ServiceException(e);
		}

		return CRMLeadTOs;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.udc.mashup.crm.service.CRMService#findLeads(double, double,
	 *      java.lang.String)
	 */
	public List<CRMLeadTO> findLeads(double minAnnualRevenue,
			double maxAnnualRevenue, String state) {
		/* Prepare query setting batch size */
		QueryResult qr = null;
		QueryOptions qo = new QueryOptions();
		qo.setBatchSize(new Integer(10));
		binding.setHeader(new SforceServiceLocator().getServiceName()
				.getNamespaceURI(), "QueryOptions", qo);

		/* Set query */
		String query = "SELECT FirstName, LastName, Company, AnnualRevenue, Phone, Street,"
				+ " PostalCode, City, State, Country, CreatedDate FROM Lead WHERE AnnualRevenue >= "
				+ minAnnualRevenue + " AND State = '" + state + "'";
		if (maxAnnualRevenue != Double.MAX_VALUE)
			query += " AND AnnualRevenue < " + maxAnnualRevenue;

		List<CRMLeadTO> CRMLeadTOs = new ArrayList<CRMLeadTO>();

		try {
			qr = binding.query(query);
			while (true) {
				// process the query results
				if (qr.getRecords() != null)
					for (int i = 0; i < qr.getRecords().length; i++) {
						Lead lead = (Lead) qr.getRecords()[i];
						CRMLeadTOs.add(SalesforceWSDLTypeConversor
								.fromWSDL(lead));
					}
				else
					break;
				if (qr.isDone())
					break;
				else
					qr = binding.queryMore(qr.getQueryLocator());
			}
		} catch (Exception e) {
			throw new ServiceException(e);
		}

		return CRMLeadTOs;
	}

}
