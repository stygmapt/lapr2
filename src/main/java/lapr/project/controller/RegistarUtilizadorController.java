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
public class RegistarUtilizadorController {
    private final CentroExposicoes m_ce;
    private Utilizador m_novoUt;
    
    public RegistarUtilizadorController(CentroExposicoes ce){
        this.m_ce=ce;
        this.m_novoUt = novoUtilizador();
    }  
    
    
    public Utilizador novoUtilizador(){
        return new Utilizador();
    }
    
    public void setDados(String nome,String mail,String m){
        m_novoUt.setNome(nome);
        m_novoUt.setEmail(mail);
        m_novoUt.setUsername(mail);
        m_novoUt.setPassword(m);
    }

    public boolean registaUtilizador(Utilizador u){
        return m_ce.registaUtilizador(u);
    }
}
