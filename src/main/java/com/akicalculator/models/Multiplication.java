package com.akicalculator.models;

/**
 * Multiplication class
 */
public class Multiplication extends Operation {

    /**
     * Default Constructor.
     * @param firstValue of operation
     * @param secondValue of operation
     */
    public Multiplication(final float firstValue, final float secondValue) {
        super(firstValue, secondValue);
    }

    /**
     * Apply multiplication
     * @return the multiplication result
     */
    public float apply() {
        this.result = this.firstValue * this.secondValue;
        return this.result;
    }
}
