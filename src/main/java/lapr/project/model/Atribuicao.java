/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Objects;

/**
 *
 * @author Eduardo
 */
public class Atribuicao {

	private Candidatura m_candidatura;
	private FAE m_FAE;

	public Atribuicao(Candidatura candidatura, FAE fae) {
		this.m_candidatura = candidatura;
		this.m_FAE = fae;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Atribuicao other = (Atribuicao) obj;
		if (!Objects.equals(this.m_candidatura, other.m_candidatura)) {
			return false;
		}
		if (!Objects.equals(this.m_FAE, other.m_FAE)) {
			return false;
		}
		return true;
	}

}
