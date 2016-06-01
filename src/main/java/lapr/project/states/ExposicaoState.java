/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.states;

/**
 *
 * @author Eduardo
 */
public interface ExposicaoState {

	public boolean valida();

	public boolean setCriada();

	public boolean setFAESemDemonstracao();

	public boolean setDemonstracaoSemFAE();

	public boolean setCompleta();

	public boolean setCandidaturaAberta();

	public boolean setCandidaturaTerminada();

	public boolean setConflitoDetetados();

	public boolean setConflitoAlterados();

	public boolean setCandidaturaAtribuidas();

	public boolean setCandidaturaAvaliada();

}
