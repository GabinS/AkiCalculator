package com.akicalculator.models;

/**
 * Substraction class.
 *
 */
public class Substraction {
	
	/**
	 * Value to substract.
	 */
	private float value;
	/**
	 * Value to operate.
	 */
	private float substractValue;
	
	/***
	 * 
	 * @param value : first value of the substraction.
	 */
    public Substraction(float value) {
        this.value = value;
    }
        
    /**
     * Get the value to substract.
     * @return the value to substract.
     */
    public float getValue() {
		return value;
	}
    
    /**
     * Get the value to operate.
     * @return the substract value
     */
	public float getSubstractValue() {
		return substractValue;
	}

	/**
	 * Set  the value to substract.
	 * @param value to substract.
	 */
	public void setValue(float value) {
		this.value = value;
	}

	/**
	 * Set the value to operate.
	 * @param substractValue : the substract value.
	 */
	public void setSubstractValue(float substractValue) {
		this.substractValue = substractValue;
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
