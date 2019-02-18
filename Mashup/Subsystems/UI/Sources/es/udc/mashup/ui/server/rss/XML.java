package es.udc.mashup.ui.server.rss;

import es.udc.mashup.ui.server.rss.exception.RootElementException;

public class XML {

	private String version;

	private String encoding;

	private RootElement rootElement;

	public XML(RootElement rootElement) throws RootElementException {
		this(null, null, rootElement);
	}

	public XML(String encoding, RootElement rootElement)
			throws RootElementException {
		this(null, encoding, rootElement);
	}

	public XML(String version, String encoding, RootElement rootElement)
			throws RootElementException {
		if (version == null)
			this.version = "1.0";
		else
			this.version = version;
		if (encoding == null)
			this.encoding = "UTF-8";
		else
			this.encoding = encoding;
		if (rootElement == null)
			throw new RootElementException();
		this.rootElement = rootElement;
	}

	/**
	 * @return the encoding
	 */
	public String getEncoding() {
		return this.encoding;
	}

	/**
	 * @return the rootElement
	 */
	public RootElement getRootElement() {
		return this.rootElement;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return this.version;
	}

	/**
	 * @param encoding
	 *            the encoding to set
	 */
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	/**
	 * @param rootElement
	 *            the rootElement to set
	 */
	public void setRootElement(RootElement rootElement) {
		this.rootElement = rootElement;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "<?xml version='" + version + "' encoding='" + encoding
				+ "' ?>\n\n" + rootElement.toString();
	}

}
