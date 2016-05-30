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
                if(m_centro.getUtilizadoresRegistados().getLista().isEmpty()){System.out.println("Esta vazia");}
                
		for (Utilizador u : m_centro.getUtilizadoresRegistados().getLista()) {
                        System.out.println("Ut -- "+ u.toString());
			if (nome.equalsIgnoreCase(u.getUsername()) && pw.equalsIgnoreCase(u.getPassword())) {
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
