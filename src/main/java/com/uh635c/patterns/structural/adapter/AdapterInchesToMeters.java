package com.uh635c.patterns.structural.adapter;

public class AdapterInchesToMeters {
    private SquareAreaInches squareAreaInches;

    public AdapterInchesToMeters(int side){
        squareAreaInches.setSide(side);
    }

    public double areaCalculation(){
        return squareAreaInches.areaCalculation()*0.0254-0.0254;
    }
}
