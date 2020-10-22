package com.akicalculator.models;

/**
 * Subtraction class.
 *
 */
public class Subtraction extends Operation {

    /**
     * Default Constructor.
     * @param firstValue of operation
     * @param secondValue of operation
     */
    public Subtraction(final float firstValue, final float secondValue) {
        super(firstValue, secondValue);
    }

    /**
     * Apply subtraction
     * @return the subtraction result
     */
    public float apply() {
        this.result = this.firstValue - this.secondValue;
        return this.result;
    }

}
