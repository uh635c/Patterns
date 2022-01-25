package com.uh635c.patterns.behavioral.command;

public class DataBaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();

        Developer developer = new Developer(
                new InsectCommand(dataBase),
                new UndateCommand(dataBase),
                new SelectCommand(dataBase),
                new DeleteCommand(dataBase)
        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}
