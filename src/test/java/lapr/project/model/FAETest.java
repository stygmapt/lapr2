/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.UnsupportedEncodingException;
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
public class FAETest {

	private Utilizador u;
	private FAE fae;

	public FAETest() throws UnsupportedEncodingException {
		u = new Utilizador();
		u.setEmail("114130@isep.ipp.pt");
		u.setNome("Sigma");
		try {
			u.setPassword("stygma");
		} catch (NoSuchAlgorithmException ex) {
			System.out.println("" + ex.getMessage());
		}
		u.setUsername("stygma");
		fae = new FAE();

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
	 * Test of getUtilizador method, of class FAE.
	 */
	@Test
	public void testGetUtilizador() {
		System.out.println("getUtilizador");
		fae.setUtilizador(u);
		assertEquals(u, fae.getUtilizador());
	}

	/**
	 * Test of setUtilizador method, of class FAE.
	 */
	@Test
	public void testSetUtilizador() {
		System.out.println("setUtilizador");
		fae.setUtilizador(u);
		assertEquals(u, fae.getUtilizador());
	}

	/**
	 * Test of toString method, of class FAE.
	 */
	@Test
	public void testToString() {
		System.out.println("toString");
		fae.setUtilizador(u);
		String toString = fae.toString();
		assertEquals(toString, fae.toString());
	}

}
