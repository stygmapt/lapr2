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
		i = "Isep";
		z = "Porto";
		this.produtoTest.addPalavraChave(z);
		this.produtoTest.addPalavraChave(i);
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
	 * Test of getPalavras_chave_produto method, of class Produto.
	 */
	@Test
	public void testGetPalavras_chave_produto() {
		System.out.println("getPalavras_chave_produto");
		List<String> expResult = new ArrayList<>();
		expResult.add(i);
		expResult.add(z);
		List<String> result = produtoTest.getPalavras_chave_produto();
		System.out.println("The size of the list, should be 2 !!!");
		assertEquals(expResult.size(), result.size());
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

	/**
	 * Test of setPalavras_chave_produto method, of class Produto.
	 */
	@Test
	public void testSetPalavras_chave_produto() {
		System.out.println("setPalavras_chave_produto");
		String a = "Semana da Enganharia";
		String b = "CP";
		List<String> palavras_chave_produto = new ArrayList<>();
		palavras_chave_produto.add(a);
		palavras_chave_produto.add(b);
		produtoTest.setPalavras_chave_produto(palavras_chave_produto);
		System.out.println("The size of the List should be 2 !!!");
		assertEquals(palavras_chave_produto.size(), produtoTest.
					 getPalavras_chave_produto().size());
	}

	/**
	 * Test of addPalavraChave method, of class Produto.
	 */
	@Test
	public void testAddPalavraChave() {
		System.out.println("addPalavraChave");
		String plvr = "Espinho";
		produtoTest.addPalavraChave(plvr);
		int size = 3;
		System.out.
			println("The sizeee of the list should be 3 because we add a new 'Palavra Chave'");
		assertEquals(produtoTest.getPalavras_chave_produto().size(), size);
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
