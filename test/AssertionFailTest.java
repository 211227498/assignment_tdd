/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import assignment_tdd.AssertionFail;
import assignment_tdd.impl.AssertionFailImpl;
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
public class AssertionFailTest {
    
    public AssertionFailTest() {
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
    public void testGetValue() {
        AssertionFail af = new AssertionFailImpl();
        assertEquals("The numbers are not equal!", af.getValue(), 11);
    }
}