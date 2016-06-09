/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import lapr.project.states.CandidaturaState;
import lapr.project.states.CandidaturaStateEmSubmissao;

/**
 *
 * @author Gabriel
 */
public class Candidatura implements Serializable{

	private Utilizador representante;
	private String nome_Empresa;
	private String morada_Empresa;
	private int telemovel_Empresa;
	private int qtd_convites;
	private float area_Empresa;
	private ListaProdutos lista_produtos;
	private RegistoAvaliacoes registo_avaliacoes;
	private CandidaturaState estado_candidatura;
        

	public Candidatura() {
            this.lista_produtos=new ListaProdutos();
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
            if(nome_Empresa.isEmpty()||nome_Empresa==null){
                throw new IllegalArgumentException("Introduza o nome da empresa.");
            }
		this.nome_Empresa = nome_Empresa;
	}

	public String getMorada_Empresa() {
		return morada_Empresa;
	}

	public void setMorada_Empresa(String morada_Empresa) {
            if(morada_Empresa.isEmpty()||morada_Empresa==null){
                throw new IllegalArgumentException("Introduza a morada.");
            }
		this.morada_Empresa = morada_Empresa;
	}

	public int getTelemovel_Empresa() {
		return telemovel_Empresa;
	}

	public void setTelemovel_Empresa(int telemovel_Empresa) {
            int nrNumeros = String.valueOf(telemovel_Empresa).length();
            if(nrNumeros!=9){
                throw new IllegalArgumentException("O telefone tem que ter 9 digitos.");
            }
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
        if(o==null){
            return false;
        }
        if (o != null) {
			return o.getRepresentante().equals(this.getRepresentante())&&
                                o.getNome_Empresa().equalsIgnoreCase(this.getNome_Empresa())&&
                                o.getMorada_Empresa().equalsIgnoreCase(this.getMorada_Empresa());
		}
        return false;
    }
        
        

    public void setState(CandidaturaState candidaturaState) {
        this.estado_candidatura = candidaturaState;
    }

}
