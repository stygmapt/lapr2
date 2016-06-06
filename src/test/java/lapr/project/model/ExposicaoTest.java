/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import lapr.project.states.ExposicaoState;
import lapr.project.states.ExposicaoStateCompleto;
import lapr.project.states.ExposicaoStateCriada;
import lapr.project.states.ExposicaoStateDemonstracaoSemFAE;
import lapr.project.states.ExposicaoStateFAESemDemonstracao;
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
public class ExposicaoTest {

	private Exposicao exposicaoTest;
	private Utilizador utilizadorTest;
	private FAE fae;

	public ExposicaoTest() throws ParseException, NoSuchAlgorithmException, UnsupportedEncodingException {
		exposicaoTest = new Exposicao();
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date dInicio = format.parse("04-06-2016");
		Date dFim = format.parse("30-06-2016");
		Date dInicioSubm = format.parse("10-06-2016");
		Date dFimSubm = format.parse("18-06-2016");
		Date dLimiteAvalia = format.parse("22-06-2016");
		exposicaoTest.setDatasRealização(dInicio, dFim);
		exposicaoTest.setPeriodoSubmissão(dInicioSubm, dFimSubm);
		exposicaoTest.setDataLimiteAvaliacoes(dLimiteAvalia);
		exposicaoTest.setLocal("Porto");
		exposicaoTest.setDescricao("Semana da Engenharia");
		exposicaoTest.setTitulo("AE-ISEP");
		exposicaoTest.setState(new ExposicaoStateCriada(exposicaoTest));
		utilizadorTest = new Utilizador("User", "myid", "email@email.com", "mypass");
		exposicaoTest.getListaFae().addFAE(utilizadorTest);
		System.out.println(exposicaoTest.toString());

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
	 * Test of getTitulo method, of class Exposicao.
	 */
	@Test
	public void testGetTitulo() {
		System.out.println("getTitulo");
		String expResult = "AE-ISEP";
		String result = exposicaoTest.getTitulo();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setTitulo method, of class Exposicao.
	 */
	@Test
	public void testSetTitulo() {
		System.out.println("setTitulo");
		String titulo = "LLPROG";
		exposicaoTest.setTitulo(titulo);
		assertEquals(exposicaoTest.getTitulo(), titulo);
	}

	/**
	 * Test of getDescricao method, of class Exposicao.
	 */
	@Test
	public void testGetDescricao() {
		System.out.println("getDescricao");
		String expResult = "AE ISEP";
		exposicaoTest.setDescricao(expResult);
		String result = exposicaoTest.getDescricao();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setDescricao method, of class Exposicao.
	 */
	@Test
	public void testSetDescricao() {
		System.out.println("setDescricao");
		String descricao = "setDescricao";
		exposicaoTest.setDescricao(descricao);
		assertEquals(exposicaoTest.getDescricao(), descricao);
	}

	/**
	 * Test of getDataInicioRealização method, of class Exposicao.
	 */
	@Test
	public void testGetDataInicioRealização() throws ParseException {
		System.out.println("getDataInicioRealiza\u00e7\u00e3o");
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date dInicio = format.parse("04-06-2016");
		Date result = exposicaoTest.getDataInicioRealização();
		assertEquals(dInicio, result);
	}

//	/**
//	 * Test of getDataFimRealização method, of class Exposicao.
//	 */
//	@Test
//	public void testGetDataFimRealização() throws ParseException {
//		System.out.println("getDataFimRealiza\u00e7\u00e3o");
//		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
//		Date expResult = format.parse("04-06-2016");
//		exposicaoTest.
//		Date result = exposicaoTest.getDataFimRealização();
//		assertEquals(expResult, result);
//	}
	/**
	 * Test of setDatasRealização method, of class Exposicao.
	 */
	@Test
	public void testSetDatasRealização() {
		System.out.println("setDatasRealiza\u00e7\u00e3o");
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		try {
			Date dInicio = format.parse("04-06-2016");
			Date dataFimRealização = format.parse("12-06-2016");
			exposicaoTest.setDatasRealização(dInicio, dataFimRealização);
			assertEquals(exposicaoTest.getDataInicioRealização(), dInicio);
		} catch (ParseException ex) {
			Logger.getLogger(ExposicaoTest.class.getName()).
				log(Level.SEVERE, null, ex);
		}
	}

	/**
	 * Test of getDataInicioSubmissão method, of class Exposicao.
	 */
	@Test
	public void testGetDataInicioSubmissão() {
		System.out.println("getDataInicioSubmiss\u00e3o");
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date expResult;
		Date result = exposicaoTest.getDataInicioSubmissão();
		assertEquals(exposicaoTest.getDataInicioSubmissão(), result);

	}

	/**
	 * Test of getDataFimSubmissão method, of class Exposicao.
	 */
	@Test
	public void testGetDataFimSubmissão() {
		System.out.println("getDataFimSubmiss\u00e3o");
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date expResult;
		Date result = exposicaoTest.getDataFimSubmissão();
		assertEquals(exposicaoTest.getDataFimSubmissão(), result);

	}

	/**
	 * Test of setPeriodoSubmissão method, of class Exposicao.
	 */
	@Test
	public void testSetPeriodoSubmissão() {
		System.out.println("setPeriodoSubmiss\u00e3o");
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date expResult;
		Date expResult2;
		try {
			expResult = format.parse("12-06-2016");
			expResult2 = format.parse("13-06-2016");
			exposicaoTest.setPeriodoSubmissão(expResult, expResult2);
			assertEquals(expResult, exposicaoTest.getDataInicioSubmissão());
		} catch (ParseException ex) {
			Logger.getLogger(ExposicaoTest.class.getName()).
				log(Level.SEVERE, null, ex);
		}
	}

	/**
	 * Test of getLocal method, of class Exposicao.
	 */
	@Test
	public void testGetLocal() {
		System.out.println("getLocal");
		String expResult = "LocalDaPraia";
		exposicaoTest.setLocal(expResult);
		assertEquals(expResult, exposicaoTest.getLocal());
	}

	/**
	 * Test of setLocal method, of class Exposicao.
	 */
	@Test
	public void testSetLocal() {
		System.out.println("setLocal");
		String local = "Miramas";
		exposicaoTest.setLocal(local);
		assertEquals(local, exposicaoTest.getLocal());
	}

	/**
	 * Test of setDataLimiteAvaliacoes method, of class Exposicao.
	 */
	@Test
	public void testSetDataLimiteAvaliacoes() {
		System.out.println("setDataLimiteAvaliacoes");
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		Date expResult2;
		try {
			expResult2 = format.parse("16-06-2016");
			exposicaoTest.setDataLimiteAvaliacoes(expResult2);
			assertEquals(expResult2, exposicaoTest.getDataFimRealização());
		} catch (ParseException ex) {
			Logger.getLogger(ExposicaoTest.class.getName()).
				log(Level.SEVERE, null, ex);
		}
	}

	/**
	 * Test of getM_state method, of class Exposicao.
	 */
	@Test
	public void testGetM_state() {
		System.out.println("getM_state");
		ExposicaoState expResult = exposicaoTest.getM_state();
		assertEquals(expResult, exposicaoTest.getM_state());
	}

	/**
	 * Test of setState method, of class Exposicao.
	 */
	@Test
	public void testSetState() {
		System.out.println("setState");
		ExposicaoState state = new ExposicaoStateCompleto(exposicaoTest);
		exposicaoTest.setState(state);
		assertEquals(state, exposicaoTest.getM_state());
	}

	/**
	 * Test of valida method, of class Exposicao.
	 */
	@Test
	public void testValida() {
		System.out.println("valida");
		Boolean expResult = true;
		Boolean result = exposicaoTest.valida();
		assertEquals(expResult, result);
	}

	/**
	 * Test of isInFAESemDemonstracao method, of class Exposicao.
	 */
	@Test
	public void testIsInFAESemDemonstracao() {
		System.out.println("isInFAESemDemonstracao");
		exposicaoTest.
			setState(new ExposicaoStateFAESemDemonstracao(exposicaoTest));
		Boolean expResult = true;
		assertEquals(expResult, exposicaoTest.isInFAESemDemonstracao());
	}

	/**
	 * Test of isInCriada method, of class Exposicao.
	 */
	@Test
	public void testIsInCriada() {
		Boolean expResult = true;
		exposicaoTest.setState(new ExposicaoStateCriada(exposicaoTest));

		assertEquals(expResult, exposicaoTest.isInCriada());
	}

	/**
	 * Test of isDemonstracaoSemFAE method, of class Exposicao.
	 */
	@Test
	public void testIsDemonstracaoSemFAE() {
		System.out.println("isDemonstracaoSemFAE");
		Boolean expResult = true;
		exposicaoTest.
			setState(new ExposicaoStateDemonstracaoSemFAE(exposicaoTest));
		assertEquals(expResult, exposicaoTest.isDemonstracaoSemFAE());
	}

	/**
	 * Test of isCompleta method, of class Exposicao.
	 */
	@Test
	public void testIsCompleta() {
		System.out.println("isCompleta");
		Boolean expResult = true;
		exposicaoTest.setState(new ExposicaoStateCompleto(exposicaoTest));
		assertEquals(expResult, exposicaoTest.isCompleta());
	}

	/**
	 * Test of vereficaEstado method, of class Exposicao.
	 */
	@Test
	public void testVereficaEstado() {
		System.out.println("vereficaEstado");
		exposicaoTest.
			setState(new ExposicaoStateDemonstracaoSemFAE(exposicaoTest));
		Boolean expResult = true;
		assertEquals(expResult, exposicaoTest.vereficaEstado());
	}

	/**
	 * Test of toString method, of class Exposicao.
	 */
	@Test
	public void testToString() {
		System.out.println("toString");
		String expResult = exposicaoTest.toString();
		assertEquals(expResult, exposicaoTest.toString());
	}

}
