/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;

/**
 *
 * @author Gabriel
 */
public class ConfirmarUtilizadorController {
    private final CentroExposicoes m_ce;
    private Utilizador m_utilizadorAConfirmar;
    
    public ConfirmarUtilizadorController(CentroExposicoes ce){
        this.m_ce=ce;
    }    
    
    public List<Utilizador> getListaNaoConfirmados(){
        return m_ce.getUtilizadoresNaoConfirmados();
    }
    
    public Utilizador getUtilizadorInfo(String uId){
        m_utilizadorAConfirmar = m_ce.getUtilizadorByUsername(uId);
        return m_utilizadorAConfirmar;
    }
    
    public void confirmaRegistoUtilizador(Utilizador u){
        m_ce.confirmaRegistoUtilizador(u);
    }
}
