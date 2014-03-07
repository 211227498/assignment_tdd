/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import assignment_tdd.AssertionInteger;
import assignment_tdd.impl.AssertionIntegerImpl;
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
public class AssertionIntegerTest {
    
    public AssertionIntegerTest() {
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
    public void testGetInt() {
        AssertionInteger ai = new AssertionIntegerImpl();
        assertEquals("Numbers are not equal", ai.getAnswer(), 5);
    }
}