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
 * @author Tiago
 */
public class RegistoExposicoes {

	private final List<Exposicao> listaExposições;

	public RegistoExposicoes() {
		listaExposições = new ArrayList<>();
	}

	public Exposicao novaExposição() {
		return new Exposicao();
	}

	public boolean registaExposição(Exposicao e) {
		if (validaExposição(e)) {
			return addExposição(e);
		} else {
			return false;
		}
	}

	public boolean validaExposição(Exposicao e) {
		return e.valida();
	}

	public List<Exposicao> getListaExposições() {
		return this.listaExposições;
	}

//    public List<Exposicao> getListaExposições(FAE fae) {
//        List<Exposicao> list = new ArrayList<>();
//        for (Exposicao e : listaExposições) {
//            for (FAE f : e.getRegistoFAE().getListaFAE()) {
//                if (fae.getUtilizador().getUser().equals(f.getUtilizador().getUser())) {
//                    list.add(e);
//                }
//            }
//        }
//        return list;
//    }
	public boolean addExposição(Exposicao exp) {
		return this.listaExposições.add(exp);
	}

	public List<Exposicao> getListaExposicoesDoOrganizador(Utilizador user) {
		List<Exposicao> listaExpoOrg = new ArrayList<>();
		for (Exposicao exposicao : listaExposições) {
			for (Organizador org : exposicao.getListaOrganizador().
				getLista()) {
				if (org.getUtilizador().getUsername().equalsIgnoreCase(user.
					getUsername())) {
					listaExpoOrg.add(exposicao);
				}
			}
		}
		return listaExpoOrg;
	}

	public List<Exposicao> getExposicoesCandidaturasAbertas(Utilizador user) {
		List<Exposicao> listaExpoOrg = new ArrayList<>();
		for (Exposicao exposicao : listaExposições) {
			if (exposicao.isCandidaturasAbertas()) {
				listaExpoOrg.add(exposicao);
			}
		}
		return listaExpoOrg;
	}

	public List<Candidatura> getListaCandidaturasRepresentante(Utilizador user) {
		List<Candidatura> listaCandidaturasRepresentante = new ArrayList<>();
		for (Exposicao e : this.listaExposições) {
			for (Candidatura candidatura : e.getRegistoCandidaturas().
				getListaCandidaturas()) {
				if (candidatura.isInSubmissao()) {
					if (candidatura.getRepresentante().equals(user)) {
						listaCandidaturasRepresentante.add(candidatura);
					}
				}
			}
		}
		return listaCandidaturasRepresentante;
	}

	public Exposicao getExposicaoPorCand(Candidatura c) {
		for (Exposicao e : listaExposições) {
			for (Candidatura cand : e.getRegistoCandidaturas().
				getListaCandidaturas()) {
				if (cand.equals(c)) {
					return e;
				}
			}
		}
		return null;
	}

	public List<Candidatura> getCandidaRemovidas() {
		List<Candidatura> lst = new ArrayList<>();
		for (Exposicao expo : listaExposições) {
			for (Candidatura c : expo.getRegistoCandidaturasRemovidas().
				getListaCandidaturas()) {
				lst.add(c);
			}
		}
		return lst;
	}

	public List<Exposicao> getListaExposicoesdoOrganizadorComConflitos(
		Utilizador user) {
		List<Exposicao> listaExposicao = new ArrayList<>();
		for (Exposicao expo : listaExposições) {
			for (Organizador org : expo.getListaOrganizador().getLista()) {
				if (org.getUtilizador().getUsername().equalsIgnoreCase(user.
					getUsername()) || expo.isInConflitosAlterados()) {
					listaExposicao.add(expo);
				}
			}
		}
		return listaExposicao;
	}

	public List<Exposicao> getExposicoesByFAE(Utilizador u) {
		List<Exposicao> listaExposicao = new ArrayList<>();
		for (Exposicao e : this.listaExposições) {
			for (FAE fae : e.getListaFae().getLista()) {
				if (fae.getUtilizador().equals(u)) {
					listaExposicao.add(e);
				}
			}
		}
		return listaExposicao;
	}

	public List<Exposicao> getListaExposicoesdoFae(Utilizador user) {
		List<Exposicao> listaExposicaoFAE = new ArrayList<>();
		for (Exposicao exposicao : listaExposicaoFAE) {
			if (exposicao.isCandidaturaAtribuidas()) {
				for (FAE exposicao1 : exposicao.getListaFae().getLista()) {
					if (exposicao1.getUtilizador().equals(user)) {
						listaExposicaoFAE.add(exposicao);
					}
				}
			}
		}
		return listaExposicaoFAE;
	}

}
