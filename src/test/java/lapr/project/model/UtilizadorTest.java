/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Gabriel
 */
public class UtilizadorTest {

	public UtilizadorTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	/**
	 * Test of hasID method, of class Utilizador.
	 */
	@Test
	public void testHasID() {
		System.out.println("hasID");
		String strId = "id";
		Utilizador instance = new Utilizador();
		instance.setUsername(strId);
		boolean expResult = true;
		boolean result = instance.hasID(strId);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getNome method, of class Utilizador.
	 */
	@Test
	public void testGetNome() {
		System.out.println("getNome");
		Utilizador instance = new Utilizador();
		instance.setNome("nome");
		String expResult = "nome";
		String result = instance.getNome();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setNome method, of class Utilizador.
	 */
	@Test
	public void testSetNome() {
		System.out.println("setNome");
		String nome = "Gabriel";
		Utilizador instance = new Utilizador();
		instance.setNome(nome);
		String expResult = instance.getNome();
		assertEquals(expResult, nome);
	}

	/**
	 * Test of getEmail method, of class Utilizador.
	 */
	@Test
	public void testGetEmail() {
		System.out.println("getEmail");
		Utilizador instance = new Utilizador();
		instance.setEmail("gabriel@hotmail.com");
		String expResult = "gabriel@hotmail.com";
		String result = instance.getEmail();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setEmail method, of class Utilizador.
	 */
	@Test
	public void testSetEmail() {
		System.out.println("setEmail");
		String email = "jony@hotmail.com";
		Utilizador instance = new Utilizador();
		instance.setEmail(email);
		String expResult = instance.getEmail();
		assertEquals(expResult, email);
	}

	/**
	 * Test of getUsername method, of class Utilizador.
	 */
	@Test
	public void testGetUsername() {
		System.out.println("getUsername");
		Utilizador instance = new Utilizador();
		instance.setUsername("gabri");
		String expResult = "gabri";
		String result = instance.getUsername();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setUsername method, of class Utilizador.
	 */
	@Test
	public void testSetUsername() {
		System.out.println("setUsername");
		String username = "user";
		Utilizador instance = new Utilizador();
		instance.setUsername(username);
		String expResult = instance.getUsername();
		assertEquals(expResult, username);
	}

	/**
	 * Test of getPassword method, of class Utilizador.
	 */
	@Test
	public void testGetPassword() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		System.out.println("getPassword");
		Utilizador instance = new Utilizador();
		instance.setPassword("pww");
		String senha = "pww";
		MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
		byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));

		StringBuilder hexString = new StringBuilder();
		for (byte b : messageDigest) {
			hexString.append(String.format("%02X", 0xFF & b));
		}
		String expResult = hexString.toString();
		String result = instance.getPassword();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setPassword method, of class Utilizador.
	 */
	@Test
	public void testSetPassword() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		System.out.println("setPassword");
		String password = "pass";
		MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
		byte messageDigest[] = algorithm.digest(password.getBytes("UTF-8"));

		StringBuilder hexString = new StringBuilder();
		for (byte b : messageDigest) {
			hexString.append(String.format("%02X", 0xFF & b));
		}
		String senha = hexString.toString();
		Utilizador instance = new Utilizador();
		instance.setPassword(password);
		assertEquals(senha, instance.getPassword());
	}

	/**
	 * Test of toString method, of class Utilizador.
	 */
	@Test
	public void testToString() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		System.out.println("toString");
		Utilizador instance = new Utilizador("tiago", "tiago", "tiago", "tiago");
		String expResult = "[tiago,tiago,tiago]";
		String result = instance.toString();
		assertEquals(expResult, result);
	}

	/**
	 * Test of valida method, of class Utilizador.
	 */
	@Test
	public void testValida() {
		System.out.println("valida");
		Utilizador instance = new Utilizador();
		boolean expResult = true;
		boolean result = instance.valida();
		assertEquals(expResult, result);
	}

	/**
	 * Test of equals method, of class Utilizador.
	 */
	@Test
	public void testEquals() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		System.out.println("equals");
		Utilizador instance1 = new Utilizador("tiago", "tiago", "tiago", "tiago");
		Utilizador instance2 = new Utilizador("tiago", "tiago", "tiago", "tiago");
		Utilizador instance3 = new Utilizador("pedro", "pesro", "jj", "jjpw");
		boolean expResult = true;
		boolean expResult2 = false;
		boolean result = instance1.equals(instance2);
		boolean result2 = instance1.equals(instance3);
		assertEquals(expResult, result);
		assertEquals(expResult2, result2);
	}

}
