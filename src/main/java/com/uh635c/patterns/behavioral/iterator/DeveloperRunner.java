package com.uh635c.patterns.behavioral.iterator;

public class DeveloperRunner {
    public static void main(String[] args) {
        String [] skills = {"Java", "Spring", "Hibernate", "Maven", "PostreSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Sergey Kornilov", skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.print("Skills: ");

        while(iterator.hasNext()){
            System.out.print(iterator.next().toString() + ", ");
        }
    }
}
