package com.oopsData.abstractiondemo.register;

public abstract class Product {
 abstract void getProduct();
 public Product() {
	 System.out.println("Hello product class");
 }
 public Product(int x) {
	 System.out.println("Hello Parameterized");
 }
}
