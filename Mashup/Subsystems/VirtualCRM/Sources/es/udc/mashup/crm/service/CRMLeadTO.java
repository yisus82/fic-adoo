package es.udc.mashup.crm.service;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CRMLeadTO implements Serializable {

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

	public CRMLeadTO() {

	}

	public CRMLeadTO(String firstName, String lastName, String company,
			double annualRevenue, String phone, String street,
			String postalCode, String city, String state, String country,
			Calendar insertionDate) {
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
		this.insertionDate = insertionDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj instanceof CRMLeadTO) {
			CRMLeadTO lead = (CRMLeadTO) obj;
			DateFormat dateFormat = new SimpleDateFormat(
					"EEE, d MMM yyyy HH:mm:ss z", Locale.ENGLISH);
			return ((lead.getAnnualRevenue() == this.annualRevenue)
					&& (lead.getCity().equals(this.city))
					&& (lead.getCompany().equals(this.company))
					&& (lead.getCountry().equals(this.country))
					&& (lead.getFirstName().equals(this.firstName))
					&& (dateFormat.format(lead.getInsertionDate().getTime())
							.equals(dateFormat.format(this.insertionDate
									.getTime())))
					&& (lead.getLastName().equals(this.lastName))
					&& (lead.getPhone().equals(this.phone))
					&& (lead.getPostalCode().equals(this.postalCode))
					&& (lead.getState().equals(this.state)) && (lead
					.getStreet().equals(this.street)));
		}

		return false;
	}

	public double getAnnualRevenue() {
		return this.annualRevenue;
	}

	public String getCity() {
		return this.city;
	}

	public String getCompany() {
		return this.company;
	}

	public String getCountry() {
		return this.country;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public Calendar getInsertionDate() {
		return this.insertionDate;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getPhone() {
		return this.phone;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public String getState() {
		return this.state;
	}

	public String getStreet() {
		return this.street;
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
		return "\nFirst Name: " + this.firstName + "\nLast Name: "
				+ this.lastName + "\nCompany: " + this.company
				+ "\nAnnual revenue: " + this.annualRevenue + "\nPhone: "
				+ this.phone + "\nStreet: " + this.street + "\nPostal Code: "
				+ this.postalCode + "\nCity :" + this.city + "\nState: "
				+ this.state + "\nCountry: " + this.country
				+ "\nInsertion date: "
				+ dateFormat.format(this.insertionDate.getTime());
	}

}
