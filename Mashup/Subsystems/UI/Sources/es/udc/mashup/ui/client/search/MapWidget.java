package es.udc.mashup.ui.client.search;

import com.google.gwt.user.client.ui.Composite;
import com.mapitz.gwt.googleMaps.client.GControl;
import com.mapitz.gwt.googleMaps.client.GLatLng;
import com.mapitz.gwt.googleMaps.client.GMap2;
import com.mapitz.gwt.googleMaps.client.GMap2Widget;

import es.udc.mashup.ui.client.virtualcrm.GeographicPointJTO;
import es.udc.mashup.ui.client.virtualcrm.LeadJTO;

public class MapWidget extends Composite implements LeadJTOListener {

	private final static int ZOOM_LEVEL_DETAIL = 13;

	private final static int ZOOM_LEVEL_OVERVIEW = 1;

	private GMap2 gMap2;

	MapWidget(String height, String width) {

		/* Create a GMap2Widget and initialize MapWidget. */
		GMap2Widget gMap2Widget = new GMap2Widget(height, width);

		initWidget(gMap2Widget);

		/* Instantiate the GMap2, add controls, and set zoom level. */
		gMap2 = gMap2Widget.getGmap();

		gMap2.addControl(GControl.GLargeMapControl());
		gMap2.addControl(GControl.GMapTypeControl());
		gMap2.setZoom(ZOOM_LEVEL_OVERVIEW);

		/* Set CSS style name for this widget. */
		setStyleName("Mashup-MapWidget");

	}

	public void onLeadJTOSelected(LeadJTO leadJTO) {

		/* Show info window. */
		GeographicPointJTO geographicPointJTO = leadJTO.getGeographicPointJTO();
		GLatLng point;

		if (geographicPointJTO == null) {
			// point = GLatLng.create(0, 0);
			point = new GLatLng(0, 0);
			gMap2.setCenter(point, ZOOM_LEVEL_OVERVIEW);
		} else {
			// point = GLatLng.create(geographicPointJTO.getLatitude(),
			// geographicPointJTO.getLongitude());
			point = new GLatLng(geographicPointJTO.getLatitude(),
					geographicPointJTO.getLongitude());
			gMap2.setCenter(point, ZOOM_LEVEL_DETAIL);
		}

		gMap2.openInfoWindowHtml(point, getLeadJTOHTML(leadJTO));

	}

	public void onNoLeadJTOSelected() {
		gMap2.closeInfoWindow();
		gMap2.setZoom(ZOOM_LEVEL_OVERVIEW);
	}

	private String getLeadJTOHTML(LeadJTO leadJTO) {

		String html;

		/* NOTE: Using CSS style classes would be better. */
		html = leadJTO.getFirstName() + ' ' + leadJTO.getLastName() + "<br/>"
				+ leadJTO.getCompany() + " (annual revenue: "
				+ leadJTO.getAnnualRevenue() + ") <br/>" + "Phone: "
				+ leadJTO.getPhone() + "<br/>" + leadJTO.getStreet() + ", "
				+ leadJTO.getPostalCode() + "<br/> " + leadJTO.getCity() + ", "
				+ leadJTO.getState() + "<br/>" + leadJTO.getCountry();

		if (leadJTO.getGeographicPointJTO() == null) {
			html += "<div class='Mashup-WarningText'> Position not available in map</div>";
		}

		return html;

	}

}
