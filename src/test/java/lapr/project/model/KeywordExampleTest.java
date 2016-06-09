package lapr.project.model;

import lapr.project.utils.XMLParser;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import static org.junit.Assert.*;

/**
 * Example of a domain class that is used in Candidatura.
 * Created by Nuno Bettencourt [NMB] on 29/05/16.
 */
public class KeywordExampleTest {
	@Test
	public void ensureSameContentObjectsAreEqual() {
		Keyword expected = new Keyword("Doors");
		Keyword result = new Keyword("Doors");
		assertEquals(expected, result);
	}

	@Test
	public void ensureSameObjectIsEqual() {
		Keyword expected = new Keyword("Doors");
		assertEquals(expected, expected);
	}

	@Test
	public void ensureDifferentObjectsAreNotEqual() {
		Keyword expected = new Keyword("Doors");
		Object result = new Object();
		assertNotEquals(expected, result);
	}

	@Test
	public void ensureHashCodeIsCorrect() {
		Keyword firstKeywordExample = new Keyword("Doors");

		int expected = 66216549;
		int result = firstKeywordExample.hashCode();
		assertEquals(expected, result);
	}

	@Test
	public void ensureXMLElementExportToStringIsValid() throws Exception {
		String expected = "<keyword>\n" +
				"<value>Doors</value>\n" +
				"</keyword>\n";
		Keyword keyword = new Keyword("Doors");
		String result = keyword.exportContentToString();
		assertEquals(expected, result);
	}

	@Test
	public void ensureXMLElementExportToNodeIsValid() throws Exception {
		DocumentBuilderFactory factory =
				DocumentBuilderFactory.newInstance();
		Node expected = null;

		try {
			//Create document builder
			DocumentBuilder builder = factory.newDocumentBuilder();

			//Obtain a new document
			Document document = builder.newDocument();

			//Create root element
			Element elementKeyword = document.createElement("keyword");

			//Create a sub-element
			Element elementValue = document.createElement("value");

			//Set the sub-element value
			elementValue.setTextContent("Doors");

			//Add sub-element to root element
			elementKeyword.appendChild(elementValue);

			//Add root element to document
			document.appendChild(elementKeyword);

			expected = elementKeyword;

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

		Keyword keyword = new Keyword("Doors");

		Node result = keyword.exportContentToXMLNode();
		assertTrue(expected.isEqualNode(result));
	}

	@Test
	public void ensureImportFromXMLElementNodeIsValid() throws Exception {
		Keyword expected = new Keyword("Doors");

		DocumentBuilderFactory factory =
				DocumentBuilderFactory.newInstance();

		//Create document builder
		DocumentBuilder builder = factory.newDocumentBuilder();

		//Obtain a new document
		Document document = builder.newDocument();

		//Create root element
		Element elementKeyword = document.createElement("keyword");

		//Create a sub-element
		Element elementValue = document.createElement("value");

		//Set the sub-element value
		elementValue.setTextContent("Doors");

		//Add sub-element to root element
		elementKeyword.appendChild(elementValue);

		//Add root element to document
		document.appendChild(elementKeyword);

		Keyword keyword = new Keyword("Doors");

		Keyword result = keyword.importContentFromXMLNode(elementKeyword);

		assertEquals(expected, result);
	}

	@Test
	public void testCreateExportImport() throws Exception {
		String filename = "target/test-classes/TestKeywordImportExport.xml";
		Keyword expected = new Keyword("Doors");

		Node memoryNode = expected.exportContentToXMLNode();

		XMLParser xmlParser = new XMLParser();
		xmlParser.writeXMLElementToFile(memoryNode, filename);

		Node fileNode = xmlParser.readXMLElementFromFile(filename);

		Keyword result = new Keyword();
		result = result.importContentFromXMLNode(fileNode);

		assertEquals(expected, result);
	}
}