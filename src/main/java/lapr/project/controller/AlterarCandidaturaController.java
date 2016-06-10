/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Keyword;
import lapr.project.model.Produto;
import lapr.project.model.Utilizador;

/**
 *
 * @author Gabriel
 */
public class AlterarCandidaturaController {
    private final CentroExposicoes m_ce;
    private Candidatura candidaturaAAlterar;
    
    
    public AlterarCandidaturaController(CentroExposicoes ce){
        this.m_ce=ce;
    }  
    
    public List<Candidatura> getListCandidaturasPossiveisAlterar(Utilizador user){
        return this.m_ce.getRegistoExposicoes().getListaCandidaturasRepresentante(user);
    }
    
    public void SelectCandidatura(Candidatura c){
        this.candidaturaAAlterar=c;
    }
    
    public Candidatura getDadosCandidatura(){
        return this.candidaturaAAlterar;
    }
    
    public void setDados(String nome_Empresa, Utilizador representante, float area, String morada_Empresa, int tlm, int qtdCnvt){
        this.candidaturaAAlterar.setNome_Empresa(nome_Empresa);
        this.candidaturaAAlterar.setRepresentante(representante);
        this.candidaturaAAlterar.setArea_Empresa(area);
        this.candidaturaAAlterar.setMorada_Empresa(morada_Empresa);
        this.candidaturaAAlterar.setTelemovel_Empresa(tlm);
        this.candidaturaAAlterar.setQtd_convites(qtdCnvt);
    }
    
    public List<Produto> getListProdutos(){
        return this.candidaturaAAlterar.getLista_produtos().getLista();
    }
    
    

    public void addPalavraChave(String text) {
        if(this.candidaturaAAlterar.getListaKeywords().getNrPalavrasLista()>=6){
            throw  new IllegalArgumentException("Não podem existir mais de 6 palavras chave na candidatura.");
        }
        this.candidaturaAAlterar.getListaKeywords().registaKeyWord(new Keyword(text));
    }
    
    public void addProduto(String text) {
        this.candidaturaAAlterar.getLista_produtos().adicionaProduto(new Produto(text));
    }
    
}
