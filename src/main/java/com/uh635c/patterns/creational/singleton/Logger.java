package com.uh635c.patterns.creational.singleton;

public class Logger {
    private volatile static Logger logger;
    private static String logFile="...\n";

    public static Logger getInstance(){
        if(logger == null){
            synchronized (Logger.class){
                if(logger == null){
                    return new Logger();
                }
            }
        }
        return logger;
    }

    public void addLog(String str){
        logFile += str + "\n";
    }

    public String toString(){
        return "logFile has: \n" + logFile;
    }
}
