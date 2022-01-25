package com.uh635c.patterns.structural.adapter;

public class Test {
    public static void main(String[] args) {
        SquareAreaInches squareAreaInches = new SquareAreaInches(10);
        System.out.println(squareAreaInches.areaCalculation() + " in^2");
        AdapterInchesToMeters adapterInchesToMeters = new AdapterInchesToMeters(10);

        double areaMeters = adapterInchesToMeters.areaCalculation();
        System.out.println(areaMeters + " m^2");
    }

}
