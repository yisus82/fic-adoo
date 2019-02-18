package es.udc.mashup.virtualcrm.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LeadTO {

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

	private Calendar insertionDate;

	private GeographicPointTO geographicPointTO;

	/**
	 * @param geographicPointTO
	 *            it may take the <code>null</code> value
	 */
	public LeadTO(String firstName, String lastName, String company,
			double annualRevenue, String phone, String street,
			String postalCode, String city, String state, String country,
			Calendar insertionDate, GeographicPointTO geographicPointTO) {

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
		this.geographicPointTO = geographicPointTO;
		this.insertionDate = insertionDate;

	}

	public double getAnnualRevenue() {
		return annualRevenue;
	}

	public String getCity() {
		return city;
	}

	public String getCompany() {
		return company;
	}

	public String getCountry() {
		return country;
	}

	public String getFirstName() {
		return firstName;
	}

	public GeographicPointTO getGeographicPointTO() {
		return geographicPointTO;
	}

	public Calendar getInsertionDate() {
		return insertionDate;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getState() {
		return state;
	}

	public String getStreet() {
		return street;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		DateFormat dateFormat = new SimpleDateFormat(
				"EEE, d MMM yyyy HH:mm:ss z", Locale.ENGLISH);
		return ("\nFirst name: " + this.firstName + "\nLast name: "
				+ this.lastName + "\nCompany: " + this.company
				+ "\nAnnual revenue: " + this.annualRevenue + "\nPhone: "
				+ phone + "\nStreet: " + this.street + "\nPostal Code: "
				+ this.postalCode + "\nCity :" + this.city + "\nState: "
				+ this.state + "\nCountry: " + this.country
				+ "\nInsertion date: "
				+ dateFormat.format(this.insertionDate.getTime())
				+ "\nGeographic Point: " + this.geographicPointTO);
	}

}
