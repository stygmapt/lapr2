/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel
 */
public class RegistoUtilizadoresTest {
    private RegistoUtilizadores registo;
    public RegistoUtilizadoresTest() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        this.registo = new RegistoUtilizadores();
        Utilizador u1 = new Utilizador("gabri", "gabri", "gabri@hotmail.com", "gabri");
        Utilizador u2 = new Utilizador("tiago", "tiao", "tiago@hotmail.com", "tiago");
        Utilizador u3 = new Utilizador("Edu", "Edu", "Edu@hotmail.com", "Edu");
        Utilizador u4 = new Utilizador("Joao", "Joao", "joao@hotmail.com", "joao");
        Utilizador u5 = new Utilizador("Pedro", "pedro", "pedro@hotmail.com", "pedro");
        this.registo.addUtilizador(u1);
        this.registo.addUtilizador(u2);
        this.registo.addUtilizador(u3);
        this.registo.addUtilizador(u4);
        this.registo.addUtilizador(u5);
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
     * Test of getLista method, of class RegistoUtilizadores.
     */
    @Test
    public void testGetLista() {
        System.out.println("getLista");
        RegistoUtilizadores instance = this.registo;
        List<Utilizador> expResult = this.registo.getLista();
        List<Utilizador> result = instance.getLista();
        assertEquals(expResult, result);
    }

    /**
     * Test of novoUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testNovoUtilizador() {
        System.out.println("novoUtilizador");
        Utilizador expResult = this.registo.novoUtilizador();
        Utilizador result = new Utilizador();
        assertEquals(expResult.getUsername(), result.getUsername());
    }

    /**
     * Test of addUtilizador method, of class RegistoUtilizadores.
     * @throws java.security.NoSuchAlgorithmException
     * @throws java.io.UnsupportedEncodingException
     */
    @Test
    public void testAddUtilizador() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        System.out.println("addUtilizador");
        Utilizador u = new Utilizador("teste", "teste", "teste@hotmail.com", "teste");
        boolean expResult = true;
        boolean result = this.registo.addUtilizador(u);
        assertEquals(expResult, result);
    }

    /**
     * Test of getUtilizadorByUserName method, of class RegistoUtilizadores.
     * @throws java.security.NoSuchAlgorithmException
     * @throws java.io.UnsupportedEncodingException
     */
    @Test
    public void testGetUtilizadorByUserName() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        System.out.println("getUtilizadorByUserName");
        Utilizador expResult = new Utilizador("gabri", "gabri", "gabri@hotmail.com", "gabri");
        Utilizador result = this.registo.getUtilizadorByUserName("gabri");
        assertEquals(expResult.getUsername(), result.getUsername());
    }
    
}
