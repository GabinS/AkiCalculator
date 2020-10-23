package com.akicalculator.models;

/**
 * Subtraction class.
 *
 */
public class Subtraction extends Operation {

    /**
     * Default Constructor.
     * @param firstValueSub of operation
     * @param secondValueSub of operation
     */
    public Subtraction(final float firstValueSub, final float secondValueSub) {
        super(firstValueSub, secondValueSub, "-");
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
