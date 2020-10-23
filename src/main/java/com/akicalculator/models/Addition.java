package com.akicalculator.models;

/**
 * Addition
 */
public class Addition extends Operation {

    /**
     * Default Constructor.
     * @param firstValueAdd of operation
     * @param secondValueAdd of operation
     */
    public Addition(final float firstValueAdd, final float secondValueAdd) {
        super(firstValueAdd, secondValueAdd, "+");
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
