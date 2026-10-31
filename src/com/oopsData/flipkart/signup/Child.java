package com.oopsData.flipkart.signup;

public class Child extends Parent{
	public Child() {
    	System.out.println("This is child constructor");
    }
    public Child(int x) {
    	System.out.println("This is child class parameterized constructor");
    }
    void display() {
    	System.out.println("Child class");
    }
}
