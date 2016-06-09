/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

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
public class RecursoTest {

	private Recurso recursoTest;

	public RecursoTest() {
		this.recursoTest = new Recurso();
		this.recursoTest.setDescricao("JUnit");
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
	 * Test of getDescricao method, of class Recurso.
	 */
	@Test
	public void testGetDescricao() {
		System.out.println("getDescricao");
		String expResult = "JUnit";
		String result = recursoTest.getDescricao();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setDescricao method, of class Recurso.
	 */
	@Test
	public void testSetDescricao() {
		String descricao = "Recurso1";
		recursoTest.setDescricao(descricao);
		String expResult = descricao;
		String result = recursoTest.getDescricao();
		assertEquals(expResult, result);
	}

	/**
	 * Test of toString method, of class Recurso.
	 */
	@Test
	public void testToString() {
		System.out.println("toString");
		System.out.println(recursoTest.toString());
		String expResult = "recurso: JUnit";
		String result = recursoTest.toString();
		assertEquals(expResult, result);
	}

}
