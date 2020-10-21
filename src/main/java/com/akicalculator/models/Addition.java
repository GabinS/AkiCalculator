package com.akicalculator.models;

/**
 * Addition
 */
public class Addition {
	
	/**
	 * Current value
	 */
    private transient float value;
    /**
     * Value to add at current
     */
    private transient float addValue;

    /**
     * Default Constructor.
     * @param a the current value.
     */
    public Addition(final float a) {
        this.value = a;
    }

    /**
     * Apply addition
     * @param b value to add at current.
     * @return the result of addition.
     */
    public float apply(final float b) {
        this.addValue = b;

        this.value += this.addValue;
        return this.value;
    }
}
