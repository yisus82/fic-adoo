package es.udc.mashup.ui.client.search;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class TopPanel implements EntryPoint {

	private final static String MAP_HEIGHT = "450";

	private final static String MAP_WIDTH = "450";

	private final static int NUMBER_OF_DATA_ROWS = 10;

	public void onModuleLoad() {

		/* Create widgets. */
		MapWidget mapWidget = new MapWidget(MAP_HEIGHT, MAP_WIDTH);
		SearchToolWidget searchToolWidget = new SearchToolWidget(
				NUMBER_OF_DATA_ROWS, mapWidget);

		/*
		 * Create an outer panel, add widgets to it, and initialize
		 * SearchWidget.
		 */
		HorizontalPanel outer = new HorizontalPanel();

		outer.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		outer.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		outer.add(mapWidget);
		outer.add(searchToolWidget);

		/* Add widgets to the root panel. */
		RootPanel.get("content").add(outer);

	}

}
