/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import assignment_tdd.AssertionArrayContent;
import assignment_tdd.impl.AssertionArrayContentImpl;
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
public class AssertionArrayContentsTest {
    
    public AssertionArrayContentsTest() {
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
    public void testGetValues() {
        AssertionArrayContent aac = new AssertionArrayContentImpl();
        String[] temp = {"Hello", "goodbye", "a"};
        assertEquals(aac.getValues(), temp);
    }
}