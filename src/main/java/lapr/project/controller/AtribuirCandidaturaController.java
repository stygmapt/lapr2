/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Atribuicao;
import lapr.project.model.Candidatura;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.MecanismoDeAtribuicao;
import lapr.project.model.Utilizador;
import lapr.project.states.CandidaturaStateEmAvaliacao;
import lapr.project.states.ExposicaoStateCandidaturasAtribuidas;

/**
 *
 * @author Eduardo
 */
public class AtribuirCandidaturaController {

	private CentroExposicoes m_centro;
	private Exposicao m_exposicao;
	private MecanismoDeAtribuicao m_atribuicao;
	private List<Atribuicao> listaAtribuicoes;

	public AtribuirCandidaturaController(CentroExposicoes centro) {
		this.m_centro = centro;
		this.listaAtribuicoes = new ArrayList<>();
	}

	public List<Exposicao> getListaExposicoesdoOrganizadorComConflitos(
		Utilizador user) {
		return this.m_centro.getRegistoExposicoes().
			getListaExposicoesdoOrganizadorComConflitos(user);
	}

	public void setExposicao(Exposicao expo) {
		this.m_exposicao = expo;
	}

	public List<MecanismoDeAtribuicao> getListaMecanismo() {
		return this.m_centro.getM_regMecanismos().getListaMecanismo();
	}

	public void setMecanismo(MecanismoDeAtribuicao meca) {
		this.m_atribuicao = meca;
	}

	public List<Atribuicao> getListaAtribuicoes() {
		this.listaAtribuicoes = this.m_exposicao.getRegistoAtribuicoes().
			novaAssosiacao(this.m_exposicao, 5);
		return this.listaAtribuicoes;
	}

	public void RegistaAtribuicao() {
		this.m_exposicao.getRegistoAtribuicoes().
			registaAtribuicao(listaAtribuicoes);
	}

	public boolean alteraEstadoExposicao() {
		if (this.m_exposicao.isInConflitosAlterados()) {
			this.m_exposicao.
				setState(new ExposicaoStateCandidaturasAtribuidas(this.m_exposicao));
			return true;
		} else {
			return false;
		}
	}

	public boolean changeStateAvaliado() {
		if (this.m_exposicao.isInConflitosAlterados()) {
			for (Candidatura cand : this.m_exposicao.getRegistoCandidaturas().
				getListaCandidaturas()) {
				cand.setState(new CandidaturaStateEmAvaliacao(cand));
			}
			return true;
		} else {
			return false;
		}
	}
}
