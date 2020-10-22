package com.akicalculator.models;

/**
 * Modulo class.
 *
 */
public class Modulo extends Operation{

    /**
     * Default Constructor.
     * @param firstValue of operation
     * @param secondValue of operation
     */
    public Modulo(float firstValue, float secondValue) {
        super(firstValue, secondValue);
    }

    /**
     * Apply modulo
     * @return the result of the modulo
     */
    public float apply() {
        this.result = this.firstValue % this.secondValue;
        return this.result;
    }
}
