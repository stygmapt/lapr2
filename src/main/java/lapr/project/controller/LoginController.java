/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;

/**
 *
 * @author Eduardo
 */
public class LoginController {

	private CentroExposicoes m_centro;
	private Utilizador m_utlizador;

	public LoginController(CentroExposicoes centro) {
		m_centro = centro;
	}

	public boolean tryLogin(String nome, String pw) {
		for (Utilizador u : m_centro.getUtilizadoresRegistados().getLista()) {
			if (u.getUsername() == nome && u.getPassword() == pw) {
				m_utlizador = u;
				return true;
			}
		}
		return false;
	}

	public Utilizador getUtilizadorLogado() {
		return this.m_utlizador;
	}

}
