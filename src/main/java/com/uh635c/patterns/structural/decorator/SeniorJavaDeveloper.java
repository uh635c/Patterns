package com.uh635c.patterns.structural.decorator;

public class SeniorJavaDeveloper implements DecoratorDeveloper{
    private Developer developer;

    public SeniorJavaDeveloper(Developer developer) {
        this.developer = developer;
    }

    public String makeCodeReview(){
        return "make code review.";
    }

    @Override
    public String doJob() {
        return developer.doJob()+makeCodeReview();
    }
}
