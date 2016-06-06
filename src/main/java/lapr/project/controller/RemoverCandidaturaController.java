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
    private RegistoExposicoes regExp;
    private Exposicao exp;
    private RegistoCandidaturas regCand;
    private RegistoCandidaturasRemovidas regCandRemovidas;
    
    public RemoverCandidaturaController(CentroExposicoes c){
        this.m_ce = c;
    }
    
    public List<Exposicao> getListExposicoes(Utilizador user){
        return  this.m_ce.getRegistoExposicoes().getExposicoesCandidaturasAbertas(user);            
    }
    
    public List<Candidatura> getListCandidaturasPorRepres(Utilizador representante){
        List<Candidatura> listaCandidaturasRepresentante = new ArrayList<>();
        listaCandidaturasRepresentante = this.regExp.getListaCandidaturasRepresentante(representante);
        return listaCandidaturasRepresentante;
    }
    
    public void getExposicaoPorCandidatura(Candidatura c){
        this.exp = this.m_ce.getRegistoExposicoes().getExposicaoPorCand(c);
        this.regCand = this.exp.getRegistoCandidaturas();
        this.regCand.remove(c);
        this.regCandRemovidas = this.exp.getRegistoCandidaturasRemovidas();
        this.regCandRemovidas.registaCandidaturaRemovida(c);
        
    }
    
    
}
