package com.akicalculator.models;

/**
 * Operation
 */
public class Operation {

	/**
	 * Current value
	 */
    protected transient float value;
    
    /**
     * Default Constructor.
     * @param value the current value.
     */
    public Operation(final float value) {
        this.value = value;
    }
}
