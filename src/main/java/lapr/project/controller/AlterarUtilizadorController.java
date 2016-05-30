/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;

/**
 *
 * @author Gabriel
 */
public class AlterarUtilizadorController {
     private final CentroExposicoes m_ce;
    private Utilizador m_utilizadorAAlterar;
    
    public AlterarUtilizadorController(CentroExposicoes ce){
        this.m_ce=ce;
    }    
    
    public Utilizador getUtilizadorByUserName(String usrName){
        return m_ce.getUtilizadoresRegistados().getUtilizadorByUserName(usrName);
    }
}
