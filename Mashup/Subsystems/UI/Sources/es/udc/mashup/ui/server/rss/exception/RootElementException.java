package es.udc.mashup.ui.server.rss.exception;

public class RootElementException extends RSSException {

	public RootElementException() {
		super("The XML must have one root element");
	}

}
