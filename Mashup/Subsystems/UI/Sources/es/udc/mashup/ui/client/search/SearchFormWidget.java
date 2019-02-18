package es.udc.mashup.ui.client.search;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import es.udc.mashup.ui.client.util.ui.MessageDialogBox;

public class SearchFormWidget extends Composite implements ClickListener {

	public interface Listener {
		public void onSearch(String annualRevenueType, String state);
	}

	private Listener listener;

	private ListBox revenueListBox;

	private TextBox stateTextBox;

	private Button searchButton;

	public SearchFormWidget(Listener listener) {

		this.listener = listener;

		/* Create "revenueListBox". */
		revenueListBox = new ListBox();

		revenueListBox.addItem("High", RevenueTypeAsStringConstants.HIGH);
		revenueListBox.addItem("Medium", RevenueTypeAsStringConstants.MEDIUM);
		revenueListBox.addItem("Low", RevenueTypeAsStringConstants.LOW);

		/* Create "stateTextBox". */
		stateTextBox = new TextBox();

		stateTextBox.setMaxLength(50);
		stateTextBox.setVisibleLength(15);

		/* Create "searchButton". */
		searchButton = new Button("Search", this);

		/*
		 * Create an outer panel, add widgets to it, and initialize
		 * SearchFormWidget.
		 */
		HorizontalPanel outer = new HorizontalPanel();

		outer.add(new Label("Revenue: "));
		outer.add(revenueListBox);
		outer.add(new Label("State: "));
		outer.add(stateTextBox);
		outer.add(searchButton);

		initWidget(outer);

		/* Set CSS style name for this widget. */
		setStyleName("Mashup-SearchFormWidget");

	}

	public void onClick(Widget sender) {

		if (sender == searchButton) { // Currently only the search button can
										// fire a
			// click event.

			/* Get form data. */
			int selectedIndex = revenueListBox.getSelectedIndex();
			String annualRevenueType = revenueListBox.getValue(selectedIndex);
			String state = stateTextBox.getText().trim();

			/* Validate state has been typed. */
			if (state.length() == 0) {

				MessageDialogBox errorDialogBox = new MessageDialogBox("Error",
						"Please, specify 'state'");
				errorDialogBox.setPopupPosition(sender.getAbsoluteLeft() - 50,
						sender.getAbsoluteTop() + 40);
				errorDialogBox.show();

			} else {
				/* Generate event. */
				listener.onSearch(annualRevenueType, state);
			}

		}

	}

}
