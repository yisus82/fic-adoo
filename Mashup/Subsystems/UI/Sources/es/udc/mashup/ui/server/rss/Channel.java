package es.udc.mashup.ui.server.rss;

import java.util.List;

import es.udc.mashup.ui.server.rss.exception.RequiredElementsException;

public class Channel implements Element {

	/**
	 * The name of the channel
	 */
	private String title;

	/**
	 * The URL to the HTML website corresponding to the channel
	 */
	private String link;

	/**
	 * Phrase or sentence describing the channel
	 */
	private String description;

	/**
	 * The language the channel is written in
	 */
	private String language;

	/**
	 * Copyright notice for content in the channel
	 */
	private String copyright;

	/**
	 * Email address for person responsible for editorial content
	 */
	private String managingEditor;

	/**
	 * Email address for person responsible for technical issues relating to
	 * channel
	 */
	private String webmaster;

	/**
	 * The publication date for the content in the channel
	 */
	private String pubDate;

	/**
	 * The last time the content of the channel changed
	 */
	private String lastBuildDate;

	/**
	 * Specify one or more categories that the channel belongs to
	 */
	private List<Category> categories;

	/**
	 * A string indicating the program used to generate the channel
	 */
	private String generator;

	/**
	 * A URL that points to the documentation for the format used in the RSS
	 * file
	 */
	private String docs;

	/**
	 * Allows processes to register with a cloud to be notified of updates to
	 * the channel, implementing a lightweight publish-subscribe protocol for
	 * RSS feeds
	 */
	private Cloud cloud;

	/**
	 * ttl stands for 'time to live'. It's a number of minutes that indicates
	 * how long a channel can be cached before refreshing from the source
	 */
	private String ttl;

	/**
	 * Specifies a GIF, JPEG or PNG image that can be displayed with the channel
	 */
	private Image image;

	/**
	 * The PICS rating for the channel
	 */
	private String rating;

	/**
	 * Specifies a text input box that can be displayed with the channel
	 */
	private TextInput textInput;

	/**
	 * A hint for aggregators telling them which hours they can skip
	 */
	private String skipHours;

	/**
	 * A hint for aggregators telling them which days they can skip
	 */
	private String skipDays;

	private List<Item> items;

	public Channel(String title, String link, String description,
			List<Item> items) throws RequiredElementsException {
		this(title, link, description, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null,
				items);
	}

	public Channel(String title, String link, String description,
			String language, String copyright, String managingEditor,
			String webmaster, String pubDate, String lastBuildDate,
			List<Category> categories, String generator, String docs,
			Cloud cloud, String ttl, Image image, String rating,
			TextInput textInput, String skipHours, String skipDays,
			List<Item> items) throws RequiredElementsException {
		if ((title == null) || (link == null) || (description == null))
			throw new RequiredElementsException("title, link and description");
		this.title = title;
		this.link = link;
		this.description = description;
		this.language = language;
		this.copyright = copyright;
		this.managingEditor = managingEditor;
		this.webmaster = webmaster;
		this.pubDate = pubDate;
		this.lastBuildDate = lastBuildDate;
		this.categories = categories;
		this.generator = generator;
		this.docs = docs;
		this.cloud = cloud;
		this.ttl = ttl;
		this.image = image;
		this.rating = rating;
		this.textInput = textInput;
		this.skipHours = skipHours;
		this.skipDays = skipDays;
		this.items = items;
	}

	/**
	 * @return the categories
	 */
	public List<Category> getCategories() {
		return this.categories;
	}

	/**
	 * @return the cloud
	 */
	public Cloud getCloud() {
		return this.cloud;
	}

	/**
	 * @return the copyright
	 */
	public String getCopyright() {
		return this.copyright;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @return the docs
	 */
	public String getDocs() {
		return this.docs;
	}

	/**
	 * @return the generator
	 */
	public String getGenerator() {
		return this.generator;
	}

	/**
	 * @return the image
	 */
	public Image getImage() {
		return this.image;
	}

	/**
	 * @return the items
	 */
	public List<Item> getItems() {
		return this.items;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return this.language;
	}

	/**
	 * @return the lastBuildDate
	 */
	public String getLastBuildDate() {
		return this.lastBuildDate;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return this.link;
	}

	/**
	 * @return the managingEditor
	 */
	public String getManagingEditor() {
		return this.managingEditor;
	}

	/**
	 * @return the pubDate
	 */
	public String getPubDate() {
		return this.pubDate;
	}

	/**
	 * @return the rating
	 */
	public String getRating() {
		return this.rating;
	}

	/**
	 * @return the skipDays
	 */
	public String getSkipDays() {
		return this.skipDays;
	}

	/**
	 * @return the skipHours
	 */
	public String getSkipHours() {
		return this.skipHours;
	}

	/**
	 * @return the textInput
	 */
	public TextInput getTextInput() {
		return this.textInput;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * @return the ttl
	 */
	public String getTtl() {
		return this.ttl;
	}

	/**
	 * @return the webmaster
	 */
	public String getWebmaster() {
		return this.webmaster;
	}

	/**
	 * @param categories
	 *            the categories to set
	 */
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	/**
	 * @param cloud
	 *            the cloud to set
	 */
	public void setCloud(Cloud cloud) {
		this.cloud = cloud;
	}

	/**
	 * @param copyright
	 *            the copyright to set
	 */
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param docs
	 *            the docs to set
	 */
	public void setDocs(String docs) {
		this.docs = docs;
	}

	/**
	 * @param generator
	 *            the generator to set
	 */
	public void setGenerator(String generator) {
		this.generator = generator;
	}

	/**
	 * @param image
	 *            the image to set
	 */
	public void setImage(Image image) {
		this.image = image;
	}

	/**
	 * @param items
	 *            the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	/**
	 * @param language
	 *            the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @param lastBuildDate
	 *            the lastBuildDate to set
	 */
	public void setLastBuildDate(String lastBuildDate) {
		this.lastBuildDate = lastBuildDate;
	}

	/**
	 * @param link
	 *            the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @param managingEditor
	 *            the managingEditor to set
	 */
	public void setManagingEditor(String managingEditor) {
		this.managingEditor = managingEditor;
	}

	/**
	 * @param pubDate
	 *            the pubDate to set
	 */
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	/**
	 * @param rating
	 *            the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}

	/**
	 * @param skipDays
	 *            the skipDays to set
	 */
	public void setSkipDays(String skipDays) {
		this.skipDays = skipDays;
	}

	/**
	 * @param skipHours
	 *            the skipHours to set
	 */
	public void setSkipHours(String skipHours) {
		this.skipHours = skipHours;
	}

	/**
	 * @param textInput
	 *            the textInput to set
	 */
	public void setTextInput(TextInput textInput) {
		this.textInput = textInput;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param ttl
	 *            the ttl to set
	 */
	public void setTtl(String ttl) {
		this.ttl = ttl;
	}

	/**
	 * @param webmaster
	 *            the webmaster to set
	 */
	public void setWebmaster(String webmaster) {
		this.webmaster = webmaster;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String xml;
		xml = "<channel>\n";
		if (title != null)
			xml += "\t<title>" + title + "</title>\n";
		if (link != null)
			xml += "\t<link>" + link + "</link>\n";
		if (description != null)
			xml += "\t<description>" + description + "</description>\n";
		if (language != null)
			xml += "\t<language>" + language + "</language>\n";
		if (copyright != null)
			xml += "\t<copyright>" + copyright + "</copyright>\n";
		if (managingEditor != null)
			xml += "\t<managingEditor>" + managingEditor
					+ "</managingEditor>\n";
		if (webmaster != null)
			xml += "\t<webamster>" + webmaster + "</webmaster>\n";
		if (pubDate != null)
			xml += "\t<pubDate>" + pubDate + "</pubDate>\n";
		if (lastBuildDate != null)
			xml += "\t<lastBuildDate>" + lastBuildDate + "</lastBuildDate>\n";
		if (categories != null)
			for (Category category : categories) {
				if (category != null)
					xml += "\t" + category.toString();
			}
		if (generator != null)
			xml += "\t<generator>" + generator + "</generator>\n";
		if (docs != null)
			xml += "\t<docs>" + docs + "</docs>\n";
		if (cloud != null)
			xml += "\t" + cloud.toString();
		if (ttl != null)
			xml += "\t<ttl>" + ttl + "</ttl>\n";
		if (image != null)
			xml += "\t" + image.toString();
		if (rating != null)
			xml += "\t<rating>" + rating + "</rating>\n";
		if (textInput != null)
			xml += "\t" + textInput.toString();
		if (skipHours != null)
			xml += "\t<skipHours>" + skipHours + "</skipHours>\n";
		if (skipDays != null)
			xml += "\t<skipDays>" + skipDays + "</skipDays>\n";
		if (items != null)
			for (Item item : items) {
				xml += "\t" + item.toString();
			}
		xml += "</channel>\n";

		return xml;
	}

}
