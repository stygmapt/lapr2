/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import lapr.project.states.CandidaturaState;
import lapr.project.states.CandidaturaStateEmSubmissao;

/**
 *
 * @author Gabriel
 */
public class Candidatura {

	private Utilizador representante;
	private String nome_Empresa;
	private String morada_Empresa;
	private int telemovel_Empresa;
	private int qtd_convites;
	private float area_Empresa;
	private ListaProdutos lista_produtos;
	private CandidaturaState estado_candidatura;

	public Candidatura() {
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
		this.estado_candidatura = new CandidaturaStateEmSubmissao(this);
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
		this.nome_Empresa = nome_Empresa;
	}

	public String getMorada_Empresa() {
		return morada_Empresa;
	}

	public void setMorada_Empresa(String morada_Empresa) {
		this.morada_Empresa = morada_Empresa;
	}

	public int getTelemovel_Empresa() {
		return telemovel_Empresa;
	}

	public void setTelemovel_Empresa(int telemovel_Empresa) {
		this.telemovel_Empresa = telemovel_Empresa;
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

}
