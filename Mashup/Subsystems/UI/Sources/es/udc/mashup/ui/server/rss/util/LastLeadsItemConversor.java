package es.udc.mashup.ui.server.rss.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import es.udc.mashup.ui.server.rss.Item;
import es.udc.mashup.ui.server.rss.exception.RSSException;
import es.udc.mashup.virtualcrm.service.LeadTO;

public class LastLeadsItemConversor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.udc.mashup.ui.server.rss.util.LeadItemConversor#toItems(es.udc.mashup.virtualcrm.service.LeadTO)
	 */
	public final static List<Item> toItems(List<LeadTO> leadTOs)
			throws RSSException {
		List<Item> items = new ArrayList<Item>();

		for (LeadTO leadTO : leadTOs) {
			items.add(toItem(leadTO));
		}

		return items;
	}

	private final static Item toItem(LeadTO leadTO) throws RSSException {
		String title = leadTO.getFirstName() + " " + leadTO.getLastName()
				+ " - " + leadTO.getCompany();
		String description = "annualRevenue: " + leadTO.getAnnualRevenue()
				+ " - phone: " + leadTO.getPhone() + " - street: "
				+ leadTO.getStreet() + " - postalCode: "
				+ leadTO.getPostalCode() + " - city: " + leadTO.getCity()
				+ " - state: " + leadTO.getState() + " - country: "
				+ leadTO.getCountry() + " - geographicPoint: "
				+ leadTO.getGeographicPointTO();
		DateFormat dateFormat = new SimpleDateFormat(
				"EEE, d MMM yyyy HH:mm:ss z", Locale.ENGLISH);
		String pubDate = dateFormat.format(leadTO.getInsertionDate().getTime());
		Item item = null;

		item = new Item(title, description, null, null, null, null, null, null,
				pubDate, null);

		return item;
	}

}
