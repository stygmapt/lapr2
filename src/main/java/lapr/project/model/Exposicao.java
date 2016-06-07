/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Date;
import lapr.project.states.ExposicaoState;
import lapr.project.states.ExposicaoStateCriada;

/**
 *
 * @author Tiago
 */
public class Exposicao {

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

    public Boolean isInCriada() {
        return this.m_state.setCriada();
    }

    public Boolean isDemonstracaoSemFAE() {
        return this.m_state.setDemonstracaoSemFAE();
    }

    public Boolean isCompleta() {
        return this.m_state.setCompleta();
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

    public boolean isCandidaturasAbertas() {
        return this.m_state.setCandidaturaAberta();
    }

    public RegistoCandidaturas getRegistoCandidaturas() {
        return this.registoCandidaturas;
    }

    public boolean isInConflitosAlterados() {
        return this.m_state.setConflitoAlterados();
    }

}
