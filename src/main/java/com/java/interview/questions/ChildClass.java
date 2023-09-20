package com.java.interview.questions;

public class ChildClass extends ParentClass{

    @Override
    protected void printMessage(){
        System.out.println("Child class private method");
    }
}
