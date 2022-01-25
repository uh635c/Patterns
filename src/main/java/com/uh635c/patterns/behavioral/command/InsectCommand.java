package com.uh635c.patterns.behavioral.command;

public class InsectCommand implements Command{
    DataBase dataBase;

    public InsectCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.insert();
    }
}
