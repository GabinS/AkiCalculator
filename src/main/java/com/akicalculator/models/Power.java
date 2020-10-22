package com.akicalculator.models;

/**
 * Power class.
 */
public class Power extends Operation{

    /**
     * Default Constructor.
     * @param firstValue of operation
     * @param secondValue of operation
     */
    public Power(float firstValue, float secondValue) {
        super(firstValue, secondValue);
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
