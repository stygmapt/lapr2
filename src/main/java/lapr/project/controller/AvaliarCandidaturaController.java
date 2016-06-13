/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Atribuicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.Utilizador;

/**
 *
 * @author Gabriel
 */
public class AvaliarCandidaturaController {
        private final CentroExposicoes m_centro;
	private Exposicao m_exposicao;
	private final RegistoExposicoes m_RegExposicao;

	public AvaliarCandidaturaController(CentroExposicoes centro) {
		this.m_centro = centro;
                this.m_RegExposicao=this.m_centro.getRegistoExposicoes();
	}
        
        public List<Exposicao> getListaExposicoesByFAE(Utilizador u){
            return this.m_RegExposicao.getExposicoesByFAE(u);
        }
        
        public void selectExpo(Exposicao expo){
            this.m_exposicao=expo;
        }
        
        public List<Atribuicao> getListaAtribuicaoesPorAvaliar(Utilizador u){
            return this.m_exposicao.getRegistoAtribuicoes().getAtribuicoesPorAvaliarByFAE(u);
            
        }
        
        
}
