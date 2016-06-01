/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Organizador;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.Utilizador;

/**
 *
 * @author Gabriel
 */
public class CriarExposicaoController {
    private final CentroExposicoes m_ce;
    private final RegistoExposicoes registo;
    private Exposicao expo;
    
    public CriarExposicaoController(CentroExposicoes ce){
        this.m_ce=ce;
        registo=this.m_ce.getRegistoExposicoes();
    }
    
    public Exposicao novaExposicao(){
        this.expo = this.registo.novaExposição();
        return this.expo;
    }
    
    public void setDados(String titulo, String desc, Date dataInicio, Date dataFim,
					  Date DataInicioSub, Date dataFimsub, String local, Date dataAvaliacoes){
        this.expo.setTitulo(titulo);
        this.expo.setDatasRealização(dataInicio, dataFim);
        this.expo.setPeriodoSubmissão(DataInicioSub, dataFimsub);
        this.expo.setLocal(local);
        this.expo.setDataLimiteAvaliacoes(dataAvaliacoes);
        
    }
    
    public void addOrganizador(Utilizador u){
        this.expo.getListaOrganizador().addOrganizador(u);
    }
    
    public void confirmarRegistoExposicao(){
        this.registo.addExposição(this.expo);
    }
    
    public List<Utilizador> getRegistoUtilizadores(){
        return this.m_ce.getUtilizadoresRegistados().getLista();
    }
    
    public List<Utilizador> getOrganizadoresInseridos(){
        List<Utilizador> list = new ArrayList<>();
        for(Organizador o:this.expo.getListaOrganizador().getLista()){
            list.add(o.getUtilizador());
        }
        return list;
    }
}

