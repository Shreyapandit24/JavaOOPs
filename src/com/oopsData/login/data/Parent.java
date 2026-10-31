package com.oopsData.login.data;

public class Parent {
public Parent() {
	System.out.println("Parent Default");
}
public Parent(int x) {
	this();
	System.out.println("Parent Paramterized");
}
public Parent(int x,int y) {
	this(10);
	System.out.println("Parent 2args Paramterized");
}
}

