package com.uh635c.patterns.structural.bridge;

public class Test {
    public static void main(String[] args) {
        Program [] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new PythonDeveloper())};

        for(Program program:programs){
            program.developProgram();
        }
    }
}
