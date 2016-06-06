/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.states;

/**
 *
 * @author Gabriel
 */
public interface CandidaturaState {

	public boolean valida();

	public boolean setEmSubmissao();

	public boolean setEmAvaliaçao();

	public boolean setNaoAvaliada();

	public boolean setAvaliada();

	public boolean setAceite();

	public boolean setRejeitada();

}
