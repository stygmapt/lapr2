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
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel
 */
public class OrganizadorTest {
    
    public OrganizadorTest() {
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
     * Test of getUtilizador method, of class Organizador.
     * @throws java.security.NoSuchAlgorithmException
     */
    @Test
    public void testGetUtilizador() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        System.out.println("getUtilizador");
        Utilizador u = new Utilizador("Gabriel", "gabri392", "gabriel@hotmail.com", "gabri");
        Organizador instance = new Organizador();
        instance.setUtilizador(u);
        Utilizador expResult = u;
        Utilizador result = instance.getUtilizador();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUtilizador method, of class Organizador.
     * @throws java.security.NoSuchAlgorithmException
     * @throws java.io.UnsupportedEncodingException
     */
    @Test
    public void testSetUtilizador() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        System.out.println("getUtilizador");
        Utilizador u = new Utilizador("Gabriel", "gabri392", "gabriel@hotmail.com", "gabri");
        Organizador instance = new Organizador();
        instance.setUtilizador(u);
        Utilizador expResult = u;
        Utilizador result = instance.getUtilizador();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Organizador.
     * @throws java.security.NoSuchAlgorithmException
     * @throws java.io.UnsupportedEncodingException
     */
    @Test
    public void testToString() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        System.out.println("toString");
        Utilizador u = new Utilizador("Gabriel", "gabri392", "gabriel@hotmail.com", "gabri");
        Organizador instance = new Organizador();
        instance.setUtilizador(u);
        String expResult = "Organizador:\tUser: gabri392";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
