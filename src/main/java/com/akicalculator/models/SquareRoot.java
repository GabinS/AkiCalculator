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

    /**
     * Display operation in console
     */
    @Override
    public void printMessageOperation() {
        final String msg = this.operator + this.firstValue + " = " + this.result + "\n";
        System.out.println(msg);
    }

}
