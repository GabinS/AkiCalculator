package com.akicalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.akicalculator.models.History;

public class TestHistory {

    private History history;

    @Before
    public void setUp() throws Exception {
        this.history = History.getInstance();
    }

    @Test
    public void testAdd() {
        this.history.add("test");
        assertTrue(1 == this.history.getList().size());
    }

}
