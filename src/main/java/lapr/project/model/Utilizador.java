/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

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
		if (nome != null) {
			this.m_sNome = nome;
		} else {
			throw new IllegalArgumentException("O nome inserido é nulo");
		}
	}

	public String getEmail() {
		return m_sEmail;
	}

	public void setEmail(String email) {
		if (email != null) {
			this.m_sEmail = email;
		} else {
			throw new IllegalArgumentException("O e-mail inserido é nulo.");
		}
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
		if (username != null) {
			this.m_sUserName = username;
		} else {
			throw new IllegalArgumentException("O user name inserido é nulo.");
		}
	}

	public String getPassword() {
		return m_sPassword;
	}

	public void setPassword(String password) {
		if (password != null) {
			this.m_sPassword = password;
		} else {
			throw new IllegalArgumentException("A password inserida é nula.");
		}
	}

	@Override
	public String toString() {
		return String.
			format("[%s, %s, %s]", m_sNome, m_sEmail, m_sUserName, m_sPassword);
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
}
