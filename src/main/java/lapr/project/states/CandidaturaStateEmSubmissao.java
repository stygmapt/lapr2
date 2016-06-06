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
public class CandidaturaStateEmSubmissao implements CandidaturaState {

	private Candidatura m_candidatura;

	public CandidaturaStateEmSubmissao(Candidatura candidatura) {
		this.m_candidatura = candidatura;
	}

	@Override
	public boolean valida() {
		return m_candidatura.valida();
	}

	@Override
	public boolean setEmSubmissao() {
		return true;
	}

	@Override
	public boolean setEmAvaliaçao() {
		return false;
	}

	@Override
	public boolean setNaoAvaliada() {
		return false;
	}

	@Override
	public boolean setAvaliada() {
		return false;
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
