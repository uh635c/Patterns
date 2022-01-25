package com.uh635c.patterns.behavioral.chainOfResponsibility;

public class HandlerDefault implements Handler{
    @Override
    public void handle(Email email) {
        System.out.println("The email was not categorized.");
    }

    @Override
    public void setNext(Handler handler) {

    }
}
