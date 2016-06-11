/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import lapr.project.utils.Exportable;
import lapr.project.utils.Importable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 *
 * @author Tiago
 */
public class FAE implements Exportable, Importable<FAE>, Serializable {

	private Utilizador utilizador;

	public FAE() {

	}

	public Utilizador getUtilizador() {
		return this.utilizador;
	}

	public void setUtilizador(Utilizador u) {
		this.utilizador = u;
	}

	public boolean equals(FAE o) {
		if (this == null) {
			return false;
		}
		if (o != null) {
			return o.getUtilizador().equals(this.getUtilizador());
		}
		return false;
	}

	public String toString() {
		String str = "FAE:";
		str += "\tUser: " + this.utilizador.getUsername();

		return str;
	}

	@Override
	public Node exportContentToXMLNode() {
		Node rootNode = null;

		try {
			DocumentBuilderFactory factory
				= DocumentBuilderFactory.newInstance();
			//Create document builder
			DocumentBuilder builder = factory.newDocumentBuilder();

			//Obtain a new document
			Document document = builder.newDocument();

			//Create root element
			Element elementUtilizador = document.
				createElement("FAE");

			//Create a sub-element
			Element elementDescription = document.
				createElement("Utilizador");
			//Set the sub-element value
			elementDescription.setTextContent(getUtilizador().getUsername());
			//Add sub-element to root element
			elementUtilizador.appendChild(elementDescription);
			//Create a sub-element

			//Add root element to document
			document.appendChild(elementUtilizador);

			//It exports only the element representation to XMÇ, ommiting the XML header
			rootNode = elementUtilizador;

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return rootNode;
	}

	@Override
	public FAE importContentFromXMLNode(Node node) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
