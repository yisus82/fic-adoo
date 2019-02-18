package es.udc.mashup.ui.client.virtualcrm;

import com.google.gwt.user.client.rpc.IsSerializable;

public class LeadJTO implements IsSerializable {

	private String firstName;

	private String lastName;

	private String company;

	private double annualRevenue;

	private String phone;

	private String street;

	private String postalCode;

	private String city;

	private String state;

	private String country;

	private GeographicPointJTO geographicPointJTO;

	/**
	 * Required for serialization.
	 */
	public LeadJTO() {
	}

	/**
	 * @param geographicPointJTO
	 *            it may be <code>null</code>
	 */
	public LeadJTO(String firstName, String lastName, String company,
			double annualRevenue, String phone, String street,
			String postalCode, String city, String state, String country,
			GeographicPointJTO geographicPointJTO) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		this.annualRevenue = annualRevenue;
		this.phone = phone;
		this.street = street;
		this.postalCode = postalCode;
		this.city = city;
		this.state = state;
		this.country = country;
		this.geographicPointJTO = geographicPointJTO;

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCompany() {
		return company;
	}

	public double getAnnualRevenue() {
		return annualRevenue;
	}

	public String getPhone() {
		return phone;
	}

	public String getStreet() {
		return street;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public GeographicPointJTO getGeographicPointJTO() {
		return geographicPointJTO;
	}

}
