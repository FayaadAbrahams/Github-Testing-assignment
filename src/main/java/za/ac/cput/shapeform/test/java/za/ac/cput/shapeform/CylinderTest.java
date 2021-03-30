/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.shapeform;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fayaa
 */
public class CylinderTest {
    
    public CylinderTest() {
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
     * Test of toString method, of class Cylinder.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cylinder instance = new Cylinder();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRadius method, of class Cylinder.
     */
    @Test
    public void testGetRadius() {
        System.out.println("getRadius");
        Cylinder instance = new Cylinder();
        String expResult = "";
        String result = instance.getRadius();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRadius method, of class Cylinder.
     */
    @Test
    public void testSetRadius() {
        System.out.println("setRadius");
        String radius = "";
        Cylinder instance = new Cylinder();
        instance.setRadius(radius);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class Cylinder.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Cylinder instance = new Cylinder();
        String expResult = "";
        String result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class Cylinder.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        String height = "";
        Cylinder instance = new Cylinder();
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
