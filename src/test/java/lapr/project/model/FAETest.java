/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

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
public class FAETest {
    
    public FAETest() {
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
     * Test of getRegistoConflitos method, of class FAE.
     */
    @Test
    public void testGetRegistoConflitos() {
        System.out.println("getRegistoConflitos");
        FAE instance = new FAE();
        RegistoConflitos expResult = null;
        RegistoConflitos result = instance.getRegistoConflitos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUtilizador method, of class FAE.
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        Utilizador u = new Utilizador("Gabriel", "gabri392", "gabriel@hotmail.com", "gabri");
        FAE instance = new FAE();
        instance.setUtilizador(u);
        Utilizador expResult = u;
        Utilizador result = instance.getUtilizador();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUtilizador method, of class FAE.
     */
    @Test
    public void testSetUtilizador() {
        System.out.println("setUtilizador");
        Utilizador u = new Utilizador("Gabriel", "gabri392", "gabriel@hotmail.com", "gabri");
        FAE instance = new FAE();
        instance.setUtilizador(u);
        Utilizador expResult = u;
        Utilizador result = instance.getUtilizador();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class FAE.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Utilizador u = new Utilizador("Gabriel", "gabri392", "gabriel@hotmail.com", "gabri");
        FAE instance = new FAE();
        instance.setUtilizador(u);
        String expResult = "FAE:\tUser: gabri392";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
