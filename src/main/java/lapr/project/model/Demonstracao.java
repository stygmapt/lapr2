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
 * @author Eduardo
 */
public class Demonstracao implements Exportable, Importable<Demonstracao>, Serializable {

	private static int codigo;
	private String descricao;
	private ListaRecurso listaRecurso;

	public Demonstracao() {
		this.listaRecurso = new ListaRecurso();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo() {
		codigo++;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) throws IllegalArgumentException {
		if (descricao.isEmpty()) {
			throw new IllegalArgumentException("A descricacao da Demonstracao esta vazia");
		}
		this.descricao = descricao;
	}

	public ListaRecurso getListaRecurso() {
		return listaRecurso;
	}

	public boolean equals(Demonstracao o) {
		if (this == null) {
			return false;
		}
		if (o != null) {
			return o.getCodigo() == this.getCodigo()
				&& o.getDescricao().equalsIgnoreCase(this.getDescricao());
		}
		return false;
	}

	public boolean valida() {
		return !this.listaRecurso.getListaRecursos().isEmpty();
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
				createElement("Demonstracao");

			//Create a sub-element
			Element elementDescription = document.
				createElement("Codigo");
			Element elementName = document.createElement("Descricao");
			//Set the sub-element value
			elementDescription.setTextContent(Integer.toString(getCodigo()));
			elementName.setTextContent(getDescricao());
			//Add sub-element to root element
			elementUtilizador.appendChild(elementDescription);
			elementUtilizador.appendChild(elementName);
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
	public Demonstracao importContentFromXMLNode(Node node) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

}
