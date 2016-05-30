/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;

/**
 *
 * @author Gabriel
 */
public class DefinirRecursoController {
    private final CentroExposicoes m_ce;
    
    public DefinirRecursoController(CentroExposicoes ce){
        this.m_ce=ce;
    }  

    public boolean ConfirmaRegistoRecurso(String dsc){
        return m_ce.adicionaRecurso(dsc);
    }
}
