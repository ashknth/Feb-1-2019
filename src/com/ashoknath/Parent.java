package com.ashoknath;


/**
 * Created by Ashok on 2/1/2019.
 */
public class Parent {

    public void parentMethod() {
        System.out.println("Parent class method.");
    }
}

class Child extends Parent {
    public void childMethod() {
        System.out.println("Child class method.");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

    }
}

