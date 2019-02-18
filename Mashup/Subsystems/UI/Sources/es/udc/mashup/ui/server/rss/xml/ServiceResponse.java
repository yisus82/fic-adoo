package es.udc.mashup.ui.server.rss.xml;

import java.util.ArrayList;
import java.util.List;

import org.jdom.Element;

public class ServiceResponse {

	private List<Element> dataElements;

	public ServiceResponse() {
		dataElements = new ArrayList<Element>();
	}

	public ServiceResponse(Element dataElement) {
		dataElements = new ArrayList<Element>();
		dataElements.add(dataElement);
	}

	public ServiceResponse(List<Element> dataElements) {
		this.dataElements = dataElements;
	}

	public List<Element> getDataElements() {
		return dataElements;
	}

}
