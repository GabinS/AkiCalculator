package com.akicalculator.models;

/**
 * Division
 */
public class Division extends Operation {

    /**
     * Default Constructor.
     * @param firstValue of operation
     * @param secondValue of operation
     */
    public Division(final float firstValue, final float secondValue) {
        super(firstValue, secondValue);
    }

    /**
     * Apply division
     * @return the division result
     */
    public float apply() {
        if (0.0f != this.secondValue) {
            this.result = this.firstValue / this.secondValue;
        }
        return this.result;
    }
}
