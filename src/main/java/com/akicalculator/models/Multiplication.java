package com.akicalculator.models;

/**
 *
 * Multiplication class
 *
 */
public class Multiplication extends Operation {

    /**
     * Default Constructor.
     * @param value value obtained from console
     */
    public Multiplication(final float value) {
        super(value);
    }

    /**
     * Apply multiplication
     * @param multiValue value obtain from console
     * @return the multiplication of b and a
     */
    public float apply(final float multiValue) {
        this.value *= multiValue;
        return this.value;
    }
}
