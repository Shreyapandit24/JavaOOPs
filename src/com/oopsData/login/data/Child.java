package com.oopsData.login.data;

public class Child extends Parent {
	public Child() {
		super(10,10);
		System.out.println("Child Default");
	}
	public Child(int x) {
		this();
		System.out.println("Child Paramterized");
	}
	public Child(String x,String y) {
		this(10);
		System.out.println("Child with string Paramterized");
	}
}
