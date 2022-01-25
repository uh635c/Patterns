package com.uh635c.patterns.structural.composite;

import java.util.*;

public class Team {
    private List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer){
        developers.remove(developer);
    }

    public void createProject(){
        System.out.println("Team creates project...");
        for(Developer developer:developers){
            developer.writeCode();
        }
    }

}
