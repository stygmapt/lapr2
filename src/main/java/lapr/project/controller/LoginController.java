/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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

	public boolean tryLogin(String nome, String pw) throws NoSuchAlgorithmException, UnsupportedEncodingException {
                if(m_centro.getUtilizadoresRegistados().getLista().isEmpty()){System.out.println("Esta vazia");}
                
                MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
                byte messageDigest[] = algorithm.digest(pw.getBytes("UTF-8"));
            
                StringBuilder hexString = new StringBuilder();
                for (byte b : messageDigest) {
                    hexString.append(String.format("%02X", 0xFF & b));
                }
                
                String senha = hexString.toString();
		for (Utilizador u : m_centro.getUtilizadoresRegistados().getLista()) {
                        System.out.println("Ut -- "+ u.toString());
			if (nome.equalsIgnoreCase(u.getUsername()) && senha.equalsIgnoreCase(u.getPassword())) {
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
