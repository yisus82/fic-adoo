package es.udc.mashup.ui.server.rss;

import es.udc.mashup.ui.server.rss.exception.RequiredAttributesException;
import es.udc.mashup.ui.server.rss.exception.RequiredElementsException;

public class Cloud implements Element {

	private String domain;

	private String port;

	private String path;

	private String registerProcedure;

	private String protocol;

	public Cloud(String domain, String port, String path,
			String registerProcedure, String protocol)
			throws RequiredElementsException, RequiredAttributesException {
		if ((domain == null) || (port == null) || (path == null)
				|| (registerProcedure == null) || (protocol == null))
			throw new RequiredAttributesException(
					"domain, port, path, registerProcedure and protocol");
		this.domain = domain;
		this.port = port;
		this.path = path;
		this.registerProcedure = registerProcedure;
		this.protocol = protocol;
	}

	/**
	 * @return the domain
	 */
	public String getDomain() {
		return this.domain;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return this.path;
	}

	/**
	 * @return the port
	 */
	public String getPort() {
		return this.port;
	}

	/**
	 * @return the protocol
	 */
	public String getProtocol() {
		return this.protocol;
	}

	/**
	 * @return the registerProcedure
	 */
	public String getRegisterProcedure() {
		return this.registerProcedure;
	}

	/**
	 * @param domain
	 *            the domain to set
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * @param path
	 *            the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @param port
	 *            the port to set
	 */
	public void setPort(String port) {
		this.port = port;
	}

	/**
	 * @param protocol
	 *            the protocol to set
	 */
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	/**
	 * @param registerProcedure
	 *            the registerProcedure to set
	 */
	public void setRegisterProcedure(String registerProcedure) {
		this.registerProcedure = registerProcedure;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "<cloud domain='" + domain + "' port='" + port + "' path='"
				+ path + "' registerProcedure='" + registerProcedure
				+ "' protocol='" + protocol + "' />\n";
	}

}
