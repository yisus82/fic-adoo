package es.udc.mashup.ui.server.rss.exception;

public class RequiredAttributesException extends RSSException {

	public RequiredAttributesException(String attributes) {
		super("The following attributes are required: " + attributes);
	}

}
