package com.akicalculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.akicalculator.utils.Navigation;

/**
 * @author Joris Guerrier
 *
 */
public class TestNavigation {

    private Navigation nav;

    /**
     * Method called before each method containing a test
     * @throws java.lang.Exception exception generated
     */
    @Before
    public void setUp() throws Exception {
        this.nav = new Navigation();
    }

    /**
     * Method called after each method containing a test
     * @throws java.lang.Exception exception generated
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
     * Test method for {@link com.akicalculator.utils.Navigation#getMessageOperation(float, float, float, String)}.
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

    /**
     * Test method for {@link com.akicalculator.utils.Navigation#selectMenu(java.lang.String)}.
     */
    @Test
    public void testselectMenu() {

        this.nav.selectMenu("1");
        this.nav.selectMenu("2");
        this.nav.selectMenu("3");
        this.nav.selectMenu("4");
        this.nav.selectMenu("5");
        this.nav.selectMenu("6");
        this.nav.selectMenu("7");

    }

}
