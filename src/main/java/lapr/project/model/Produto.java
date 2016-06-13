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
 * @author Gabriel
 */
public class Produto implements Exportable, Importable<Produto>, Serializable {

	private String designacao_produto;

	public Produto() {
	}

	public Produto(String designacao) {
		this.designacao_produto = designacao;
	}

	public String getDesignacao_produto() {
		return designacao_produto;
	}

	public void setDesignacao_produto(String designacao_produto) {
		this.designacao_produto = designacao_produto;
	}

	@Override
	public String toString() {
		return "Produto:\tDesignação: " + this.designacao_produto;
	}

	public boolean equals(Object outroObjeto) {
		if (this == outroObjeto) {
			return true;
		}
		if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
			return false;
		}
		Produto outroProduto = (Produto) outroObjeto;
		return this.designacao_produto.
			equalsIgnoreCase(outroProduto.designacao_produto);

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
				createElement("Produto");

			//Create a sub-element
			Element elementDescription = document.
				createElement("Designacao");
			//Set the sub-element value
			elementDescription.setTextContent(getDesignacao_produto());
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
	public Produto importContentFromXMLNode(Node node) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
