package com.uh635c.patterns.structural.bridge;

public class StockExchange extends Program{

    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("StockExchange development is progress...");
        developer.writeCode();
    }
}
