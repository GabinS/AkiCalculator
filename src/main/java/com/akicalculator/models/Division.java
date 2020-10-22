package com.akicalculator.models;

/**
 * Division
 */
public class Division extends Operation {

    /**
     * Default Constructor.
     * @param value the current value.
     */
    public Division(final float value) {
        super(value);
    }

    /**
     * Apply division
     * @param divisionValue the value to divide at current.
     * @return the result of addition.
     */
    public float apply(final float divisionValue) {
        if (0.0f != divisionValue) {
            this.value /= divisionValue;
        }
        return this.value;
    }
}
