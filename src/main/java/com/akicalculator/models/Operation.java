package com.akicalculator.models;

/**
 * Operation
 */
public class Operation {

    /**
     * First value
     */
    protected transient float firstValue;

    /**
     * Second value
     */
    protected transient float secondValue;

    /**
     * Result
     */
    protected transient float result;

    /**
     * Default Constructor.
     * @param value the current value.
     */
    public Operation(final float firstValue, final float secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.result = 0;

    }
}
