/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Eduardo
 */
public class ProdutoTest {

	private Produto produtoTest;
	private String i;
	private String z;

	public ProdutoTest() {
		this.produtoTest = new Produto("Engenharia");
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
	 * Test of getDesignacao_produto method, of class Produto.
	 */
	@Test
	public void testGetDesignacao_produto() {
		System.out.println("getDesignacao_produto");
		String expResult = "Engenharia";
		String result = produtoTest.getDesignacao_produto();
		assertEquals(expResult, result);
	}
	/**
	 * Test of setDesignacao_produto method, of class Produto.
	 */
	@Test
	public void testSetDesignacao_produto() {
		System.out.println("setDesignacao_produto");
		String designacao_produto = "Porto";
		produtoTest.setDesignacao_produto(designacao_produto);
		assertEquals(produtoTest.getDesignacao_produto(), designacao_produto);
	}

//	/**
//	 * Test of toString method, of class Produto.
//	 */
//	@Test
//	public void testToString() {
//		System.out.println("toString");
//		Produto instance = new Produto();
//		String expResult = "";
//		String result = instance.toString();
//		assertEquals(expResult, result);
//	}
//
//	/**
//	 * Test of getNrPalavrasChaves method, of class Produto.
//	 */
//	@Test
//	public void testGetNrPalavrasChaves() {
//		System.out.println("getNrPalavrasChaves");
//		Produto instance = new Produto();
//		int expResult = 0;
//		int result = instance.getNrPalavrasChaves();
//		assertEquals(expResult, result);
//		// TODO review the generated test code and remove the default call to fail.
//		fail("The test case is a prototype.");
//	}
//
//	/**
//	 * Test of equals method, of class Produto.
//	 */
//	@Test
//	public void testEquals() {
//		System.out.println("equals");
//		Object outroObjeto = null;
//		Produto instance = new Produto();
//		boolean expResult = false;
//		boolean result = instance.equals(outroObjeto);
//		assertEquals(expResult, result);
//		// TODO review the generated test code and remove the default call to fail.
//		fail("The test case is a prototype.");
//	}
}
