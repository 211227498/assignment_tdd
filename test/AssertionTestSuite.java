/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Hannes
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({AssertionFloatingPointTest.class, AssertionObjectTest.class, AssertionTruthTest.class, AssertionFalsityTest.class, AssertionFailTest.class, AssertionNullnessNonNullnessTest.class, AssertionIntegerTest.class, AssertionExceptionTest.class, AssertionArrayContentsTest.class})
public class AssertionTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}