/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Utilizador;
import lapr.project.model.Candidatura;
import lapr.project.model.ListaProdutos;
import lapr.project.model.Produto;
import lapr.project.model.RegistoCandidaturas;

/**
 *
 * @author Gabriel
 */
public class CriarCandidaturaExposicaoController {
    private final CentroExposicoes m_ce;
    private Candidatura novaCandidatura;
    private ListaProdutos regprodutos;
    private RegistoCandidaturas regCandidaturas;
    private Produto produto;
    
    public CriarCandidaturaExposicaoController(CentroExposicoes ce){
        this.m_ce=ce;
    } 
    
    public List<Exposicao> getListExposicoes(Utilizador user){
        return  this.m_ce.getRegistoExposicoes().getExposicoesCandidaturasAbertas(user);            
    }
    
    public void criarCandidatura(Exposicao expoSelected){
        this.regCandidaturas=expoSelected.getRegistoCandidaturas();
        this.novaCandidatura = this.regCandidaturas.novaCandidatura();
        this.regprodutos=this.novaCandidatura.getLista_produtos();
    }
    
    public void setDados(String nome_Empresa, Utilizador representante, float area, String morada_Empresa, int tlm, int qtdCnvt){
        this.novaCandidatura.setNome_Empresa(nome_Empresa);
        this.novaCandidatura.setRepresentante(representante);
        this.novaCandidatura.setArea_Empresa(area);
        this.novaCandidatura.setMorada_Empresa(morada_Empresa);
        this.novaCandidatura.setTelemovel_Empresa(tlm);
        this.novaCandidatura.setQtd_convites(qtdCnvt);
    }
    
    public void novoProduto(){
        this.produto = this.novaCandidatura.getLista_produtos().novoProduto();
    }
    
    public void setDesignacao(String desc){
        this.produto.setDesignacao_produto(desc);
    }
    
    public void addPalavraChave(String plvr){
        this.produto.addPalavraChave(plvr);
    }
    
    public void confirmaProduto(){
        this.regprodutos.adicionaProduto(this.produto);   
    }
    
    public void registaCandidatura(){
        this.regCandidaturas.registaCandidatura(this.novaCandidatura);
    }
    
    public Produto getProduto(){
        return this.produto;
    }

    public List<Produto> getListProdutos() {
        return this.novaCandidatura.getLista_produtos().getLista();
    }
}
