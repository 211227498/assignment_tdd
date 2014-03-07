/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import assignment_tdd.AssertionFloatingPoint;
import assignment_tdd.impl.AssertionFloatingPointImpl;
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
public class AssertionFloatingPointTest {
    
    public AssertionFloatingPointTest() {
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
    public void testGetDouble() {
        AssertionFloatingPoint afp = new AssertionFloatingPointImpl();
        assertEquals(afp.getDouble(), 1.2, 0);
    }
}