package com.uh635c.patterns.behavioral.command;

public class DeleteCommand implements Command{
    DataBase dataBase;

    public DeleteCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.delete();
    }
}
