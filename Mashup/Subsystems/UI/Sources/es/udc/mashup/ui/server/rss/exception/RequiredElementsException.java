package es.udc.mashup.ui.server.rss.exception;

public class RequiredElementsException extends RSSException {

	public RequiredElementsException(String elements) {
		super("The following elements are required: " + elements);
	}

}
