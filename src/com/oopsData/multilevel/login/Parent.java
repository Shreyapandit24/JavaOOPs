package com.oopsData.multilevel.login;

public class Parent {
 
	static {
		System.out.println("This is static block of parent class");
	}
	{
		System.out.println("This is non-static block of parent class");
	}
	
	public Parent() {
	System.out.println("Parent Default");
}
	public Parent(int x) {
		this();
		System.out.println("Parent Default");
	}
}
