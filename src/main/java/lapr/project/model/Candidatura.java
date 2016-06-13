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
import lapr.project.states.CandidaturaState;
import lapr.project.states.CandidaturaStateEmSubmissao;
import lapr.project.utils.Exportable;
import lapr.project.utils.Importable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Gabriel
 */
public class Candidatura implements Exportable, Importable<Candidatura>, Serializable {

    private static final String ROOT_ELEMENT_NAME = "Candidatura";
    private static final String DESCRIPTION_ELEMENT_NAME = "description";
    private static final String KEYWORDS_ELEMENT_NAME = "keywords";

    /**
     * Candidatura representation.
     */
    private String value = "";
    private String description = "";

    
    private Utilizador representante;
    private String nome_Empresa;
    private String morada_Empresa;
    private int telemovel_Empresa;
    private int qtd_convites;
    private float area_Empresa;
    private ListaProdutos lista_produtos;
    private ListaKeywords lista_keywords;
    private RegistoAvaliacoes registo_avaliacoes;
    private CandidaturaState estado_candidatura;
    private boolean decisaoFinal;

    public Candidatura() {
        this.lista_produtos = new ListaProdutos();
        this.lista_keywords = new ListaKeywords();
        this.registo_avaliacoes = new RegistoAvaliacoes();
        this.estado_candidatura = new CandidaturaStateEmSubmissao(this);
    }

    public Candidatura(Utilizador representante, String nome_Empresa,
            String morada_Empresa, int telemovel_Empresa,
            int qtd_convites, float area_Empresa,
            ListaProdutos lista_produtos) {
        this.representante = representante;
        this.nome_Empresa = nome_Empresa;
        this.morada_Empresa = morada_Empresa;
        this.telemovel_Empresa = telemovel_Empresa;
        this.qtd_convites = qtd_convites;
        this.area_Empresa = area_Empresa;
        this.lista_produtos = lista_produtos;
        this.lista_keywords = new ListaKeywords();
    }

    public String getValue() {
        return value;
    }

    public Utilizador getRepresentante() {
        return representante;
    }

    public void setRepresentante(Utilizador representante) {
        this.representante = representante;
    }

    public String getNome_Empresa() {
        return nome_Empresa;
    }

    public void setNome_Empresa(String nome_Empresa) {
        if (nome_Empresa.isEmpty() || nome_Empresa == null) {
            throw new IllegalArgumentException("Introduza o nome da empresa.");
        }
        this.nome_Empresa = nome_Empresa;
    }

    public String getMorada_Empresa() {
        return morada_Empresa;
    }

    public void setMorada_Empresa(String morada_Empresa) {
        if (morada_Empresa.isEmpty() || morada_Empresa == null) {
            throw new IllegalArgumentException("Introduza a morada.");
        }
        this.morada_Empresa = morada_Empresa;
    }

    public int getTelemovel_Empresa() {
        return telemovel_Empresa;
    }

    public void setTelemovel_Empresa(int telemovel_Empresa) {
        int nrNumeros = String.valueOf(telemovel_Empresa).length();
        if (nrNumeros != 9) {
            throw new IllegalArgumentException("O telefone tem que ter 9 digitos.");
        }
        this.telemovel_Empresa = telemovel_Empresa;
    }

    public ListaKeywords getListaKeywords() {
        return this.lista_keywords;
    }

    public int getQtd_convites() {
        return qtd_convites;
    }

    public void setQtd_convites(int qtd_convites) {
        this.qtd_convites = qtd_convites;
    }

    public float getArea_Empresa() {
        return area_Empresa;
    }

    public void setArea_Empresa(float area_Empresa) {
        this.area_Empresa = area_Empresa;
    }

    public ListaProdutos getLista_produtos() {
        return lista_produtos;
    }

    public RegistoAvaliacoes getRegistoAtribuicoes() {
        return registo_avaliacoes;
    }

    public void setLista_produtos(ListaProdutos lista_produtos) {
        this.lista_produtos = lista_produtos;
    }

    public boolean isInSubmissao() {
        return this.estado_candidatura.setEmSubmissao();
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Candidatura:\tNome da Empresa: " + this.nome_Empresa + "\tRepresentante: " + this.representante.
                toString();
    }

    public boolean valida() {
        return true;
    }

    public boolean equals(Candidatura o) {
        if (o == null) {
            return false;
        }
        if (o != null) {
            return o.getRepresentante().equals(this.getRepresentante())
                    && o.getNome_Empresa().equalsIgnoreCase(this.getNome_Empresa())
                    && o.getMorada_Empresa().equalsIgnoreCase(this.
                            getMorada_Empresa());
        }
        return false;
    }

    public void setState(CandidaturaState candidaturaState) {
        this.estado_candidatura = candidaturaState;
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
                    createElement("Candidatura");

            //Create a sub-element
            Element elementDescription = document.
                    createElement("Representante");
            Element elementName = document.createElement("NomeEmpresa");
            Element elementData = document.createElement("Morada");
            Element elementPass = document.createElement("Telemovel");
            Element elementInicioSubmissao = document.createElement("Convites");
            Element elementFimSubmissao = document.createElement("Area");
            //Set the sub-element value
            elementDescription.setTextContent(getRepresentante().getUsername());
            elementName.setTextContent(getNome_Empresa());
            elementData.setTextContent(getMorada_Empresa());
            elementPass.setTextContent(Integer.toString(getTelemovel_Empresa()));
            elementInicioSubmissao.setTextContent(Integer.
                    toString(getQtd_convites()));
            elementFimSubmissao.
                    setTextContent(Float.toString(getArea_Empresa()));
            //Add sub-element to root element
            elementUtilizador.appendChild(elementDescription);
            elementUtilizador.appendChild(elementName);
            elementUtilizador.appendChild(elementData);
            elementUtilizador.appendChild(elementPass);
            elementUtilizador.appendChild(elementInicioSubmissao);
            elementUtilizador.appendChild(elementFimSubmissao);
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
    public Candidatura importContentFromXMLNode(Node node) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            //Create document builder
            DocumentBuilder builder = factory.newDocumentBuilder();
            //Obtain a new document
            Document document = builder.newDocument();
            document.appendChild(document.importNode(node, true));

            NodeList candidaturas = document.getElementsByTagName(ROOT_ELEMENT_NAME);
            Node candidatura = candidaturas.item(0);

            //Get representante
            this.description = candidatura.getFirstChild().getFirstChild().getNodeValue();

            //keywords
            NodeList elementsKeywords = document.getElementsByTagName(KEYWORDS_ELEMENT_NAME);
            NodeList keywords = elementsKeywords.item(0).getChildNodes();
            for (int position = 0; position < keywords.getLength(); position++) {
                Node keyword = keywords.item(position);
                Keyword keywordExample = new Keyword();

                keywordExample = keywordExample.importContentFromXMLNode(keyword);
                lista_keywords.registaKeyWord(keywordExample);
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return this;
    }
}
