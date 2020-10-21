package com.akicalculator.models;

public class Addition {
	
    private float value;
    private float addValue;

    public Addition(float a) {
        this.value = a;
    }

    public float apply(float b) {
        this.addValue = b;

        this.value += this.addValue;
        return this.value;
    }

    public float undo() {
        this.value -= this.addValue;
        return this.value;
    }
}
