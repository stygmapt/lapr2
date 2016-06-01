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
public class RecursoTest {
    
    public RecursoTest() {
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
        Recurso instance = new Recurso("Recurso1");
        String expResult = "Recurso1";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescricao method, of class Recurso.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "Recurso1";
        Recurso instance = new Recurso();
        instance.setDescricao(descricao);
        String expResult = descricao;
        String result = instance.getDescricao();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Recurso.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Recurso instance = new Recurso("Recurso1");
        String expResult = "recurso: Recurso1";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
