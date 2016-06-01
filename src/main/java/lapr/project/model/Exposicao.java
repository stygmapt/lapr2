/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Date;

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
	private ListaOrganizadores listaOrganizador;

	private Exposicao(String titulo, String desc, Date dataInicio, Date dataFim,
					  Date DataInicioSub, Date dataFimsub, String local, Date dataAvaliacoes) {
		this.titulo = titulo;
		this.descricao = desc;
		this.dataInicioRealização = dataInicio;
		this.dataFimRealização = dataFim;
		this.dataInicioSubmissão = DataInicioSub;
		this.dataFimSubmissão = dataFimsub;
                this.dataLimiteAvaliacoes=dataAvaliacoes;
		this.local = local;
                this.listaOrganizador = new ListaOrganizadores();
	}

	public Exposicao() {
		this.listaOrganizador = new ListaOrganizadores();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataInicioRealização() {
		return dataInicioRealização;
	}

        public Date getDataFimRealização() {
		return dataFimRealização;
	}
        
	public void setDatasRealização(Date dataInicioRealização, Date dataFimRealização) {
            if(dataInicioRealização.after(dataFimRealização) || dataFimRealização.equals(dataInicioRealização)){
                throw new IllegalArgumentException("A data de fim de exposição tem de ser posterior á data de inicio.");
            }
		this.dataInicioRealização = dataInicioRealização;
                this.dataFimRealização=dataFimRealização;
	}

	public Date getDataInicioSubmissão() {
		return dataInicioSubmissão;
	}

        public Date getDataFimSubmissão() {
		return dataFimSubmissão;
	}
        
	public void setPeriodoSubmissão(Date dataInicioSubmissão,Date dataFimSubmissão) {
            if(dataInicioSubmissão.after(dataFimSubmissão) || dataFimSubmissão.equals(dataInicioSubmissão)){
                throw new IllegalArgumentException("A data limite de submissão de candidaturas tem de ser posterior á data de inicio.");
            }
            this.dataInicioSubmissão = dataInicioSubmissão;
            this.dataFimSubmissão=dataFimSubmissão;
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
            if(dataLimiteAvaliacoes.before(this.dataFimSubmissão)){
                throw new IllegalArgumentException("A data limite de avaliação de candidaturas tem de ser posterior á data limite de submissão.");
            }
            this.dataLimiteAvaliacoes = dataLimiteAvaliacoes;
        }

        public Date getDataLimiteAvaliacoes() {
            return dataLimiteAvaliacoes;
        }

	public ListaOrganizadores getListaOrganizador() {
		return listaOrganizador;
	}


	public Boolean valida() {
		return true;
	}
        
}
