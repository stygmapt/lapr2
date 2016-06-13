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
public class StandIT {

    private Stand stand;

    public StandIT() {
        this.stand = new Stand();
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
     * Test of setId method, of class Stand.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Stand rs = new Stand();
        int id = 0;
        rs.setId(id);
        assertEquals(id, this.stand.getId());
    }

    /**
     * Test of setArea method, of class Stand.
     */
    @Test
    public void testSetArea() {
        System.out.println("setArea");
        Stand rs = new Stand();
        float area = 0.0f;
        rs.setArea(area);
        assertEquals(area, this.stand.getArea(),area);
    }

    /**
     * Test of getId method, of class Stand.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Stand instance = new Stand();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);

    }

    /**
     * Test of getArea method, of class Stand.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Stand instance = new Stand();
        float expResult = 0.0F;
        float result = instance.getArea();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of toString method, of class Stand.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Stand instance = new Stand(1, 2.5f);
        String expResult = "ID: 1 Area: 2.5";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Stand.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjeto = null;
        Stand instance = new Stand();
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);

    }

}
