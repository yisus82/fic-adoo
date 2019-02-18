package es.udc.mashup.ui.server.rss.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.udc.mashup.ui.server.rss.Channel;
import es.udc.mashup.ui.server.rss.Item;
import es.udc.mashup.ui.server.rss.RSS;
import es.udc.mashup.ui.server.rss.exception.RSSException;
import es.udc.mashup.ui.server.rss.util.LastLeadsItemConversor;
import es.udc.mashup.ui.server.rss.xml.RSSXMLConversor;
import es.udc.mashup.virtualcrm.service.LeadTO;
import es.udc.mashup.virtualcrm.service.VirtualCRMServiceFactory;

public class LastLeadsRSSServlet extends HttpServlet {

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Calendar startDate = Calendar.getInstance();
		Calendar endDate = Calendar.getInstance();
		startDate.add(Calendar.DAY_OF_YEAR, -1);
		List<LeadTO> leadTOs;
		leadTOs = VirtualCRMServiceFactory.getVirtualCRMService()
				.findLastLeads(startDate, endDate);

		RSS rss;
		Channel channel;
		List<Item> items = new ArrayList<Item>();

		try {
			items = LastLeadsItemConversor.toItems(leadTOs);
			channel = new Channel(
					"Last potential clients",
					"http://localhost:8080/Mashup/LastLeadsRSS",
					"Information about the leads inserted in the CRM within the last 24 hours",
					items);
			rss = new RSS(channel);
		} catch (RSSException e) {
			throw new ServletException(e);
		}

		/* Generate response. */
		ServletUtils.writeServiceResponse(RSSXMLConversor.toXML(rss), response);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
