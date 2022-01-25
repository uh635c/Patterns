package com.uh635c.patterns.behavioral.chainOfResponsibility;

public interface Handler {
    void handle(Email email);
    void setNext(Handler handler);
}
