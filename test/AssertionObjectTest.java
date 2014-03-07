/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import assignment_tdd.AssertionObject;
import assignment_tdd.impl.AssertionObjectImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hannes
 */
public class AssertionObjectTest {
    
    public AssertionObjectTest() {
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
    
    @Test
    public void testAssertObject() {
        AssertionObject o1 = new AssertionObjectImpl();
        AssertionObject o2 = o1;
        
        assertEquals(o1, o2);
        assertSame(o1,o2);
    }
}