package com.oopsData.login;

public class Test {
public static void main(String[] args) {
	ProductSingleton p1=ProductSingleton.getProduct();
	ProductSingleton p2=ProductSingleton.getProduct();
	ProductSingleton p3=ProductSingleton.getProduct();
    
	System.out.println(p1.hashCode());
	System.out.println(p2.hashCode());
	System.out.println(p3.hashCode());
}
}
