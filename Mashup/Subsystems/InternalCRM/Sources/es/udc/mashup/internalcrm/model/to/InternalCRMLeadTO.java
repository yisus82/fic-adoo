package es.udc.mashup.internalcrm.model.to;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class InternalCRMLeadTO implements Serializable {

	private String name;

	private String company;

	private double annualRevenue;

	private String phone;

	private String street;

	private String postalCode;

	private String city;

	private String state;

	private String country;

	private Calendar insertionDate;

	public InternalCRMLeadTO() {

	}

	public InternalCRMLeadTO(String name, String company, double annualRevenue,
			String phone, String street, String postalCode, String city,
			String state, String country, Calendar insertionDate) {
		this.name = name;
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

		if (obj instanceof InternalCRMLeadTO) {
			InternalCRMLeadTO lead = (InternalCRMLeadTO) obj;
			DateFormat dateFormat = new SimpleDateFormat(
					"EEE, d MMM yyyy HH:mm:ss z", Locale.ENGLISH);
			return ((lead.getAnnualRevenue() == this.annualRevenue)
					&& (lead.getCity().equals(this.city))
					&& (lead.getCompany().equals(this.company))
					&& (lead.getCountry().equals(this.country))
					&& (dateFormat.format(lead.getInsertionDate().getTime())
							.equals(dateFormat.format(this.insertionDate
									.getTime())))
					&& (lead.getName().equals(this.name))
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

	public Calendar getInsertionDate() {
		return this.insertionDate;
	}

	public String getName() {
		return this.name;
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
		return "\nName: " + this.name + "\nCompany: " + this.company
				+ "\nAnnual revenue: " + this.annualRevenue + "\nPhone: "
				+ this.phone + "\nStreet: " + this.street + "\nPostal Code: "
				+ this.postalCode + "\nCity :" + this.city + "\nState: "
				+ this.state + "\nCountry: " + this.country
				+ "\nInsertion date: "
				+ dateFormat.format(this.insertionDate.getTime());
	}

}
