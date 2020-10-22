package com.akicalculator.models;

/**
 * Power class.
 */
public class Puissance extends Operation{

    /**
     * Default Constructor.
     * @param firstValue of operation
     * @param secondValue of operation
     */
    public Puissance(float firstValue, float secondValue) {
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
