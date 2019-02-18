package es.udc.mashup.ui.server.rss;

import es.udc.mashup.ui.server.rss.exception.RequiredElementsException;

public class RSS implements RootElement {

	private String version;

	private Channel channel;

	public RSS(Channel channel) throws RequiredElementsException {
		this(null, channel);
	}

	public RSS(String version, Channel channel)
			throws RequiredElementsException {
		if (version == null)
			this.version = "2.0";
		else
			this.version = version;
		if (channel == null)
			throw new RequiredElementsException("channel");
		this.channel = channel;
	}

	/**
	 * @return the channel
	 */
	public Channel getChannel() {
		return this.channel;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return this.version;
	}

	/**
	 * @param channel
	 *            the channel to set
	 */
	public void setChannel(Channel channel) {
		this.channel = channel;
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
		String xml;
		xml = "<rss version='" + version + "'>\n";
		xml += "\t" + channel.toString();
		xml += "</rss>\n";

		return xml;
	}

}
