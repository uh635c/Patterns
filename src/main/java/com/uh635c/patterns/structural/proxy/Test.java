package com.uh635c.patterns.structural.proxy;

public class Test {
    public static void main(String[] args) {
        Project project = new ProxyProject("some url to github.");

        project.run();
    }
}
