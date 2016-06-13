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
 * @author Tiago
 */
public class RegistoStandIT {
    
    private RegistoStand registoStandTest;
    private List<Stand> listaStand;
   
    
    public RegistoStandIT() {
        this.registoStandTest = new RegistoStand();
        this.listaStand = new ArrayList<>();
        
        
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
     * Test of novoStand method, of class RegistoStand.
     */
    @Test
    public void testNovoStand() {
        System.out.println("novoStand");
        RegistoStand rs = new RegistoStand();
        Stand expResult = registoStandTest.novoStand();
        assertEquals(rs, expResult);
        
        
      
    }

    /**
     * Test of getLstStands method, of class RegistoStand.
     */
    @Test
    public void testGetLstStands() {
        System.out.println("getLstStands");
        RegistoStand rs = this.registoStandTest;
        List<Stand> expResult = this.registoStandTest.getLstStands();
        List<Stand> result = rs.getLstStands();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLstStands method, of class RegistoStand.
     */
    @Test
    public void testSetLstStands() {
        System.out.println("setLstStands");
        List<Stand> lstStands = this.listaStand;
        Stand stand = new Stand();
        lstStands.add(stand);
        registoStandTest.setLstStands(lstStands);
        assertEquals(lstStands.size(), registoStandTest.getLstStands().size());
        
    }

    
    @Test
    public void testAdicionarListaStands() {
        System.out.println("adicionarListaStands");
        List<Stand> lstStands = this.listaStand;
        Stand stand = new Stand();
        lstStands.add(stand);
        registoStandTest.adicionarListaStands(stand);
        assertEquals(lstStands.size(),registoStandTest.getLstStands().size());  
    }
    
}
