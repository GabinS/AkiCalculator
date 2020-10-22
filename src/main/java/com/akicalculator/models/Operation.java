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
     * @param firstValue of operation
     * @param secondValue of operation
     */
    public Operation(final float firstValue, final float secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.result = 0;

    }
}
