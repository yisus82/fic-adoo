package es.udc.mashup.ui.server.rss.xml;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import es.udc.mashup.ui.server.rss.Category;
import es.udc.mashup.ui.server.rss.Channel;
import es.udc.mashup.ui.server.rss.Cloud;
import es.udc.mashup.ui.server.rss.Enclosure;
import es.udc.mashup.ui.server.rss.Image;
import es.udc.mashup.ui.server.rss.Item;
import es.udc.mashup.ui.server.rss.RSS;
import es.udc.mashup.ui.server.rss.Source;
import es.udc.mashup.ui.server.rss.TextInput;
import es.udc.ws.util.exceptions.ParsingException;

public class RSSXMLConversor {

	public final static Namespace XML_NS = Namespace.NO_NAMESPACE;

	public final static Element toXML(RSS rss) {

		Element rssElement = new Element("rss", XML_NS);
		rssElement.setAttribute("version", rss.getVersion(), XML_NS);

		Element channelElement = toXML(rss.getChannel());
		rssElement.addContent(channelElement);

		return rssElement;

	}

	public final static void toXML(RSS rss, OutputStream out)
			throws ParsingException {

		try {

			Element rssElement = toXML(rss);
			Document document = new Document(rssElement);
			XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat());

			outputter.output(document, out);

		} catch (Exception e) {
			throw new ParsingException("Error serializing instance of "
					+ RSS.class, e);
		}

	}

	private final static Element toXML(Category category) {
		Element categoryElement = new Element("category", XML_NS);
		if (category.getDomain() != null)
			categoryElement
					.setAttribute("domain", category.getDomain(), XML_NS);
		categoryElement.setText(category.getCategory());

		return categoryElement;
	}

	private final static Element toXML(Channel channel) {
		String title = channel.getTitle();
		String link = channel.getLink();
		String description = channel.getDescription();
		String language = channel.getDescription();
		String copyright = channel.getCopyright();
		String managingEditor = channel.getManagingEditor();
		String webmaster = channel.getWebmaster();
		String pubDate = channel.getPubDate();
		String lastBuildDate = channel.getLastBuildDate();
		List<Category> categories = channel.getCategories();
		String generator = channel.getGenerator();
		String docs = channel.getDocs();
		Cloud cloud = channel.getCloud();
		String ttl = channel.getTtl();
		Image image = channel.getImage();
		String rating = channel.getRating();
		TextInput textInput = channel.getTextInput();
		String skipHours = channel.getSkipHours();
		String skipDays = channel.getSkipDays();

		Element channelElement = new Element("channel", XML_NS);

		if (title != null) {
			Element titleElement = new Element("title", XML_NS);
			titleElement.setText(title);
			channelElement.addContent(titleElement);
		}

		if (link != null) {
			Element linkElement = new Element("link", XML_NS);
			linkElement.setText(link);
			channelElement.addContent(linkElement);
		}

		if (description != null) {
			Element descriptionElement = new Element("description", XML_NS);
			descriptionElement.setText(description);
			channelElement.addContent(descriptionElement);
		}

		if (language != null) {
			Element languageElement = new Element("language", XML_NS);
			languageElement.setText(language);
			channelElement.addContent(languageElement);
		}

		if (copyright != null) {
			Element copyrightElement = new Element("copyright", XML_NS);
			copyrightElement.setText(copyright);
			channelElement.addContent(copyrightElement);
		}

		if (managingEditor != null) {
			Element managingEditorElement = new Element("managingEditor",
					XML_NS);
			managingEditorElement.setText(managingEditor);
			channelElement.addContent(managingEditorElement);
		}

		if (webmaster != null) {
			Element webmasterElement = new Element("webmaster", XML_NS);
			webmasterElement.setText(webmaster);
			channelElement.addContent(webmasterElement);
		}

		if (pubDate != null) {
			Element pubDateElement = new Element("pubDate", XML_NS);
			pubDateElement.setText(pubDate);
			channelElement.addContent(pubDateElement);
		}

		if (lastBuildDate != null) {
			Element lastBuildDateElement = new Element("lastBuildDate", XML_NS);
			lastBuildDateElement.setText(lastBuildDate);
			channelElement.addContent(lastBuildDateElement);
		}

		if (categories != null) {
			List<Element> categoryElements = new ArrayList<Element>();

			for (Category category : categories) {
				categoryElements.add(toXML(category));
			}
			channelElement.addContent(categoryElements);
		}

		if (generator != null) {
			Element generatorElement = new Element("generator", XML_NS);
			generatorElement.setText(generator);
			channelElement.addContent(generatorElement);
		}

		if (docs != null) {
			Element docsElement = new Element("docs", XML_NS);
			docsElement.setText(docs);
			channelElement.addContent(docsElement);
		}

		if (cloud != null) {
			Element cloudElement = toXML(cloud);
			channelElement.addContent(cloudElement);
		}

		if (ttl != null) {
			Element ttlElement = new Element("ttl", XML_NS);
			ttlElement.setText(ttl);
			channelElement.addContent(ttlElement);
		}

		if (image != null) {
			Element imageElement = toXML(image);
			channelElement.addContent(imageElement);
		}

		if (rating != null) {
			Element ratingElement = new Element("rating", XML_NS);
			ratingElement.setText(rating);
			channelElement.addContent(ratingElement);
		}

		if (textInput != null) {
			Element textInputElement = toXML(textInput);
			channelElement.addContent(textInputElement);
		}

		if (skipHours != null) {
			Element skipHoursElement = new Element("skipHours", XML_NS);
			skipHoursElement.setText(skipHours);
			channelElement.addContent(skipHoursElement);
		}

		if (skipDays != null) {
			Element skipDaysElement = new Element("skipDays", XML_NS);
			skipDaysElement.setText(skipDays);
			channelElement.addContent(skipDaysElement);
		}

		List<Element> itemElements = new ArrayList<Element>();

		for (Item item : channel.getItems()) {
			itemElements.add(toXML(item));
		}
		channelElement.addContent(itemElements);

		return channelElement;
	}

	private final static Element toXML(Cloud cloud) {
		Element cloudElement = new Element("cloud", XML_NS);
		cloudElement.setAttribute("port", cloud.getPort(), XML_NS);
		cloudElement.setAttribute("path", cloud.getPath(), XML_NS);
		cloudElement.setAttribute("registerProcedure", cloud
				.getRegisterProcedure(), XML_NS);
		cloudElement.setAttribute("protocol", cloud.getProtocol(), XML_NS);

		return cloudElement;
	}

	private final static Element toXML(Enclosure enclosure) {
		Element enclosureElement = new Element("enclosure", XML_NS);
		enclosureElement.setAttribute("url", enclosure.getUrl(), XML_NS);
		enclosureElement.setAttribute("length", enclosure.getLength(), XML_NS);
		enclosureElement.setAttribute("type", enclosure.getType(), XML_NS);

		return enclosureElement;
	}

	private final static Element toXML(Image image) {
		String width = image.getWidth();
		String height = image.getHeight();
		String description = image.getDescription();

		Element imageElement = new Element("image", XML_NS);

		Element urlElement = new Element("url", XML_NS);
		urlElement.setText(image.getUrl());
		imageElement.addContent(urlElement);

		Element titleElement = new Element("title", XML_NS);
		titleElement.setText(image.getTitle());
		imageElement.addContent(titleElement);

		Element linkElement = new Element("link", XML_NS);
		linkElement.setText(image.getLink());
		imageElement.addContent(linkElement);

		if (width != null) {
			Element widthElement = new Element("width", XML_NS);
			widthElement.setText(image.getWidth());
			imageElement.addContent(widthElement);
		}

		if (height != null) {
			Element heightElement = new Element("height", XML_NS);
			heightElement.setText(image.getHeight());
			imageElement.addContent(heightElement);
		}

		if (description != null) {
			Element descriptionElement = new Element("description", XML_NS);
			descriptionElement.setText(image.getDescription());
			imageElement.addContent(descriptionElement);
		}

		return imageElement;
	}

	private static Element toXML(Item item) {
		String title = item.getTitle();
		String link = item.getLink();
		String description = item.getDescription();
		String author = item.getAuthor();
		List<Category> categories = item.getCategories();
		String comments = item.getComments();
		Enclosure enclosure = item.getEnclosure();
		String guid = item.getGuid();
		String pubDate = item.getPubDate();
		Source source = item.getSource();

		Element itemElement = new Element("item", XML_NS);

		if (title != null) {
			Element titleElement = new Element("title", XML_NS);
			titleElement.setText(title);
			itemElement.addContent(titleElement);
		}

		if (link != null) {
			Element linkElement = new Element("link", XML_NS);
			linkElement.setText(link);
			itemElement.addContent(linkElement);
		}

		if (description != null) {
			Element descriptionElement = new Element("description", XML_NS);
			descriptionElement.setText(description);
			itemElement.addContent(descriptionElement);
		}

		if (author != null) {
			Element authorElement = new Element("author", XML_NS);
			authorElement.setText(author);
			itemElement.addContent(authorElement);
		}

		if (categories != null) {
			List<Element> categoryElements = new ArrayList<Element>();

			for (Category category : categories) {
				categoryElements.add(toXML(category));
			}
			itemElement.addContent(categoryElements);
		}

		if (comments != null) {
			Element commentsElement = new Element("comments", XML_NS);
			commentsElement.setText(comments);
			itemElement.addContent(commentsElement);
		}

		if (enclosure != null) {
			Element enclosureElement = toXML(enclosure);
			itemElement.addContent(enclosureElement);
		}

		if (guid != null) {
			Element guidElement = new Element("guid", XML_NS);
			guidElement.setText(guid);
			itemElement.addContent(guidElement);
		}

		if (pubDate != null) {
			Element pubDateElement = new Element("pubDate", XML_NS);
			pubDateElement.setText(pubDate);
			itemElement.addContent(pubDateElement);
		}

		if (source != null) {
			Element sourceElement = toXML(source);
			itemElement.addContent(sourceElement);
		}

		return itemElement;
	}

	private final static Element toXML(Source source) {
		Element sourceElement = new Element("source", XML_NS);
		sourceElement.setAttribute("url", source.getUrl(), XML_NS);
		sourceElement.setText(source.getSource());

		return sourceElement;
	}

	private final static Element toXML(TextInput textInput) {
		Element textInputElement = new Element("textInput", XML_NS);

		Element titleElement = new Element("title", XML_NS);
		titleElement.setText(textInput.getTitle());
		textInputElement.addContent(titleElement);

		Element descriptionElement = new Element("description", XML_NS);
		descriptionElement.setText(textInput.getDescription());
		textInputElement.addContent(descriptionElement);

		Element nameElement = new Element("name", XML_NS);
		nameElement.setText(textInput.getName());
		textInputElement.addContent(nameElement);

		Element linkElement = new Element("link", XML_NS);
		linkElement.setText(textInput.getLink());
		textInputElement.addContent(linkElement);

		return textInputElement;
	}

	private RSSXMLConversor() {
	}

}
