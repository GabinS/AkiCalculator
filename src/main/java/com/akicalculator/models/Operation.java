package com.akicalculator.models;

/**
 * Operation
 */
public class Operation implements Command {

    /**
     * First value
     */
    protected transient float firstValue;

    /**
     * Second value
     */
    protected transient float secondValue;

    /**
     * Result
     */
    protected transient float result;

    /**
     * Operator
     */
    protected transient String operator;

    /**
     * Default Constructor.
     * @param firstValue of operation
     * @param secondValue of operation
     * @param operator the sign of the operator
     */
    public Operation(final float firstValue, final float secondValue, final String operator) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operator = operator;
        this.result = 0;

    }

    @Override
    public float apply() {
        return 0;
    }

    /**
     * Get operation in console
     * @return the operation
     */
    public String getMessageOperation() {
        return this.firstValue + " " + this.operator + " " + this.secondValue + " = " + this.result + "\n";
    }
}
