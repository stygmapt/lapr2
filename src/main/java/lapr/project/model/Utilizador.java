/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Gabriel
 */
public class Utilizador {

	private String m_sNome;
	private String m_sEmail;
	private String m_sUserName;
	private String m_sPassword;
	private Boolean m_register;

	public Utilizador() {
	}

	public Utilizador(String sNome, String sEmail, String pw) {
		this.m_sNome = sNome;
		this.m_sEmail = sEmail;
		this.m_sUserName = sNome;
		this.m_sPassword = pw;
		this.m_register = false;
	}

	public boolean hasID(String strId) {
		return m_sUserName.equalsIgnoreCase(strId);
	}

	public String getID() {
		return m_sUserName;
	}

	public String getNome() {
		return m_sNome;
	}

	public void setNome(String nome) {
            if (nome == null || nome.trim().isEmpty()) {
                    throw new IllegalArgumentException("Insira o nome!");
            }
            this.m_sNome = nome;
	}

	public String getEmail() {
		return m_sEmail;
	}

	public void setEmail(String email) {
            if ((email == null) || (!verificarPadraoMail(email))) {
                throw new IllegalArgumentException("Email incorreto!");
            }
            this.m_sEmail = email;
		
	}

	public String getUsername() {
		return m_sUserName;
	}

	public Boolean getM_register() {
		return m_register;
	}

	public void setM_register(Boolean m_register) {
		this.m_register = m_register;
	}

	public void setUsername(String username) {
		if (username == null || username.trim().isEmpty()) {
                    throw new IllegalArgumentException("Insira o username!");
                }
                this.m_sUserName = username;
	}
        
	public String getPassword() {
		return m_sPassword;
	}

	public void setPassword(String password) {
            if (password == null || password.trim().isEmpty()) {
                throw new IllegalArgumentException("insira a password!");
            }
            this.m_sPassword = password;
        }

	@Override
	public String toString() {
		return String.
			format("[%s,%s, %s, %s]", m_sNome, m_sEmail, m_sUserName, m_sPassword);
	}

	public boolean valida() {
		return true;
	}

	public boolean equals(Utilizador u) {
		if (this == u) {
			return true;
		}
		if (u != null) {
			return hasID(u.m_sUserName);
		}
		return false;
	}
        
        /**
     * Verifica se um determinado email é ou não válido
     * @param email 
     * @return true se for valido false se nao for
     */
    private static boolean verificarPadraoMail(String email) {
        String padraoValido = "\\b(^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@([A-Za-z0-9-])+(\\.[A-Za-z0-9-]+)*((\\.[A-Za-z0-9]{2,})|(\\.[A-Za-z0-9]{2,}\\.[A-Za-z0-9]{2,}))$)\\b";
        Pattern p = Pattern.compile(padraoValido, Pattern.CASE_INSENSITIVE);
        Matcher matcher = p.matcher(email);
        return matcher.matches();
    }
}
