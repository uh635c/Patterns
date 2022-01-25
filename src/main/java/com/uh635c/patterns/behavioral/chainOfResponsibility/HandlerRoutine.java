package com.uh635c.patterns.behavioral.chainOfResponsibility;

public class HandlerRoutine implements Handler{
    private Handler next;

    @Override
    public void handle(Email email) {

        if(email.getContain().equals("routine")){
            System.out.println("The email is processed as a routine.");
        }else{
            next.handle(email);
        }
    }

    @Override
    public void setNext(Handler handler) {
        next = handler;
    }
}
