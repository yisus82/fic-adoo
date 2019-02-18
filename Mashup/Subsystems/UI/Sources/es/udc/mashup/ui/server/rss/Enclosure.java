package es.udc.mashup.ui.server.rss;

import es.udc.mashup.ui.server.rss.exception.RequiredAttributesException;

public class Enclosure implements Element {

	private String url;

	private String length;

	private String type;

	public Enclosure(String url, String length, String type)
			throws RequiredAttributesException {
		if ((url == null) || (length == null) || (type == null))
			throw new RequiredAttributesException("url, length, type");
		this.url = url;
		this.length = length;
		this.type = type;
	}

	/**
	 * @return the length
	 */
	public String getLength() {
		return this.length;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return this.url;
	}

	/**
	 * @param length
	 *            the length to set
	 */
	public void setLength(String length) {
		this.length = length;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "<enclosure url='" + url + "' length='" + length + "' type='"
				+ type + "' />\n";
	}

}
