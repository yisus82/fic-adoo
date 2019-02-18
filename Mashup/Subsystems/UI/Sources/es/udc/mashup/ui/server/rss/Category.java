package es.udc.mashup.ui.server.rss;

import es.udc.mashup.ui.server.rss.exception.EmptyElementException;

public class Category implements Element {

	private String category;

	private String domain;

	public Category(String category) throws EmptyElementException {
		this(category, null);
	}

	public Category(String category, String domain)
			throws EmptyElementException {
		if (category == null)
			throw new EmptyElementException("category");
		this.category = category;
		this.domain = domain;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return this.category;
	}

	/**
	 * @return the domain
	 */
	public String getDomain() {
		return this.domain;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @param domain
	 *            the domain to set
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String xml;
		xml = "<category";
		if (domain != null)
			xml += "domain='" + domain + "'>";
		else
			xml += ">";
		xml += category + "</category>\n";

		return xml;
	}

}
