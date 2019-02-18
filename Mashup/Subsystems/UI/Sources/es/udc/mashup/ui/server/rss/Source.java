package es.udc.mashup.ui.server.rss;

import es.udc.mashup.ui.server.rss.exception.EmptyElementException;
import es.udc.mashup.ui.server.rss.exception.RequiredAttributesException;

public class Source implements Element {

	private String source;

	private String url;

	public Source(String source, String url) throws EmptyElementException,
			RequiredAttributesException {
		if (source == null)
			throw new EmptyElementException("source");
		if (url == null)
			throw new RequiredAttributesException("url");
		this.source = source;
		this.url = url;
	}

	/**
	 * @return the source
	 */
	public String getSource() {
		return this.source;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return this.url;
	}

	/**
	 * @param source
	 *            the source to set
	 */
	public void setSource(String source) {
		this.source = source;
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
		return "<source url='" + url + "'>" + source + "</source>\n";
	}

}
