/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Gabriel
 */
public class Utilizador implements Serializable{

	private String m_sNome;
	private String m_sEmail;
	private String m_sUserName;
	private String m_sPassword;

	public Utilizador() {
	}

	public Utilizador(String sNome, String userName,String sEmail, String pw) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		this.m_sNome = sNome;
		this.m_sEmail = sEmail;
		this.m_sUserName = userName;
                MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
                byte messageDigest[] = algorithm.digest(pw.getBytes("UTF-8"));
            
                StringBuilder hexString = new StringBuilder();
                for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
                }
                String senha = hexString.toString();
                this.m_sPassword = senha;
	}

	public boolean hasID(String strId) {
		return m_sUserName.equalsIgnoreCase(strId);
	}
        
	public String getNome() {
		return m_sNome;
	}

	public String getUsername() {
		return m_sUserName;
	}

	public String getEmail() {
		return m_sEmail;
	}
 
	public String getPassword() {
		return m_sPassword;
	}
        
	public void setEmail(String email) {
            if ((email == null) || (!verificarPadraoMail(email))) {
                throw new IllegalArgumentException("Email incorreto!");
            }
            this.m_sEmail = email;
		
	}

        public void setNome(String nome) {
            if (nome == null || nome.trim().isEmpty()) {
                    throw new IllegalArgumentException("Insira o nome!");
            }
            this.m_sNome = nome;
	}

	public void setUsername(String username) {
		if (username == null || username.trim().isEmpty()) {
                    throw new IllegalArgumentException("Insira o username!");
                }
                this.m_sUserName = username;
	}
       

	public void setPassword(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
            if (password == null || password.trim().isEmpty()) {
                throw new IllegalArgumentException("insira a password!");
            }
            MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = algorithm.digest(password.getBytes("UTF-8"));
            
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            String senha = hexString.toString();
            this.m_sPassword = senha;
        }

	@Override
	public String toString() {
		return String.
			format("[%s,%s,%s]", m_sNome, m_sEmail, m_sUserName);
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
