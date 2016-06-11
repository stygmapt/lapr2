/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import lapr.project.states.ExposicaoState;
import lapr.project.states.ExposicaoStateCriada;
import lapr.project.utils.Exportable;
import lapr.project.utils.Importable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Tiago
 */
public class Exposicao implements Exportable, Importable<Exposicao>, Serializable {

    private static final String ROOT_ELEMENT_NAME = "Exposicao";
    
    private String value = "";

    private String titulo;
    private String descricao;
    private Date dataInicioRealização;
    private Date dataFimRealização;
    private Date dataInicioSubmissão;
    private Date dataFimSubmissão;
    private Date dataLimiteAvaliacoes;
    private String local;
    private ExposicaoState m_state;
    private final ListaOrganizadores listaOrganizador;
    private final ListaFAE listaFae;
    private final ListaDemonstracao listaDemonstracao;
    private final RegistoCandidaturas registoCandidaturas;
    private final RegistoCandidaturasRemovidas registoCandidaturasRemovidas;
    private final RegistoAtribuicoes registoAtribuicoes;
    private final RegistoStand registoStand;
    private final RegistoConflito registoconflito;

    private Exposicao(String titulo, String desc, Date dataInicio, Date dataFim,
            Date DataInicioSub, Date dataFimsub, String local,
            Date dataAvaliacoes) {
        this.titulo = titulo;
        this.descricao = desc;
        this.dataInicioRealização = dataInicio;
        this.dataFimRealização = dataFim;
        this.dataInicioSubmissão = DataInicioSub;
        this.dataFimSubmissão = dataFimsub;
        this.dataLimiteAvaliacoes = dataAvaliacoes;
        this.local = local;
        this.listaOrganizador = new ListaOrganizadores();
        this.listaFae = new ListaFAE();
        this.m_state = new ExposicaoStateCriada(this);
        this.listaDemonstracao = new ListaDemonstracao();
        this.registoCandidaturas = new RegistoCandidaturas();
        this.registoCandidaturasRemovidas = new RegistoCandidaturasRemovidas();
        this.registoAtribuicoes = new RegistoAtribuicoes();
        this.registoStand = new RegistoStand();
        this.registoconflito = new RegistoConflito();
    }

    public Exposicao() {
        this.listaFae = new ListaFAE();
        this.listaOrganizador = new ListaOrganizadores();
        this.listaDemonstracao = new ListaDemonstracao();
        this.m_state = new ExposicaoStateCriada(this);
        this.registoCandidaturas = new RegistoCandidaturas();
        this.registoCandidaturasRemovidas = new RegistoCandidaturasRemovidas();
        this.registoAtribuicoes = new RegistoAtribuicoes();
        this.registoStand = new RegistoStand();
        this.registoconflito = new RegistoConflito();
    }

    public RegistoCandidaturasRemovidas getRegistoCandidaturasRemovidas() {
        return registoCandidaturasRemovidas;
    }

    public RegistoAtribuicoes getRegistoAtribuicoes() {
        return registoAtribuicoes;
    }

    public RegistoStand getRegistoStand() {
        return registoStand;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O titulo da exposição nao pode ser vazio.!");
        }
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição da exposição nao pode ser vazio.!");
        }
        this.descricao = descricao;
    }

    public Date getDataInicioRealização() {
        return dataInicioRealização;
    }

    public Date getDataFimRealização() {
        return dataFimRealização;
    }

    public void setDatasRealização(Date dataInicioRealização,
            Date dataFimRealização) {
        if (dataInicioRealização.after(dataFimRealização) || dataFimRealização.
                equals(dataInicioRealização)) {
            throw new IllegalArgumentException("A data de fim de exposição tem de ser posterior á data de inicio.");
        }
        this.dataInicioRealização = dataInicioRealização;
        this.dataFimRealização = dataFimRealização;
    }

    public Date getDataInicioSubmissão() {
        return dataInicioSubmissão;
    }

    public Date getDataFimSubmissão() {
        return dataFimSubmissão;
    }

    public void setPeriodoSubmissão(Date dataInicioSubmissão,
            Date dataFimSubmissão) {
        if (dataInicioSubmissão.after(dataFimSubmissão) || dataFimSubmissão.
                equals(dataInicioSubmissão)) {
            throw new IllegalArgumentException("A data limite de submissão de candidaturas tem de ser posterior á data de inicio.");
        }
        this.dataInicioSubmissão = dataInicioSubmissão;
        this.dataFimSubmissão = dataFimSubmissão;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        if (local == null || local.trim().isEmpty()) {
            throw new IllegalArgumentException("O local da exposição nao pode ser vazio.!");
        }
        this.local = local;
    }

    public void setDataLimiteAvaliacoes(Date dataLimiteAvaliacoes) {
        if (dataLimiteAvaliacoes.before(this.dataFimSubmissão)) {
            throw new IllegalArgumentException("A data limite de avaliação de candidaturas tem de ser posterior á data limite de submissão.");
        }
        this.dataLimiteAvaliacoes = dataLimiteAvaliacoes;
    }

    public Date getDataLimiteAvaliacoes() {
        return dataLimiteAvaliacoes;
    }

    public ListaFAE getListaFae() {
        return listaFae;
    }

    public ListaOrganizadores getListaOrganizador() {
        return listaOrganizador;
    }

    public ExposicaoState getM_state() {
        return m_state;
    }

    public void setState(ExposicaoState state) {
        this.m_state = state;
    }

    public Boolean valida() {
        return true;
    }

    public Boolean isInFAESemDemonstracao() {
        return this.m_state.setFAESemDemonstracao();
    }

    public boolean isCandidaturasTerminadas() {
        return this.m_state.setCandidaturaTerminada();
    }

    public Boolean isInCriada() {
        return this.m_state.setCriada();
    }

    public Boolean isDemonstracaoSemFAE() {
        return this.m_state.setDemonstracaoSemFAE();
    }

    public boolean isCandidaturaAtribuidas() {
        return this.m_state.setCandidaturaAtribuidas();
    }

    public Boolean isCompleta() {
        return this.m_state.setCompleta();
    }

    public boolean isCandidaturasAbertas() {
        return this.m_state.setCandidaturaAberta();
    }

    public boolean isInConflitosAlterados() {
        return this.m_state.setConflitoAlterados();
    }

    public boolean isInConflitosDetetados() {
        return this.m_state.setConflitoDetetados();
    }

    public Boolean vereficaEstado() {
        if (this.isDemonstracaoSemFAE() || this.isInFAESemDemonstracao()) {
            return true;
        } else {
            return false;
        }
    }

    public ListaDemonstracao getListaDemonstracao() {
        return listaDemonstracao;
    }

    public String toString() {
        String str = "Exposiçao:";
        str += "\tTitulo: " + this.titulo;
        str += "\tDescrição: " + this.descricao;

        return str;
    }

    public RegistoCandidaturas getRegistoCandidaturas() {
        return this.registoCandidaturas;
    }

    public void setConflitosDetetados(List<Conflito> lst) {
        this.registoconflito.setListaConflitos(lst);
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
                    createElement("Exposicao");

            //Create a sub-element
            Element elementDescription = document.
                    createElement("Titulo");
            Element elementName = document.createElement("Descricao");
            Element elementData = document.createElement("DataInicioRealizacao");
            Element elementPass = document.createElement("DataFimRealizacao");
            Element elementInicioSubmissao = document.
                    createElement("DataInicioSubmissao");
            Element elementFimSubmissao = document.
                    createElement("DataFimSubmissao");
            Element elementLElement = document.
                    createElement("DataLimiteAvaliacao");
            Element Local = document.createElement("Local");
            //Set the sub-element value
            elementDescription.setTextContent(getTitulo());
            elementName.setTextContent(getDescricao());
            elementData.setTextContent(getDataInicioRealização().toString());
            elementPass.setTextContent(getDataFimRealização().toString());
            elementInicioSubmissao.setTextContent(getDataInicioSubmissão().
                    toString());
            elementFimSubmissao.setTextContent(getDataFimSubmissão().toString());
            elementLElement.setTextContent(getDataLimiteAvaliacoes().toString());
            Local.setTextContent(getLocal());
            //Add sub-element to root element
            elementUtilizador.appendChild(elementDescription);
            elementUtilizador.appendChild(elementName);
            elementUtilizador.appendChild(elementData);
            elementUtilizador.appendChild(elementPass);
            elementUtilizador.appendChild(elementInicioSubmissao);
            elementUtilizador.appendChild(elementFimSubmissao);
            elementUtilizador.appendChild(elementLElement);
            elementUtilizador.appendChild(Local);
            Element listaOrg = document.createElement("Organizador");
            Element listaFAE = document.createElement("FAE");
            Element listaCand = document.createElement("Candidatura");
            Element listaDeElement = document.createElement("Demonstracao");
            for (Organizador object : listaOrganizador.getLista()) {
                Node nodeOrg = object.exportContentToXMLNode();
                listaOrg.appendChild(document.importNode(nodeOrg, true));
            }
            for (FAE object : listaFae.getLista()) {
                Node nodeFAE = object.exportContentToXMLNode();
                listaFAE.appendChild(document.importNode(nodeFAE, true));
            }
            for (Candidatura cand : registoCandidaturas.getListaCandidaturas()) {
                Node nodeCandidatura = cand.exportContentToXMLNode();
                listaCand.
                        appendChild(document.importNode(nodeCandidatura, true));
            }
            for (Demonstracao object : listaDemonstracao.getListaDemonstracao()) {
                Node nodeDemonstracao = object.exportContentToXMLNode();
                listaDeElement.appendChild(document.
                        importNode(nodeDemonstracao, true));
            }
            elementUtilizador.appendChild(listaDeElement);
            elementUtilizador.appendChild(listaFAE);
            elementUtilizador.appendChild(listaCand);
            //Create a sub-element
            elementUtilizador.appendChild(listaOrg);
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
    public Exposicao importContentFromXMLNode(Node node) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            //Create document builder
            DocumentBuilder builder = factory.newDocumentBuilder();
            //Obtain a new document
            Document document = builder.newDocument();
            document.appendChild(document.importNode(node, true));
            NodeList exposicoes = document.getElementsByTagName(ROOT_ELEMENT_NAME);
            Node exposicao = exposicoes.item(0);

            //Get value
            this.value = exposicao.getFirstChild().getNodeValue();

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return this;
    }
}
