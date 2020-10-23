package com.akicalculator;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.akicalculator.utils.Navigation;

/**
 * TestNavigation
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
     * Test method for {@link com.akicalculator.utils.Navigation#printMenu()}.
     */
    @Test
    public void testPrintMenu() {
        this.nav.printMenu();
    }

    /**
     * Test method for {@link com.akicalculator.utils.Navigation#start()}.
     */
    @Test
    @Ignore
    public void testStart() {
        this.nav.start();
    }

    /**
     * Test method for {@link com.akicalculator.utils.Navigation#getValuekeyBoard(java.lang.String)}.
     */
    @Test
    @Ignore
    public void testGetValuekeyBoard() {
        this.nav.getValuekeyBoard("a");
    }

    /**
     * Test method for {@link com.akicalculator.utils.Navigation#setInputValues(java.lang.String)}.
     */
    @Test
    @Ignore
    public void testSetInputValues() {
        this.nav.setInputValues("+");
    }

    /**
     * Test method for {@link com.akicalculator.utils.Navigation#setInputValue(java.lang.String)}.
     */
    @Test
    @Ignore
    public void testSetInputValue() {
        this.nav.setInputValue("+");
    }

    /**
     * Test method for {@link com.akicalculator.utils.Navigation#saveValueMemory(java.lang.String)}.
     */
    @Test
    @Ignore
    public void testSaveValueMemory() {
        this.nav.saveValueMemory();
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
        this.nav.execOperation("/", 4, 0);
        this.nav.execOperation("%", 4, 2);
        this.nav.execOperation("^", 4, 2);
        this.nav.execOperation("V", 4, 2);

        this.nav.execOperation("x", 4, 2);

    }

    /**
     * Test method for {@link com.akicalculator.utils.Navigation#selectMenu(java.lang.String)}.
     */
    @Test
    @Ignore
    public void testSelectMenu() {

        this.nav.selectMenu("1");
        this.nav.selectMenu("2");
        this.nav.selectMenu("3");
        this.nav.selectMenu("4");
        this.nav.selectMenu("5");
        this.nav.selectMenu("6");
        this.nav.selectMenu("7");
        this.nav.selectMenu("M");
        this.nav.selectMenu("H");
        this.nav.selectMenu("Q");

    }

}
