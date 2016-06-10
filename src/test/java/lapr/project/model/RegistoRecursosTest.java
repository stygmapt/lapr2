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
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel
 */
public class RegistoRecursosTest {
    private RegistoRecursos registo;
    public RegistoRecursosTest() {
        this.registo = new RegistoRecursos();
        this.registo.registaRecurso("agua");
        this.registo.registaRecurso("Vinho");
        this.registo.registaRecurso("Cerveja");
        this.registo.registaRecurso("Coca-cola");
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
     * Test of registaRecurso method, of class RegistoRecursos.
     */
    @Test
    public void testRegistaRecurso() {
        System.out.println("registaRecurso");
        RegistoRecursos r = this.registo;
        String dsc = "novoRec";
        boolean expResult = true;
        boolean result =r.registaRecurso(dsc);
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaRecursos method, of class RegistoRecursos.
     */
    @Test
    public void testGetListaRecursos() {
        System.out.println("getListaRecursos");
         RegistoRecursos r = this.registo;
        List<Recurso> expResult = this.registo.getListaRecursos();
        List<Recurso> result = r.getListaRecursos();
        assertEquals(expResult, result);
    }
    
}
