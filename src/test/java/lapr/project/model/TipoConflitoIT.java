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
public class TipoConflitoIT {
    
    private TipoConflito tipoConflito;
    
    public TipoConflitoIT() {
        this.tipoConflito = new TipoConflito();
        
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
     * Test of getDescricao method, of class TipoConflito.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        TipoConflito instance = new TipoConflito();
        String expResult = null;
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDescricao method, of class TipoConflito.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        TipoConflito instance = new TipoConflito();
        String descricao = "descricao";
        instance.setDescricao(descricao);
        String expResult = instance.getDescricao();
        assertEquals(expResult, descricao);

    }

    /**
     * Test of toString method, of class TipoConflito.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TipoConflito instance = new TipoConflito();
        String expResult = "Tipo de conflito: "+this.tipoConflito.getDescricao();
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of equals method, of class TipoConflito.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        TipoConflito o = null;
        TipoConflito instance = new TipoConflito();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        
    }
    
}
