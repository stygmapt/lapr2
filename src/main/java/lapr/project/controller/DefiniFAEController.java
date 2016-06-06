/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.Organizador;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.Utilizador;
import lapr.project.states.ExposicaoState;
import lapr.project.states.ExposicaoStateCompleto;
import lapr.project.states.ExposicaoStateCriada;
import lapr.project.states.ExposicaoStateDemonstracaoSemFAE;
import lapr.project.states.ExposicaoStateFAESemDemonstracao;

/**
 *
 * @author Gabriel
 */
public class DefiniFAEController {
    private final CentroExposicoes m_ce;
    private final RegistoExposicoes registoExpos;
    private Exposicao expo;
    public DefiniFAEController(CentroExposicoes ce){
        this.m_ce=ce;
        registoExpos=this.m_ce.getRegistoExposicoes();
    }

    public List<Exposicao> getListExposicoesByOrganizador(Utilizador u){
        List<Exposicao> list = new ArrayList<>();
        for(Exposicao expo:this.registoExpos.getListaExposições()){    
            if(expo.isInCriada() || expo.isDemonstracaoSemFAE()){
                for(Organizador o:expo.getListaOrganizador().getLista()){
                    if(o.getUtilizador().equals(u)){
                        list.add(expo);
                    }
                }
            }
        }
        return list;
    }
    
    public void selectExpo(Exposicao expo){
        this.expo=expo;
    }
    
    public void addOrganizadorFAE(Utilizador u){
        for(Organizador o:this.expo.getListaOrganizador().getLista()){
            if(u.equals(o.getUtilizador())){
                throw new IllegalArgumentException("O utilizador que selecionou já é um organizador da exposição.");
            }
        }
        this.expo.getListaFae().addFAE(u);
    }
    
    public void confirmar(){
        if(this.expo.isInCriada()){
            ExposicaoState state = new ExposicaoStateFAESemDemonstracao(this.expo);
            this.expo.setState(state);
        }
        if(this.expo.isDemonstracaoSemFAE()){
            ExposicaoState state = new ExposicaoStateCompleto(this.expo);
            this.expo.setState(state);
        }
    }
    
    public List<Utilizador> getRegistoUtilizadores(){
        return this.m_ce.getUtilizadoresRegistados().getLista();
    }
    
    public List<Utilizador> getFAEInseridos(){
        List<Utilizador> list = new ArrayList<>();
        for(FAE o:this.expo.getListaFae().getLista()){
            list.add(o.getUtilizador());
        }
        return list;
    }
}
