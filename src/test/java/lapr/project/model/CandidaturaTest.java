/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lapr.project.states.CandidaturaStateEmSubmissao;
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
public class CandidaturaTest {

	private Utilizador userTest;
	private Candidatura candidaturaTest;
	private Produto produto;
	private ListaProdutos listaProdutos;

	public CandidaturaTest() throws UnsupportedEncodingException {
		this.userTest = new Utilizador();
		this.userTest.setUsername("stygma");
		this.userTest.setNome("Jorge");
		this.userTest.setEmail("jj@gmail.com");
		try {
			this.userTest.setPassword("stygma");
		} catch (NoSuchAlgorithmException ex) {
			Logger.getLogger(CandidaturaTest.class.getName()).
				log(Level.SEVERE, null, ex);
		}
		this.candidaturaTest = new Candidatura();
		this.candidaturaTest.setRepresentante(userTest);
		this.candidaturaTest.setNome_Empresa("ISEP");
		this.candidaturaTest.setMorada_Empresa("Rua 10");
		this.candidaturaTest.setArea_Empresa(15);
		this.produto = new Produto("Engenharia");
		String i = "Isep";
		String z = "Porto";
		this.produto.addPalavraChave(z);
		this.produto.addPalavraChave(i);
		this.listaProdutos = new ListaProdutos();
		listaProdutos.adicionaProduto(produto);
		this.candidaturaTest.setLista_produtos(listaProdutos);
		this.candidaturaTest.setQtd_convites(20);
		this.candidaturaTest.setTelemovel_Empresa(912111973);
		this.candidaturaTest.
			setState(new CandidaturaStateEmSubmissao(candidaturaTest));

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
	 * Test of getRepresentante method, of class Candidatura.
	 */
	@Test
	public void testGetRepresentante() {
		System.out.println("getRepresentante");
		Utilizador expResult = userTest;
		Utilizador result = candidaturaTest.getRepresentante();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setRepresentante method, of class Candidatura.
	 */
	@Test
	public void testSetRepresentante() {
		System.out.println("setRepresentante");
		Utilizador representante = userTest;
		candidaturaTest.setRepresentante(representante);
		assertEquals(userTest, candidaturaTest.getRepresentante());
	}

	/**
	 * Test of getNome_Empresa method, of class Candidatura.
	 */
	@Test
	public void testGetNome_Empresa() {
		System.out.println("getNome_Empresa");
		String expResult = "ISEP";
		String result = candidaturaTest.getNome_Empresa();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setNome_Empresa method, of class Candidatura.
	 */
	@Test
	public void testSetNome_Empresa() {
		System.out.println("setNome_Empresa");
		String nome_Empresa = "Espinho";
		candidaturaTest.setMorada_Empresa(nome_Empresa);
		assertEquals(nome_Empresa, candidaturaTest.getMorada_Empresa());
	}

	/**
	 * Test of getMorada_Empresa method, of class Candidatura.
	 */
	@Test
	public void testGetMorada_Empresa() {
		System.out.println("getMorada_Empresa");
		String expResult = "Rua 10";
		String result = candidaturaTest.getMorada_Empresa();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setMorada_Empresa method, of class Candidatura.
	 */
	@Test
	public void testSetMorada_Empresa() {
		System.out.println("setMorada_Empresa");
		String morada_Empresa = "Esplanada";
		candidaturaTest.setMorada_Empresa(morada_Empresa);
		assertEquals(morada_Empresa, candidaturaTest.getMorada_Empresa());
	}

	/**
	 * Test of getTelemovel_Empresa method, of class Candidatura.
	 */
	@Test
	public void testGetTelemovel_Empresa() {
		System.out.println("getTelemovel_Empresa");
		int expResult = 912111973;
		int result = candidaturaTest.getTelemovel_Empresa();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setTelemovel_Empresa method, of class Candidatura.
	 */
	@Test
	public void testSetTelemovel_Empresa() {
		System.out.println("setTelemovel_Empresa");
		int telemovel_Empresa = 912100973;
		candidaturaTest.setTelemovel_Empresa(telemovel_Empresa);
		assertEquals(telemovel_Empresa, candidaturaTest.getTelemovel_Empresa());
	}

	/**
	 * Test of getQtd_convites method, of class Candidatura.
	 */
	@Test
	public void testGetQtd_convites() {
		System.out.println("getQtd_convites");
		int expResult = 20;
		int result = candidaturaTest.getQtd_convites();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setQtd_convites method, of class Candidatura.
	 */
	@Test
	public void testSetQtd_convites() {
		System.out.println("setQtd_convites");
		int qtd_convites = 100;
		candidaturaTest.setQtd_convites(qtd_convites);
		assertEquals(qtd_convites, candidaturaTest.getQtd_convites());
	}
//
//	/**
//	 * Test of getArea_Empresa method, of class Candidatura.
//	 */
//	@Test
//	public void testGetArea_Empresa() {
//		System.out.println("getArea_Empresa");
//		float expResult = 0.0F;
//		float result = instance.getArea_Empresa();
//		assertEquals(expResult, result, 0.0);
//		// TODO review the generated test code and remove the default call to fail.
//		fail("The test case is a prototype.");
//	}
//
//	/**
//	 * Test of setArea_Empresa method, of class Candidatura.
//	 */
//	@Test
//	public void testSetArea_Empresa() {
//		System.out.println("setArea_Empresa");
//		float area_Empresa = 0.0F;
//		Candidatura instance = new Candidatura();
//		instance.setArea_Empresa(area_Empresa);
//		// TODO review the generated test code and remove the default call to fail.
//		fail("The test case is a prototype.");
//	}

	/**
	 * Test of getLista_produtos method, of class Candidatura.
	 */
	@Test
	public void testGetLista_produtos() {
		System.out.println("getLista_produtos");
		ListaProdutos expResult = listaProdutos;
		ListaProdutos result = candidaturaTest.getLista_produtos();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setLista_produtos method, of class Candidatura.
	 */
	@Test
	public void testSetLista_produtos() {
		System.out.println("setLista_produtos");
		ListaProdutos lista_produtos = new ListaProdutos();
		Produto p = new Produto();
		p.addPalavraChave("test");
		p.addPalavraChave("file");
		lista_produtos.adicionaProduto(p);
		candidaturaTest.setLista_produtos(lista_produtos);
		assertEquals(lista_produtos, candidaturaTest.getLista_produtos());
	}

	/**
	 * Test of isInSubmissao method, of class Candidatura.
	 */
	@Test
	public void testIsInSubmissao() {
		System.out.println("isInSubmissao");
		boolean expResult = true;
		boolean result = candidaturaTest.isInSubmissao();
		assertEquals(expResult, result);
	}

	/**
	 * Test of toString method, of class Candidatura.
	 */
	@Test
	public void testToString() {
		System.out.println("toString");
		System.out.println("" + candidaturaTest.toString());
		String expResult = "Candidatura:	Nome da Empresa: ISEP	Representante: [Jorge,jj@gmail.com,stygma]";
		String result = candidaturaTest.toString();
		assertEquals(expResult, result);
	}

	/**
	 * Test of valida method, of class Candidatura.
	 */
	@Test
	public void testValida() {
		System.out.println("valida");
		boolean expResult = true;
		boolean result = candidaturaTest.valida();
		assertEquals(expResult, result);
	}

	/**
	 * Test of equals method, of class Candidatura.
	 */
	@Test
	public void testEquals() {
		System.out.println("equals");
		Candidatura o = candidaturaTest;
		Candidatura instance = new Candidatura();
		boolean expResult = false;
		boolean result = instance.equals(o);
		assertEquals(expResult, result);
	}
//
//	/**
//	 * Test of setState method, of class Candidatura.
//	 */
//	@Test
//	public void testSetState() {
//		System.out.println("setState");
//		CandidaturaState candidaturaState = new CandidaturaStateAvaliada(candidaturaTest);
//		instance.setState(candidaturaState);
//		// TODO review the generated test code and remove the default call to fail.
//		fail("The test case is a prototype.");
//	}

}
