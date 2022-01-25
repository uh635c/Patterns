package com.uh635c.patterns.behavioral.chainOfResponsibility;

public class HandlerImportant implements Handler{
    private Handler next;

    @Override
    public void handle(Email email) {

        if(email.getContain().equals("important")){
            System.out.println("The email is processed as a important.");
        }else{
            next.handle(email);
        }
    }

    @Override
    public void setNext(Handler handler) {
        next = handler;
    }
}
