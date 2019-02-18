package es.udc.mashup.ui.client.util.ui;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

class PagerButtonsWidget extends Composite implements ClickListener {

	public interface Listener {
		public void onPrevious();

		public void onNext();
	}

	private Listener listener;

	private Label status;

	private Button previousButton;

	private Button nextButton;

	public PagerButtonsWidget(Listener listener) {

		/* Set listener. */
		this.listener = listener;

		/* Create widgets. */
		status = new Label();
		previousButton = new Button("&lt;&lt;", this);
		nextButton = new Button("&gt;&gt;", this);

		previousButton.setEnabled(false);
		nextButton.setEnabled(false);

		/*
		 * Create an outer panel, add widgets to it, and initialize
		 * PagerButtonsWidget.
		 */
		DockPanel outer = new DockPanel();
		HorizontalPanel buttons = new HorizontalPanel();

		buttons.add(previousButton);
		buttons.add(nextButton);
		outer.add(buttons, DockPanel.EAST);
		outer.setCellHorizontalAlignment(buttons,
				HasHorizontalAlignment.ALIGN_RIGHT);
		outer.add(status, DockPanel.CENTER);
		outer.setCellVerticalAlignment(status,
				HasVerticalAlignment.ALIGN_MIDDLE);
		outer.setCellWidth(status, "100%");

		initWidget(outer);

		/* Set CSS style name for this widget. */
		setStyleName("Mashup-PagerButtonsWidget");

	}

	public void setInfoStatus(String text) {
		status.setStyleName("InfoStatus");
		status.setText(text);
	}

	public void setErrorStatus(String text) {
		status.setStyleName("ErrorStatus");
		status.setText(text);
	}

	public void setPreviousButtonEnabled(boolean enabled) {
		previousButton.setEnabled(enabled);
	}

	public void setNextButtonEnabled(boolean enabled) {
		nextButton.setEnabled(enabled);
	}

	public void onClick(Widget sender) {

		if (sender == previousButton) {
			listener.onPrevious();
		} else if (sender == nextButton) {
			listener.onNext();
		}

	}

}
