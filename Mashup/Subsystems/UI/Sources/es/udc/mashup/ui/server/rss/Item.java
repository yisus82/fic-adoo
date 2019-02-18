package es.udc.mashup.ui.server.rss;

import java.util.List;

import es.udc.mashup.ui.server.rss.exception.RequiredElementsException;

public class Item implements Element {

	/**
	 * The title of the item
	 */
	private String title;

	/**
	 * The item synopsis
	 */
	private String description;

	/**
	 * The URL of the item
	 */
	private String link;

	/**
	 * Email address of the author of the item
	 */
	private String author;

	/**
	 * Includes the item in one or more categories
	 */
	private List<Category> categories;

	/**
	 * URL of a page for comments relating to the item
	 */
	private String comments;

	/**
	 * Describes a media object that is attached to the item
	 */
	private Enclosure enclosure;

	/**
	 * A string that uniquely identifies the item
	 */
	private String guid;

	/**
	 * Indicates when the item was published
	 */
	private String pubDate;

	/**
	 * The RSS channel that the item came from
	 */
	private Source source;

	public Item(String title, String description)
			throws RequiredElementsException {
		this(title, description, null, null, null, null, null, null, null, null);
	}

	public Item(String title, String description, String link, String author,
			List<Category> categories, String comments, Enclosure enclosure,
			String guid, String pubDate, Source source)
			throws RequiredElementsException {
		if ((title == null) && (description == null))
			throw new RequiredElementsException("title or description");
		this.title = title;
		this.description = description;
		this.link = link;
		this.author = author;
		this.categories = categories;
		this.comments = comments;
		this.enclosure = enclosure;
		this.guid = guid;
		this.pubDate = pubDate;
		this.source = source;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return this.author;
	}

	/**
	 * @return the categories
	 */
	public List<Category> getCategories() {
		return this.categories;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return this.comments;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @return the enclosure
	 */
	public Enclosure getEnclosure() {
		return this.enclosure;
	}

	/**
	 * @return the guid
	 */
	public String getGuid() {
		return this.guid;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return this.link;
	}

	/**
	 * @return the pubDate
	 */
	public String getPubDate() {
		return this.pubDate;
	}

	/**
	 * @return the source
	 */
	public Source getSource() {
		return this.source;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @param categories
	 *            the categories to set
	 */
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	/**
	 * @param comments
	 *            the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param enclosure
	 *            the enclosure to set
	 */
	public void setEnclosure(Enclosure enclosure) {
		this.enclosure = enclosure;
	}

	/**
	 * @param guid
	 *            the guid to set
	 */
	public void setGuid(String guid) {
		this.guid = guid;
	}

	/**
	 * @param link
	 *            the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @param pubDate
	 *            the pubDate to set
	 */
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	/**
	 * @param source
	 *            the source to set
	 */
	public void setSource(Source source) {
		this.source = source;
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
		xml = "<item>\n";
		if (title != null)
			xml += "\t<title>" + title + "</title>\n";
		if (link != null)
			xml += "\t<link>" + link + "</link>\n";
		if (description != null)
			xml += "\t<description>" + description + "</description>\n";
		if (author != null)
			xml += "\t<author>" + author + "</author>\n";
		if (categories != null)
			for (Category category : categories) {
				if (category != null)
					xml += "\t" + category.toString();
			}
		if (comments != null)
			xml += "\t<comments>" + comments + "</comments>\n";
		if (enclosure != null)
			xml += "\t" + enclosure.toString();
		if (guid != null)
			xml += "\t<guid>" + guid + "</guid>\n";
		if (pubDate != null)
			xml += "\t<pubDate>" + pubDate + "</pubDate>\n";
		if (source != null)
			xml += "\t" + source.toString();
		xml += "</item>\n";

		return xml;
	}

}
