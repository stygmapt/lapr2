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
public class Organizador implements Exportable, Importable<Organizador>, Serializable {

	private Utilizador utilizador;

	public Organizador() {

	}

	public Utilizador getUtilizador() {
		return this.utilizador;
	}

	public void setUtilizador(Utilizador u) {
		this.utilizador = u;
	}

	public String toString() {
		String str = "Organizador:";
		str += "\tUser: " + this.utilizador.getUsername();

		return str;
	}

	public boolean equals(Object outroObjeto) {
		if (this == outroObjeto) {
			return true;
		}
		if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
			return false;
		}
		Organizador outroOrganizador = (Organizador) outroObjeto;
		return this.utilizador.equals(outroOrganizador.utilizador);

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
				createElement("Organizador");

			//Create a sub-element
			Element elementDescription = document.
				createElement("Username");
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
	public Organizador importContentFromXMLNode(Node node) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

}
