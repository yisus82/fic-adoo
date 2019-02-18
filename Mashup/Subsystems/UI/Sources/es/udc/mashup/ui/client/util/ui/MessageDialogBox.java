package es.udc.mashup.ui.client.util.ui;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class MessageDialogBox extends DialogBox {

	public MessageDialogBox(String caption, String message) {

		super();

		/* Set caption. */
		setText(caption);

		/* Construct mesage label and OK button. */
		Label messageLabel = new Label(message);
		Button okButton = new Button("OK");

		okButton.addClickListener(new ClickListener() {
			public void onClick(Widget sender) {
				MessageDialogBox.this.hide();
			}
		});

		/* Insert them in a vertical panel. */
		VerticalPanel outer = new VerticalPanel();

		outer.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		outer.add(messageLabel);
		outer.add(okButton);

		/* Set widget. */
		setWidget(outer);

		/* Set CSS style name. */
		setStyleName("Mashup-MessageDialogBox");
	}

}
