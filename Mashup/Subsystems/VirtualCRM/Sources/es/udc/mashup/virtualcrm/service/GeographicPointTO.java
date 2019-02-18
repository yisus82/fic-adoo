package es.udc.mashup.virtualcrm.service;

public class GeographicPointTO {

	private double latitude;

	private double longitude;

	public GeographicPointTO(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GeographicPoint (" + this.latitude + ", " + this.longitude
				+ ")";
	}

}
