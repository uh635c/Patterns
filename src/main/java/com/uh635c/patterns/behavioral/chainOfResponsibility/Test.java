package com.uh635c.patterns.behavioral.chainOfResponsibility;

public class Test {
    public static void main(String[] args) {
        Handler h1 = new HandlerSpam();
        Handler h2 = new HandlerRoutine();
        Handler h3 = new HandlerImportant();
        Handler h4 = new HandlerDefault();

        h1.setNext(h2);
        h2.setNext(h3);
        h3.setNext(h4);

        Email email = new Email("fasdf");
        h1.handle(email);
    }
}
