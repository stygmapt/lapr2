/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.RegistoTiposConflito;
import lapr.project.model.TipoConflito;

/**
 *
 * @author Gabriel
 */
public class CriarTipoConflitoController {
    private final CentroExposicoes m_ce;
    private final RegistoTiposConflito registo;
    private TipoConflito novoConflito;
    
    public CriarTipoConflitoController(CentroExposicoes ce){
        this.m_ce=ce;
        registo=this.m_ce.getRegTiposConflito();
        this.novoConflito=registo.novoTipoConflito();
    }
    
    public void setDescricao(String dsc){
        this.novoConflito.setDescricao(dsc);
    }
    
    public void registaConflito(){
        this.registo.registaTipoConflito(this.novoConflito);
    }
}
