package com.example;

public class SimpleCalculator {

    public double n1, n2;

    public SimpleCalculator() {
    }

    public SimpleCalculator(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }


    public double add (double n1, double n2) {
        return n1 + n2;
    }

    public double subtract (double n1, double n2) {
        return n1 - n2;
    }

    public double multiply (double n1, double n2) {
        return n1 * n2;
    }

    public double divide (double n1, double n2) {
        return n1/n2;
    }
}
