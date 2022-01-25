package com.uh635c.patterns.creational.prototype;

public class Test {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(1, "Sergey", 38);
        System.out.println(myClass);

        System.out.println();

        MyClass copyOfMyClass = myClass.cloneObject();
        System.out.println(copyOfMyClass);
    }
}
