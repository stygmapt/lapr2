/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.states;

import lapr.project.model.Exposicao;

/**
 *
 * @author Gabriel
 */
public class ExposicaoStateConflitosDetetados implements ExposicaoState {

	private Exposicao m_expo;

	public ExposicaoStateConflitosDetetados(Exposicao expo) {
		this.m_expo = expo;
	}

	@Override
	public boolean valida() {
		return this.m_expo.valida();
	}

	@Override
	public boolean setCriada() {
		return false;
	}

	@Override
	public boolean setFAESemDemonstracao() {
		return false;
	}

	@Override
	public boolean setDemonstracaoSemFAE() {
		return false;
	}

	@Override
	public boolean setCompleta() {
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
		return true;
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

}
