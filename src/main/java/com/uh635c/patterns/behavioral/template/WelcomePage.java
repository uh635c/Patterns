package com.uh635c.patterns.behavioral.template;

public class WelcomePage extends WebSiteTemplate{
       @Override
    protected void showPageContent() {
        System.out.println("Welcome");
    }
}
