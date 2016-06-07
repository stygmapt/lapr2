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
public class RegistoAtribuicoes implements MecanismoDeAtribuicao {

	private List<Atribuicao> m_listaAtribuicao;

	public RegistoAtribuicoes() {
		m_listaAtribuicao = new ArrayList<>();
	}

	public boolean adicionarAtribuicao(Atribuicao atribuicao) {
		return m_listaAtribuicao.add(atribuicao);
	}

	public List<Atribuicao> getListaAtribuicao() {
		return m_listaAtribuicao;
	}

	public List<Atribuicao> novaAssosiacao(Exposicao e, int i) {
		List<Candidatura> listaCandidatura = e.getRegistoCandidaturas().
			getListaCandidaturas();
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

	public void registaAtribuicao(List<Atribuicao> lista) {
		this.m_listaAtribuicao = lista;
	}
}
