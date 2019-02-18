package es.udc.mashup.ui.server.rss.exception;

public class EmptyElementException extends RSSException {

	public EmptyElementException(String element) {
		super("The element " + element + " cannot be empty");
	}

}
