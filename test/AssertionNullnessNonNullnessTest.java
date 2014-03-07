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
import org.junit.Ignore;

/**
 *
 * @author Hannes
 */
public class AssertionNullnessNonNullnessTest {
        private AssertionObject o1;
        private AssertionObject o2;
    public AssertionNullnessNonNullnessTest() {
        o1 = new AssertionObjectImpl();
        o2 = null;
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
    public void testNullness() {
        assertNull(o2);
    }
    
    @Test
    public void testNonNullness() {
        assertNotNull(o1);
    }
    
    @Ignore
    @Test
    public void testIgnore() {
        assertEquals(o1,o2);
    }
}