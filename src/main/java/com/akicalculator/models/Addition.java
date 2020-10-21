package com.akicalculator.models;

/**
 * Addition
 */
public class Addition {
	
	/**
	 * Current value
	 */
    private float value;
    /**
     * Value to add at current
     */
    private float addValue;

    /**
     * Default Constructor.
     * @param a the current value.
     */
    public Addition(float a) {
        this.value = a;
    }

    /**
     * Apply addition
     * @param b value to add at current.
     * @return the result of addition.
     */
    public float apply(float b) {
        this.addValue = b;

        this.value += this.addValue;
        return this.value;
    }
}
