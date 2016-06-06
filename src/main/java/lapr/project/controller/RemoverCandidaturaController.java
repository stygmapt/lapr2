/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.RegistoCandidaturas;
import lapr.project.model.RegistoCandidaturasRemovidas;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.Utilizador;

/**
 *
 * @author Joao Sousa
 */
public class RemoverCandidaturaController {
    
    private CentroExposicoes m_ce;
    private Exposicao exp;
    private RegistoCandidaturas regCand;
    private RegistoCandidaturasRemovidas regCandRemovidas;
    
    public RemoverCandidaturaController(CentroExposicoes c){
        this.m_ce = c;
    }
    
    public List<Candidatura> getListCandidaturasPorRepres(Utilizador representante){
        return this.m_ce.getRegistoExposicoes().getListaCandidaturasRepresentante(representante);
    }
    
    public void getExposicaoPorCandidatura(Candidatura c){
        this.exp = this.m_ce.getRegistoExposicoes().getExposicaoPorCand(c);
        this.regCand = this.exp.getRegistoCandidaturas();
        this.regCand.remove(c);
        this.regCandRemovidas = this.exp.getRegistoCandidaturasRemovidas();
        this.regCandRemovidas.registaCandidaturaRemovida(c);
        
    }
    
    
}
