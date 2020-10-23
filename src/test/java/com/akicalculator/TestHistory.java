package com.akicalculator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.akicalculator.models.History;

public class TestHistory {

    private History history;

    /**
     * Method called before each method containing a test
     * @throws Exception exception generated
     */
    @Before
    public void setUp() throws Exception {
        this.history = History.getInstance();
    }

    /**
     *Test method for {@link com.akicalculator.models.History#toString()}
     */
    @Test
    public void testToString() {
        this.history.toString();
    }

    /**
     *Test method for {@link com.akicalculator.models.History#add()}
     */
    @Test
    public void testAdd() {
        assertTrue(0 == this.history.getList().size());
        this.history.add("test");
        assertTrue(1 == this.history.getList().size());
    }

    /**
     *Test method for {@link com.akicalculator.models.History#toString()}
     */
    @Test
    public void testToStringAfterAdd() {
        assertFalse("" == this.history.toString());
        assertTrue("" != this.history.toString());
    }

}
