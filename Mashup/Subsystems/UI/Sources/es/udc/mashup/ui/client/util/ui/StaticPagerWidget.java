package es.udc.mashup.ui.client.util.ui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;

public class StaticPagerWidget extends Composite implements
		PagerListWidget.Listener, PagerButtonsWidget.Listener {

	public interface Listener {
		public void onItemSelected(int itemNumber);
	}

	private int numberOfDataRows;

	private Listener listener;

	private String[][] items;

	private int startIndex;

	private PagerButtonsWidget pagerButtonsWidget;

	private PagerListWidget pagerListWidget;

	public StaticPagerWidget(String[] columnNames, int numberOfDataRows,
			Listener listener) {

		this.numberOfDataRows = numberOfDataRows;
		this.listener = listener;
		items = new String[0][0];
		startIndex = 0;

		/* Create widgets. */
		pagerButtonsWidget = new PagerButtonsWidget(this);
		pagerListWidget = new PagerListWidget(columnNames, numberOfDataRows,
				this);

		/* Create an outer panel, add widgets to it, and initialize PagerWidget. */
		VerticalPanel outer = new VerticalPanel();

		outer.add(pagerListWidget);
		outer.add(pagerButtonsWidget);

		initWidget(outer);

		/* Set CSS style name for this widget. */
		setStyleName("Mashup-StaticPagerWidget");

	}

	public void setItems(String[][] items) {

		/* Update state. */
		this.items = items;
		startIndex = 0;

		/* Update buttons. */
		boolean existMoreItems = items.length > numberOfDataRows;

		pagerButtonsWidget.setPreviousButtonEnabled(false);
		pagerButtonsWidget.setNextButtonEnabled(existMoreItems);

		/* Show list. */
		pagerListWidget.setList(items, startIndex);

		/* Set status bar. */
		if (items.length > 0) {
			setIndexStatus();
		}

	}

	public void setInfoStatus(String info) {
		pagerButtonsWidget.setInfoStatus(info);
	}

	public void setErrorStatus(String info) {
		pagerButtonsWidget.setErrorStatus(info);
	}

	public void clearItems() {

		items = new String[0][0];
		startIndex = 0;

		pagerListWidget.clearList();
		pagerButtonsWidget.setPreviousButtonEnabled(false);
		pagerButtonsWidget.setNextButtonEnabled(false);

	}

	public void onPrevious() {

		/* Update startIndex. */
		startIndex = startIndex - numberOfDataRows;

		/* Update buttons. */
		pagerButtonsWidget.setNextButtonEnabled(true);
		if (startIndex == 0) {
			pagerButtonsWidget.setPreviousButtonEnabled(false);
		}

		/* Show list. */
		pagerListWidget.setList(items, startIndex);

		/* Set status bar. */
		setIndexStatus();

	}

	public void onNext() {

		/* Update startIndex. */
		startIndex = startIndex + numberOfDataRows;

		/* Update buttons. */
		boolean existMoreItems = (startIndex + numberOfDataRows) < items.length;

		pagerButtonsWidget.setPreviousButtonEnabled(true);
		if (!existMoreItems) {
			pagerButtonsWidget.setNextButtonEnabled(false);
		}

		/* Show list. */
		pagerListWidget.setList(items, startIndex);

		/* Set status bar. */
		setIndexStatus();

	}

	public void onDataRowClicked(int row) {
		listener.onItemSelected(startIndex + row);
	}

	private void setIndexStatus() {

		boolean existMoreItems = (startIndex + numberOfDataRows) < items.length;
		String info;

		if (existMoreItems) {
			info = (startIndex + 1) + "-" + (startIndex + numberOfDataRows);
		} else {
			info = (startIndex + 1) + "-" + items.length;
		}

		setInfoStatus(info);

	}

}
