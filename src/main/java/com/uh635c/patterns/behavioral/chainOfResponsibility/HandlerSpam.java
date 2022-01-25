package com.uh635c.patterns.behavioral.chainOfResponsibility;

public class HandlerSpam implements Handler{
    private Handler next;

    @Override
    public void handle(Email email) {

        if(email.getContain().equals("spam")){
            System.out.println("The email is processed as a spam.");
        }else{
            next.handle(email);
        }
    }

    @Override
    public void setNext(Handler handler) {
        next = handler;
    }
}
