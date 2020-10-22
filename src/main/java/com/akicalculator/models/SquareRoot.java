/**
 *
 */
package com.akicalculator.models;

/**
 * Square Root
 *
 */
public class SquareRoot extends Operation{
    
     /**
     * Default Constructor.
     * @param firstValue of operation
     * @param secondValue of operation
     */
    public SquareRoot(float firstValue) {
        super(firstValue, 0, "V");
    }

    /**
     * Apply squareroot
     * @return the squareroot result
     */
    public float apply() {
        this.result = (float) Math.sqrt(this.firstValue) ;
        return this.result;
    }

}
