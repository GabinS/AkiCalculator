package com.akicalculator.models;

/**
 * Division
 */
public class Division extends Operation {

    /**
     * Default Constructor.
     * @param firstValue of operation
     * @param secondValue of operation
     */
    public Division(final float firstValue, final float secondValue) {
        super(firstValue, secondValue, "/");
    }

    /**
     * Apply division
     * @return the division result
     */
    public float apply() {
        this.result = 0;
        if (0 != this.secondValue) {
            this.result = this.firstValue / this.secondValue;
            System.out.println("Impossible de faire une division par 0");
        }
        return this.result;
    }
}
