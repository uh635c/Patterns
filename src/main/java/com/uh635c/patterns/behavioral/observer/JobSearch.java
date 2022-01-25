package com.uh635c.patterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java position.");
        jobSite.addVacancy("Second Java position.");

        Observer firstSubscriber = new Subscriber("Sergey Kornilov");
        Observer secondSubscriber = new Subscriber("Peter Pen");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java Position.");

        jobSite.removeVacancy("First Java position.");
    }
}
