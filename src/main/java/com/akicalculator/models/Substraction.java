package com.akicalculator.models;

/**
 * Substraction class.
 *
 */
public class Substraction extends Operation {

    /**
     * Default Constructor.
     * @param value : first value of the substraction.
     */
    public Substraction(final float value) {
        super(value);
    }

    /**
     * Apply substraction.
     * @param substractValue value to operate.
     * @return the new value after command.
     */
    public float apply(final float substractValue) {
        this.value -= substractValue;
        return this.value;
    }

}
