/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import assignment_tdd.AssertionTruth;
import assignment_tdd.impl.AssertionTruthImpl;
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
public class AssertionTruthTest {
    
    public AssertionTruthTest() {
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
    public void testGetTruth() {
        AssertionTruth at = new AssertionTruthImpl();
        assertTrue(at.getTruth());
    }
}