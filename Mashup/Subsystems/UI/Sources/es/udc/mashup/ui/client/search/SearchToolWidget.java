package es.udc.mashup.ui.client.search;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;

import es.udc.mashup.ui.client.util.ui.StaticPagerWidget;
import es.udc.mashup.ui.client.virtualcrm.LeadJTO;
import es.udc.mashup.ui.client.virtualcrm.VirtualCRMServiceAsync;
import es.udc.mashup.ui.client.virtualcrm.VirtualCRMServiceAsyncLocator;

public class SearchToolWidget extends Composite implements
		SearchFormWidget.Listener, StaticPagerWidget.Listener {

	private final static String[] PAGER_COLUMN_NAMES = { "Revenue",
			"Last name", "First name" };

	private LeadJTOListener listener;

	private List currentResults;

	private StaticPagerWidget pagerWidget;

	public SearchToolWidget(int numberOfDataRows, LeadJTOListener listener) {

		this.listener = listener;
		currentResults = new ArrayList();

		/* Create widgets. */
		SearchFormWidget searchFormWidget = new SearchFormWidget(this);
		pagerWidget = new StaticPagerWidget(PAGER_COLUMN_NAMES,
				numberOfDataRows, this);

		/*
		 * Create an outer panel, add widgets to it, and initialize
		 * SearchToolWidget.
		 */
		VerticalPanel outer = new VerticalPanel();

		outer.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		outer.add(searchFormWidget);
		outer.add(pagerWidget);

		initWidget(outer);

		/* Set CSS style name for this widget. */
		setStyleName("Mashup-SearchToolWidget");

	}

	public void onSearch(String annualRevenueType, String state) {

		/* Clear current result list and set status bar. */
		pagerWidget.clearItems();
		pagerWidget.setInfoStatus("Searching...");

		/* Search. */
		VirtualCRMServiceAsync service = VirtualCRMServiceAsyncLocator
				.getVirtualCRMServiceAsync();

		service.findLeads(annualRevenueType, state, new AsyncCallback() {

			public void onSuccess(Object result) {
				currentResults = (List) result;
				pagerWidget.setItems(toPagerItems(currentResults));

				if (currentResults.size() == 0) {
					pagerWidget.setInfoStatus("No results found.");
					listener.onNoLeadJTOSelected();
				}
			}

			public void onFailure(Throwable caught) {
				currentResults = new ArrayList();
				pagerWidget.setErrorStatus("Internal error. Please, retry.");
				listener.onNoLeadJTOSelected();
			}

		});

	}

	public void onItemSelected(int itemNumber) {
		listener.onLeadJTOSelected((LeadJTO) currentResults.get(itemNumber));
	}

	private String[][] toPagerItems(List results) {

		if (results.size() == 0) {
			return new String[0][0];
		}

		String[][] items = new String[results.size()][PAGER_COLUMN_NAMES.length];
		Iterator iterator = results.iterator();
		int row = 0;

		while (iterator.hasNext()) {

			LeadJTO leadJTO = (LeadJTO) iterator.next();

			items[row][0] = leadJTO.getAnnualRevenue() + "";
			items[row][1] = leadJTO.getLastName();
			items[row][2] = leadJTO.getFirstName();

			row++;

		}

		return items;

	}

}
