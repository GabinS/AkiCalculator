package com.akicalculator.models;

/**
 * 
 * Multiplication class
 * 
 */
public class Multiplication {
		
		/*
		 * Current value
		 */
	    private float value;
	    
	    /*
	     * Value to multiplicatee to current
	     */
	    private float multiValue;
	    
	    /**
	     * 
	     * @param a value obtained from console
	     */
	    public Multiplication(final float a) {
	        this.value = a;
	    }

	    /**
	     * 
	     * @param b value obtain from console
	     * @return the multiplication of b and a
	     */
	    public float apply(final float b) {
	        this.multiValue = b;

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
