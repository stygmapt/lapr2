/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	private String local;
	private List<Organizador> listaOrganizador;
	private List<FAE> listaFae;
	private Organizador organizador;

	private Exposicao(String titulo, String desc, Date dataInicio, Date dataFim,
					  Date DataInicioSub, Date dataFimsub, String local) {
		this.titulo = titulo;
		this.descricao = desc;
		this.dataInicioRealização = dataInicio;
		this.dataFimRealização = dataFim;
		this.dataInicioSubmissão = DataInicioSub;
		this.dataFimSubmissão = dataFimsub;
		this.local = local;
	}

	public Exposicao() {
		this.listaFae = new ArrayList<>();
		this.listaOrganizador = new ArrayList<>();
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

	public void setDataInicioRealização(Date dataInicioRealização) {
		this.dataInicioRealização = dataInicioRealização;
	}

	public Date getDataFimRealização() {
		return dataFimRealização;
	}

	public void setDataFimRealização(Date dataFimRealização) {
		this.dataFimRealização = dataFimRealização;
	}

	public Date getDataInicioSubmissão() {
		return dataInicioSubmissão;
	}

	public void setDataInicioSubmissão(Date dataInicioSubmissão) {
		this.dataInicioSubmissão = dataInicioSubmissão;
	}

	public Date getDataFimSubmissão() {
		return dataFimSubmissão;
	}

	public void setDataFimSubmissão(Date dataFimSubmissão) {
		this.dataFimSubmissão = dataFimSubmissão;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public List<Organizador> getListaOrganizador() {
		return listaOrganizador;
	}

	public Organizador addOrganizador(Utilizador u) {
		this.organizador = new Organizador();
		this.organizador.setUtilizador(u);
		listaOrganizador.add(organizador);
		return this.organizador;
	}

	public Boolean valida() {
		return !this.getTitulo().isEmpty();
	}
}
