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
public class CandidaturaStateAceite implements CandidaturaState {

	private Candidatura m_candidatura;

	private CandidaturaStateAceite(Candidatura candidatura) {
		this.m_candidatura = candidatura;
	}

	@Override
	public boolean valida() {
		return m_candidatura.valida();
	}

	@Override
	public boolean setEmSubmissao() {
		return false;
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
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean setAceite() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean setRejeitada() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

}
