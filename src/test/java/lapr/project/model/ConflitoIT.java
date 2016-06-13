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
 * @author Tiago
 */
public class ConflitoIT {

    private Conflito conflito;

    public ConflitoIT() {
        this.conflito = new Conflito();

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
     * Test of getFae method, of class Conflito.
     */
    @Test
    public void testGetFae() {
        System.out.println("getFae");
        Conflito instance = new Conflito();
        FAE expResult = null;
        FAE result = instance.getFae();
        assertEquals(expResult, result);

    }

    /**
     * Test of setFae method, of class Conflito.
     */
    @Test
    public void testSetFae() {
        System.out.println("setFae");
        FAE fae = null;
        Conflito instance = new Conflito();
        instance.setFae(fae);

    }

    /**
     * Test of getCandidatura method, of class Conflito.
     */
    @Test
    public void testGetCandidatura() {
        System.out.println("getCandidatura");
        Conflito instance = new Conflito();
        Candidatura expResult = null;
        Candidatura result = instance.getCandidatura();
        assertEquals(expResult, result);

    }

    /**
     * Test of setCandidatura method, of class Conflito.
     */
    @Test
    public void testSetCandidatura() {
        System.out.println("setCandidatura");
        Candidatura candidatura = null;
        Conflito instance = new Conflito();
        instance.setCandidatura(candidatura);

    }

    /**
     * Test of getTipoConflito method, of class Conflito.
     */
    @Test
    public void testGetTipoConflito() {
        System.out.println("getTipoConflito");
        Conflito instance = new Conflito();
        TipoConflito expResult = null;
        TipoConflito result = instance.getTipoConflito();
        assertEquals(expResult, result);

    }

    /**
     * Test of setTipoConflito method, of class Conflito.
     */
    @Test
    public void testSetTipoConflito() {
        System.out.println("setTipoConflito");
        TipoConflito tipoConflito = null;
        Conflito instance = new Conflito();
        instance.setTipoConflito(tipoConflito);

    }

    /**
     * Test of equals method, of class Conflito.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Conflito u = null;
        Conflito instance = new Conflito();
        boolean expResult = false;
        boolean result = instance.equals(u);
        assertEquals(expResult, result);

    }

    @Test
    public void testValida() {
        System.out.println("valida");
        Conflito instance = new Conflito();
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }

}
