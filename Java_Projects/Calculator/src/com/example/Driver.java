package com.example;

public class Driver {
    public static void main (String args []) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        System.out.println(simpleCalculator.add(7.0, 7.0));
        System.out.println(simpleCalculator.subtract(4.0, 3.0));
        System.out.println(simpleCalculator.multiply(11.0, 7.0));
        System.out.println(simpleCalculator.divide(77.0, 11.0));
    }
}
