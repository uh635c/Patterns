package com.uh635c.patterns.structural.adapter;

public class SquareAreaInches {
    private int side;

    public SquareAreaInches(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double areaCalculation() {
        return side * side;
    }
}
