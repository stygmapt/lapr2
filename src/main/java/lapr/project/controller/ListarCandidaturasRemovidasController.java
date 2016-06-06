/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;

/**
 *
 * @author Pedro
 */
public class ListarCandidaturasRemovidasController {
    private final CentroExposicoes centro;

    public ListarCandidaturasRemovidasController(CentroExposicoes c) {
        this.centro = c;
    }
    
    public List<Candidatura> getCandidaturasRemovidas(){
        return this.centro.getRegistoExposicoes().getCandidaRemovidas();
    }
    
}
