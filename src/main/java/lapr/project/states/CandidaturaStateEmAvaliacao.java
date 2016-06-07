/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.states;

import lapr.project.model.Candidatura;

/**
 *
 * @author Gabriel
 */
public class CandidaturaStateEmAvaliacao implements CandidaturaState {

	private Candidatura m_candidatura;

	public CandidaturaStateEmAvaliacao(Candidatura cand) {
		this.m_candidatura = cand;
	}

	@Override
	public boolean valida() {
		return this.m_candidatura.valida();
	}

	@Override
	public boolean setEmSubmissao() {
		return false;
	}

	@Override
	public boolean setEmAvaliaçao() {
		return true;
	}

	@Override
	public boolean setNaoAvaliada() {
		return false;
	}

	@Override
	public boolean setAvaliada() {
		return true;
	}

	@Override
	public boolean setAceite() {
		return false;
	}

	@Override
	public boolean setRejeitada() {
		return false;
	}

}
