package com.akicalculator.models;

/**
 * Power class.
 */
public class Power extends Operation {

    /**
     * Default Constructor.
     * @param firstValuePow of operation
     * @param secondValuePow of operation
     */
    public Power(final float firstValuePow, final float secondValuePow) {
        super(firstValuePow, secondValuePow, "^");
    }

    /**
     * Apply power
     * @return the result of the power
     */
    public float apply() {
        this.result = (float)Math.pow(this.firstValue,this.secondValue);
        return this.result;
    }

}
