package com.akicalculator.models;

/**
 * Multiplication class
 */
public class Multiplication extends Operation {

    /**
     * Default Constructor.
     * @param firstValueMul of operation
     * @param secondValueMul of operation
     */
    public Multiplication(final float firstValueMul, final float secondValueMul) {
        super(firstValueMul, secondValueMul, "*");
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
