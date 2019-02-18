package es.udc.mashup.ui.server.rss.servlet;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.jdom.Element;

import es.udc.mashup.ui.server.rss.xml.ServiceResponse;
import es.udc.mashup.ui.server.rss.xml.ServiceResponseXMLConversor;

public class ServletUtils {

	public final static void writeServiceResponse(Element dataElement,
			HttpServletResponse response) throws IOException {

		writeServiceResponse(new ServiceResponse(dataElement), response);

	}

	public final static void writeServiceResponse(HttpServletResponse response)
			throws IOException {

		writeServiceResponse(new ServiceResponse(), response);

	}

	public final static void writeServiceResponse(List<Element> dataElements,
			HttpServletResponse response) throws IOException {

		writeServiceResponse(new ServiceResponse(dataElements), response);

	}

	private final static void writeServiceResponse(
			ServiceResponse serviceResponse, HttpServletResponse response)
			throws IOException {

		OutputStream out = response.getOutputStream();

		response.setContentType("text/xml; charset=UTF-8");
		ServiceResponseXMLConversor.toXML(serviceResponse, out, true);
		out.close();

	}

	private ServletUtils() {
	}

}
