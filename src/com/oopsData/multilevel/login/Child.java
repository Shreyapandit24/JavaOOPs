package com.oopsData.multilevel.login;

public class Child extends Parent {
	static {
		System.out.println("This is static block of child class");
	}
	{
		System.out.println("This is non-static block of child class");
	}
	public Child() {
	super(30);
	System.out.println("child default");
    }
	public Child(int x) {
		this();
		System.out.println("child parameterized");
	 }
	
	
}
