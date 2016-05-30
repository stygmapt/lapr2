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
 * @author Gabriel
 */
public class CentroExposicoes {

	private final List<Utilizador> m_lUtilizadoresNConfirmados;
	private final RegistoUtilizadores m_regUtilizadores;

	public CentroExposicoes() {
		this.m_lUtilizadoresNConfirmados = new ArrayList<>();
		this.m_regUtilizadores = new RegistoUtilizadores();
	}

	public boolean registaUtilizador(Utilizador u) {
		if (validaUtilizador(u)) {
			m_lUtilizadoresNConfirmados.add(u);
			return true;
		}
		return false;
	}

	private boolean validaUtilizador(Utilizador u) {
		return !m_regUtilizadores.getLista().contains(u);
	}

	public RegistoUtilizadores getUtilizadoresRegistados() {
		return this.m_regUtilizadores;
	}

	public List<Utilizador> getUtilizadoresNaoConfirmados() {
		return this.m_lUtilizadoresNConfirmados;
	}

	public Utilizador getUtilizadorByUsername(String uId) {
		for (Utilizador u : m_regUtilizadores.getLista()) {
			if (uId.equalsIgnoreCase(u.getUsername())) {
				return u;
			}
		}
		return null;
	}
        
        public Utilizador getUtilizadorByUsernameListNConf(String uId) {
		for (Utilizador u : m_lUtilizadoresNConfirmados) {
			if (uId.equalsIgnoreCase(u.getUsername())) {
				return u;
			}
		}
		return null;
	}
        
	public void confirmaRegistoUtilizador(Utilizador u) {
		this.m_regUtilizadores.addUtilizador(u);
		this.m_lUtilizadoresNConfirmados.remove(u);
	}

}
