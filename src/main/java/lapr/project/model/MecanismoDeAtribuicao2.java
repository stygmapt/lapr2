/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class MecanismoDeAtribuicao2 implements MecanismoDeAtribuicao {

	public MecanismoDeAtribuicao2() {

	}

	@Override
	public List<Atribuicao> novaAssosiacao(Exposicao e, int i) {
		List<Candidatura> listaCandidatura = e.getRegistoCandidaturas().
			getListaCandidaturas();
		List<Atribuicao> m_listaAtribuicao = new ArrayList<>();
		List<FAE> listaFAE = e.getListaFae().getLista();
		for (Candidatura cand : listaCandidatura) {
			while (i != 0) {
				for (FAE fae : listaFAE) {
					Atribuicao atribuicao = new Atribuicao(cand, fae);
					i--;
					m_listaAtribuicao.add(atribuicao);
				}
			}
		}
		return m_listaAtribuicao;
	}

	@Override
	public String toString() {
		return "MecanismoAtribuicao2 - 5 FAE's por Candidatura";
	}

}
