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
     * Default Constructor.
     * @param a the current value.
     */
    public Addition(final float value) {
        this.value = value;
    }

    /**
     * Apply addition
     * @param addValue the value to add at current.
     * @return the result of addition.
     */
    public float apply(final float addValue) {
        this.value += addValue;
        return this.value;
    }
}
