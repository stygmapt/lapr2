/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.states;

import lapr.project.model.Exposicao;

/**
 *
 * @author Eduardo
 */
public class ExposicaoStateDemonstracaoSemFAE implements ExposicaoState {

	private Exposicao m_expo;

	public ExposicaoStateDemonstracaoSemFAE(Exposicao e) {
		this.m_expo = e;
	}

	@Override
	public boolean valida() {
		return m_expo.valida();
	}

	@Override
	public boolean setCriada() {
		return false;
	}

	@Override
	public boolean setFAESemDemonstracao() {
		return true;
	}

	@Override
	public boolean setDemonstracaoSemFAE() {
		return false;
	}

	@Override
	public boolean setCompleta() {
		// TIMMER
		return false;
	}

	@Override
	public boolean setCandidaturaAberta() {
		return false;
	}

	@Override
	public boolean setCandidaturaTerminada() {
		return false;
	}

	@Override
	public boolean setConflitoDetetados() {
		return false;
	}

	@Override
	public boolean setConflitoAlterados() {
		return false;
	}

	@Override
	public boolean setCandidaturaAtribuidas() {
		return false;
	}

	@Override
	public boolean setCandidaturaAvaliada() {
		return false;
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}

}
