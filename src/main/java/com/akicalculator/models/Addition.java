package com.akicalculator.models;

/**
 * Addition
 */
public class Addition extends Operation {

    /**
     * Default Constructor.
     * @param firstValue of operation
     * @param secondValue of operation
     */
    public Addition(final float firstValue, final float secondValue) {
        super(firstValue, secondValue, "+");
    }

    /**
     * Apply addition
     * @return the addition result
     */
    public float apply() {
        this.result = this.firstValue + this.secondValue;
        return this.result;
    }
}
