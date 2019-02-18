package es.udc.mashup.ui.server.rss;

import es.udc.mashup.ui.server.rss.exception.RequiredElementsException;

public class Image implements Element {

	private String url;

	private String title;

	private String link;

	private String width;

	private String height;

	private String description;

	public Image(String url, String title, String link)
			throws RequiredElementsException {
		this(url, title, link, null, null, null);
	}

	public Image(String url, String title, String link, String width,
			String height, String description) throws RequiredElementsException {
		if ((url == null) || (title == null) || (link == null))
			throw new RequiredElementsException("url, title and link");
		this.url = url;
		this.title = title;
		this.link = link;
		this.width = width;
		this.height = height;
		this.description = description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @return the height
	 */
	public String getHeight() {
		return this.height;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return this.link;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return this.url;
	}

	/**
	 * @return the width
	 */
	public String getWidth() {
		return this.width;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(String height) {
		this.height = height;
	}

	/**
	 * @param link
	 *            the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public void setWidth(String width) {
		this.width = width;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String xml;
		xml = "<image>\n";
		xml += "\t<url>" + url + "</url>\n";
		xml += "\t<title>" + title + "</title>\n";
		xml += "\t<link>" + link + "</link>\n";
		if (width != null)
			xml += "\t<width>" + width + "</width>\n";
		if (height != null)
			xml += "\t<height>" + height + "</height>\n";
		if (description != null)
			xml += "\t<description>" + description + "</description>\n";
		xml += "</image>\n";

		return xml;
	}

}
