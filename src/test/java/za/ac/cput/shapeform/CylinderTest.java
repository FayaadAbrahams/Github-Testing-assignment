package za.ac.cput.shapeform;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Student Name - Fayaad Abrahams 
//Student Number - 218221630

public class CylinderTest {
    private Cylinder ob1; 
    private Cylinder ob2; 
    
    public CylinderTest() {
        Cylinder ob1 = new Cylinder();
        Cylinder ob2 = new Cylinder();
        ob1 = ob2;
    }

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
    
    @Test 
    public void testEquality(){
        assertSame(ob1,ob2);
    }
    
    @Test
    public void testIdentity(){
        assertEquals(ob1,ob2);
    }

    

}
