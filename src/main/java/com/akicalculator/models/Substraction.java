package com.akicalculator.models;

/**
 * Substraction class.
 *
 */
public class Substraction {
	
	private float value;
	private float substractValue;
	
	/***
	 * 
	 * @param a : first value of the substraction.
	 */
    public Substraction(float a) {
        this.value = a;
    }

    /**
     * Apply command.
     * @param b value to operate.
     * @return the new value after command.
     */
    public float apply(float b) {
        this.substractValue = b;
        this.value -= this.substractValue;
        return this.value;
    }

    /**
     * Rollback the value.
     * @param b value to operate.
     * @return the value before command.
     */
	public float undo(float b) {
		this.substractValue = b;
        this.value += this.substractValue;
        return this.value;
	}

	

}
