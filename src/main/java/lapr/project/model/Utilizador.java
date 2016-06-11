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
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import lapr.project.utils.Exportable;
import lapr.project.utils.Importable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 *
 * @author Gabriel
 */
public class Utilizador implements Serializable, Importable<Utilizador>, Exportable {

	private String m_sNome;
	private String m_sEmail;
	private String m_sUserName;
	private String m_sPassword;
	private static final String ROOT_ELEMENT_NAME = "Utilizador";
	private static final String NAME_ELEMENT_NAME = "nome";
	private static final String USERNAME_ELEMENT_NAME = "username";
	private static final String EMAIL_ELEMENT_NAME = "email";
	private static final String PASS_ELEMENT_NAME = "password";

	public Utilizador() {
	}

	public Utilizador(String sNome, String userName, String sEmail, String pw) throws NoSuchAlgorithmException, UnsupportedEncodingException {
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
		if (this == null) {
			return false;
		}
		if (u != null) {
			return u.getUsername().equalsIgnoreCase(this.getUsername());
		}
		return false;
	}

	/**
	 * Verifica se um determinado email é ou não válido
	 *
	 * @param email
	 * @return true se for valido false se nao for
	 */
	private static boolean verificarPadraoMail(String email) {
		String padraoValido = "\\b(^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@([A-Za-z0-9-])+(\\.[A-Za-z0-9-]+)*((\\.[A-Za-z0-9]{2,})|(\\.[A-Za-z0-9]{2,}\\.[A-Za-z0-9]{2,}))$)\\b";
		Pattern p = Pattern.compile(padraoValido, Pattern.CASE_INSENSITIVE);
		Matcher matcher = p.matcher(email);
		return matcher.matches();
	}

	@Override
	public Utilizador importContentFromXMLNode(Node node) {
		return null;
	}

	@Override
	public Node exportContentToXMLNode() {
		Node rootNode = null;

		try {
			DocumentBuilderFactory factory
				= DocumentBuilderFactory.newInstance();
			//Create document builder
			DocumentBuilder builder = factory.newDocumentBuilder();

			//Obtain a new document
			Document document = builder.newDocument();

			//Create root element
			Element elementUtilizador = document.
				createElement(ROOT_ELEMENT_NAME);

			//Create a sub-element
			Element elementDescription = document.
				createElement(USERNAME_ELEMENT_NAME);
			Element elementName = document.createElement(NAME_ELEMENT_NAME);
			Element elementEmail = document.createElement(EMAIL_ELEMENT_NAME);
			Element elementPass = document.createElement(PASS_ELEMENT_NAME);
			//Set the sub-element value
			elementDescription.setTextContent(getUsername());
			elementName.setTextContent(getNome());
			elementEmail.setTextContent(getEmail());
			elementPass.setTextContent(getPassword());
			//Add sub-element to root element
			elementUtilizador.appendChild(elementDescription);
			elementUtilizador.appendChild(elementName);
			elementUtilizador.appendChild(elementEmail);
			elementUtilizador.appendChild(elementPass);
			//Create a sub-element

			//Add root element to document
			document.appendChild(elementUtilizador);

			//It exports only the element representation to XMÇ, ommiting the XML header
			rootNode = elementUtilizador;

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return rootNode;
	}
}
