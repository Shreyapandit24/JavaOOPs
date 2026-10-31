package com.oopsData.multilevel.login;

public class GrandChild extends Child{
	static {
		System.out.println("This is static block of Grandchild class");
	}
	{
		System.out.println("This is non-static block of Grandchild class");
	}
	public GrandChild() {
		super(50);
		System.out.println("Grandchild default");
	}
	public GrandChild(int x) {
		this();
		System.out.println("Grandchild default");
	}
}
