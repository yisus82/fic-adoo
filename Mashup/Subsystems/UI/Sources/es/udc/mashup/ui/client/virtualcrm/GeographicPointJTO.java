package es.udc.mashup.ui.client.virtualcrm;

import com.google.gwt.user.client.rpc.IsSerializable;

public class GeographicPointJTO implements IsSerializable {

	private double latitude;

	private double longitude;

	/**
	 * Required for serialization.
	 */
	public GeographicPointJTO() {
	}

	public GeographicPointJTO(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

}
