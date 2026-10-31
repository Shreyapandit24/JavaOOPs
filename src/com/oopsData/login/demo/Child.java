package com.oopsData.login.demo;

public class Child extends Parent {
public Child() {
	super();
	System.out.println("Child class constructor");
}
public Child(int x) {
	//super(40);
	System.out.println("Child class parameterized constructor");
}
public Child(String a,String b) {
	//super(10,"x");
	System.out.println("Child class String constructor");
}
}
