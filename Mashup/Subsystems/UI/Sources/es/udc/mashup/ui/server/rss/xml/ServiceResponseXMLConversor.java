package es.udc.mashup.ui.server.rss.xml;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.jdom.DataConversionException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import es.udc.ws.util.exceptions.ParsingException;

public class ServiceResponseXMLConversor {

	public final static ServiceResponse toServiceResponse(InputStream in)
			throws ParsingException {

		try {

			SAXBuilder builder = new SAXBuilder();
			Document document = builder.build(in);
			Element responseElement = document.getRootElement();

			return toServiceResponse(responseElement);

		} catch (Exception e) {
			throw new ParsingException("Error deserializing instance of "
					+ ServiceResponse.class, e);
		}

	}

	public final static void toXML(ServiceResponse response, OutputStream out,
			boolean prettyFormat) throws ParsingException {

		try {

			Element responseElement = toXML(response);
			Document document = new Document(responseElement);
			XMLOutputter outputter;

			if (prettyFormat) {
				outputter = new XMLOutputter(Format.getPrettyFormat());
			} else {
				outputter = new XMLOutputter();
			}

			outputter.output(document, out);

		} catch (Exception e) {
			throw new ParsingException("Error serializing instance of "
					+ ServiceResponse.class, e);
		}

	}

	private final static ServiceResponse toServiceResponse(
			Element responseElement) throws DataConversionException {

		List<Element> dataElements = responseElement.getChildren();

		if (dataElements.isEmpty())
			return new ServiceResponse();
		else
			return new ServiceResponse(dataElements);

	}

	private static Element toXML(ServiceResponse response) {

		List<Element> dataElements = response.getDataElements();

		if (dataElements.size() == 1)
			return dataElements.get(0);

		Element responseElement = new Element("response",
				RSSXMLConversor.XML_NS);

		responseElement.addContent(response.getDataElements());

		return responseElement;

	}

	private ServiceResponseXMLConversor() {
	}

}
