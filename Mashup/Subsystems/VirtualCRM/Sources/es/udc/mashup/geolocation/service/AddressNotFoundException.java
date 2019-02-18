package es.udc.mashup.geolocation.service;

public class AddressNotFoundException extends Exception {

	public AddressNotFoundException() {
		super("Address not found.");
	}

}
