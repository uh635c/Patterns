package com.uh635c.patterns.behavioral.command;

public class UndateCommand implements Command{
    DataBase dataBase;

    public UndateCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.update();
    }
}
