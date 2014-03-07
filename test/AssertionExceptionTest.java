/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import assignment_tdd.AssertionException;
import assignment_tdd.impl.AssertionExceptionImpl;
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
public class AssertionExceptionTest {
    
    public AssertionExceptionTest() {
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
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void testGetValue() {
        AssertionException ae = new AssertionExceptionImpl();
        ae.getValue();
    }
    
    @Test(timeout=0)
    public void testTimeOut() {
        
    }
}