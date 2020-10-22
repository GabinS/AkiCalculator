/**
 *
 */
package com.akicalculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.akicalculator.utils.Navigation;

/**
 * @author Joris Guerrier
 *
 */
public class TestNavigation {

    private Navigation nav;

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.nav = new Navigation();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test method for {@link com.akicalculator.utils.Navigation#Navigation()}.
     */
    @Test
    public void testNavigation() {

    }

    /**
     * Test method for {@link com.akicalculator.utils.Navigation#printMenu()}.
     */
    @Test
    public void testPrintMenu() {

    }

    /**
     * Test method for {@link com.akicalculator.utils.Navigation#start()}.
     */
    @Test
    public void testStart() {

    }

    /**
     * Test method for {@link com.akicalculator.utils.Navigation#getValuekeyBoard(java.lang.String)}.
     */
    @Test
    public void testGetValuekeyBoard() {

    }

    /**
     * Test method for {@link com.akicalculator.utils.Navigation#getMessageOperation(float, float, float, java.lang.String)}.
     */
    @Test
    public void testGetMessageOperation() {

    }

    /**
     * Test method for {@link com.akicalculator.utils.Navigation#execOperation(java.lang.String)}.
     */
    @Test
    public void testExecOperation() {

        this.nav.execOperation("+", 2, 4);
        this.nav.execOperation("-", 4, 2);
        this.nav.execOperation("*", 4, 2);
        this.nav.execOperation("/", 4, 2);
        this.nav.execOperation("%", 4, 2);
        this.nav.execOperation("^", 4, 2);
        this.nav.execOperation("V", 4, 2);


    }

}
