package com.uh635c.patterns.creational.singleton;

public class Test {
    public static void main(String[] args) {

        Logger.getInstance().addLog("first line");
        Logger.getInstance().addLog("second line");
        Logger.getInstance().addLog("thirst line");

        System.out.println(Logger.getInstance());
    }
}
