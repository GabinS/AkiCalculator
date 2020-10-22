package com.akicalculator.models;

/**
 * Square Root
 */
public class SquareRoot extends Operation {

    /**
     * Default Constructor.
     * @param firstValue of operation
     */
    public SquareRoot(float firstValue) {
        super(firstValue, 0, "V");
    }

    /**
     * Apply square root.
     * @return the square root result
     */
    public float apply() {
        this.result = (float) Math.sqrt(this.firstValue) ;
        return this.result;
    }

}
