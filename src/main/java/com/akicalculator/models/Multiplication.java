package com.akicalculator.models;

/**
 * 
 * Multiplication class
 * 
 */
public class Multiplication {
		
		/**
		 * Current value
		 */
	    private transient float  value;
	    
	    /**
	     * Value to multiplicatee to current
	     */
	    private transient float multiValue;
	    
	    /**
	     * 
	     * @param a value obtained from console
	     */
	    public Multiplication(final float value) {
	        this.value = value;
	    }

	    /**
	     * 
	     * @param b value obtain from console
	     * @return the multiplication of b and a
	     */
	    public float apply(final float multiValue) {
	        this.multiValue = multiValue;

	        this.value *= this.multiValue;
	        return this.value;
	    }

	    /**
	     * 
	     * @param multiValue the value to multiplicate
	     * @return the value multiplicated
	     */
	    public float redo(final float multiValue) {
	        this.multiValue = multiValue;

	        this.value *= this.multiValue;
	        return this.value;
	    }
	    
	    /**
	     * 
	     * @return the value divided by the multiValue
	     */
	    public float undo() {
	        this.value /= this.multiValue;
	        return this.value;
	    }
}
