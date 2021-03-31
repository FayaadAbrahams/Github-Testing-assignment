package za.ac.cput.shapeforms;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 * 
 * @author Tarren-Marc Adams
 * Student number: 214041794
 * 
 */
public class TriangleTest {
    
    private Triangle object1;
    private Triangle object2;
    private Triangle object3;

    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        object1=new Triangle();
        object2=new Triangle();
        object3=object1;
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    //Testing Equality
     @Test
    public void testEqulity(){
        assertEquals(object1,object3);
    }
    
    //Testing Identiy Same
     @Test
    public void testIdentity(){
        assertSame(object1,object3);
    }
    //Testing identity NotSame
     @Test
    public void testNotIdentity(){
        assertNotSame(object1,object2);
    }
    
    //Test failing
     @Test
    public void testSomething(){
        fail("This will fail");
    }
     
     @Test
     @Timeout(20)
    public void testTimeout(){
         System.out.println("Timeout");
    }
    
    @Disabled
    @Test
    public void testThisMethod(){
        System.out.println("Been disabled");
    }    
}
//end
