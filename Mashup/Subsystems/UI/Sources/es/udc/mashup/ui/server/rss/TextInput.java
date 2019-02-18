package es.udc.mashup.ui.server.rss;

import es.udc.mashup.ui.server.rss.exception.RequiredElementsException;

public class TextInput implements Element {

	private String title;

	private String description;

	private String name;

	private String link;

	public TextInput(String title, String description, String name, String link)
			throws RequiredElementsException {
		if ((title == null) || (description == null) || (name == null)
				|| (link == null))
			throw new RequiredElementsException(
					"title, name, description and link");
		this.title = title;
		this.description = description;
		this.name = name;
		this.link = link;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return this.link;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param link
	 *            the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String xml;
		xml = "<textInput>\n";
		xml += "\t<title>" + title + "</title>\n";
		xml += "\t<description>" + description + "</description>\n";
		xml += "\t<name>" + name + "</name>\n";
		xml += "\t<link>" + link + "</link>\n";
		xml += "</textInput>\n";

		return xml;
	}

}
