package com.akicalculator.models;

/**
 * Addition
 */
public class Addition extends Operation {

    /**
     * Default Constructor.
     * @param value the current value.
     */
    public Addition(final float value) {
        super(value);
    }

    /**
     * Apply addition
     * @param addValue the value to add at current.
     * @return the result of addition.
     */
    public float apply(final float addValue) {
        this.value += addValue;
        return this.value;
    }
}
