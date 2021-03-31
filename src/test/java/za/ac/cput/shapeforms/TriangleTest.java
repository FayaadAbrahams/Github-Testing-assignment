/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.shapeforms;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tarre
 */
public class TriangleTest {

    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getHight method, of class Triangle.
     */
    @Test
    public void testGetHight() {
        System.out.println("getHight");
        Triangle instance = new Triangle();
        double expResult = 0.0;
        double result = instance.getHight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHight method, of class Triangle.
     */
    @Test
    public void testSetHight() {
        System.out.println("setHight");
        double hight = 0.0;
        Triangle instance = new Triangle();
        instance.setHight(hight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBase method, of class Triangle.
     */
    @Test
    public void testGetBase() {
        System.out.println("getBase");
        Triangle instance = new Triangle();
        double expResult = 0.0;
        double result = instance.getBase();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBase method, of class Triangle.
     */
    @Test
    public void testSetBase() {
        System.out.println("setBase");
        double base = 0.0;
        Triangle instance = new Triangle();
        instance.setBase(base);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSide1 method, of class Triangle.
     */
    @Test
    public void testGetSide1() {
        System.out.println("getSide1");
        Triangle instance = new Triangle();
        int expResult = 0;
        int result = instance.getSide1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSide1 method, of class Triangle.
     */
    @Test
    public void testSetSide1() {
        System.out.println("setSide1");
        int side1 = 0;
        Triangle instance = new Triangle();
        instance.setSide1(side1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSide2 method, of class Triangle.
     */
    @Test
    public void testGetSide2() {
        System.out.println("getSide2");
        Triangle instance = new Triangle();
        int expResult = 0;
        int result = instance.getSide2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSide2 method, of class Triangle.
     */
    @Test
    public void testSetSide2() {
        System.out.println("setSide2");
        int side2 = 0;
        Triangle instance = new Triangle();
        instance.setSide2(side2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSide3 method, of class Triangle.
     */
    @Test
    public void testGetSide3() {
        System.out.println("getSide3");
        Triangle instance = new Triangle();
        int expResult = 0;
        int result = instance.getSide3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSide3 method, of class Triangle.
     */
    @Test
    public void testSetSide3() {
        System.out.println("setSide3");
        int side3 = 0;
        Triangle instance = new Triangle();
        instance.setSide3(side3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArea method, of class Triangle.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Triangle instance = new Triangle();
        String expResult = "";
        String result = instance.getArea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArea method, of class Triangle.
     */
    @Test
    public void testSetArea() {
        System.out.println("setArea");
        String area = "";
        Triangle instance = new Triangle();
        instance.setArea(area);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParimeter method, of class Triangle.
     */
    @Test
    public void testGetParimeter() {
        System.out.println("getParimeter");
        Triangle instance = new Triangle();
        String expResult = "";
        String result = instance.getParimeter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParimeter method, of class Triangle.
     */
    @Test
    public void testSetParimeter() {
        System.out.println("setParimeter");
        String parimeter = "";
        Triangle instance = new Triangle();
        instance.setParimeter(parimeter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Triangle.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Triangle instance = new Triangle();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
