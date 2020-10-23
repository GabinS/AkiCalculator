package com.akicalculator;

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
     *Test method for {@link com.akicalculator.models.History#add()}
     */
    @Test
    public void testAdd() {
        this.history.add("test");
        assertTrue(1 == this.history.getList().size());
    }

}
