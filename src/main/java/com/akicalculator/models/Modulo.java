package com.akicalculator.models;

/**
 * Modulo class.
 */
public class Modulo extends Operation {

    /**
     * Default Constructor.
     * @param firstValueMod of operation
     * @param secondValueMod of operation
     */
    public Modulo(final float firstValueMod, final float secondValueMod) {
        super(firstValueMod, secondValueMod, "%");
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
