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
	 * @param value : first value of the substraction.
	 */
    public Substraction(float value) {
        this.value = value;
    }

    /**
     * Apply command.
     * @param b value to operate.
     * @return the new value after command.
     */
    public float apply(float substractValue) {
        this.substractValue = substractValue;
        this.value -= this.substractValue;
        return this.value;
    }

    /**
     * Rollback the value.
     * @param b value to operate.
     * @return the value before command.
     */
	public float undo(float substractValue) {
		this.substractValue = substractValue;
        this.value += this.substractValue;
        return this.value;
	}

	

}
