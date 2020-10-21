package com.akicalculator.models;

/**
 * Substraction class.
 *
 */
public class Substraction {
	
	/**
	 * Value to substract.
	 */
	private transient float value;
	/**
	 * Value to operate.
	 */
	private transient float substractValue;
	
	/***
	 * 
	 * @param value : first value of the substraction.
	 */
    public Substraction(final float value) {
        this.value = value;
    }
        
  
	/**
     * Apply command.
     * @param b value to operate.
     * @return the new value after command.
     */
    public float apply(final float substractValue) {
        this.substractValue = substractValue;
        this.value -= this.substractValue;
        return this.value;
    }

    /**
     * Rollback the value.
     * @param b value to operate.
     * @return the value before command.
     */
	public float undo(final float substractValue) {
		this.substractValue = substractValue;
        this.value += this.substractValue;
        return this.value;
	}	

}
