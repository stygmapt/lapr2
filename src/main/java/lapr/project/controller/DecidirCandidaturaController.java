/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Atribuicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Utilizador;

/**
 *
 * @author Eduardo
 */
public class DecidirCandidaturaController {

	private CentroExposicoes m_centro;
	private Exposicao m_expo;
	private Atribuicao atribuicao;

	public DecidirCandidaturaController(CentroExposicoes centro) {
		this.m_centro = centro;
	}

	public List<Exposicao> getListaExposicoesdoFae(Utilizador user) {
		return this.m_centro.getRegistoExposicoes().
			getListaExposicoesdoFae(user);
	}

	public List<Atribuicao> getListaCandidatura(Exposicao expo) {
		this.m_expo = expo;
		return this.m_expo.getRegistoAtribuicoes().getListaAtribuicao();
	}

	public String getInformacaoDaCandidaturaPorAvaliar(Atribuicao atribuir) {
		this.atribuicao = atribuir;
		return atribuicao.getCandidatura().toString();
	}

	public void novaAvaliacao() {
            
	}
}
