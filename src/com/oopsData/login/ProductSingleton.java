package com.oopsData.login;

public class ProductSingleton {
   //private static ProductSingleton p1=new ProductSingleton();//Eager Initialization and returns value earlist but don't use this while creating db cause it can get hacks easily
   private static ProductSingleton p1=null;//Lazy Initialization
   
   private ProductSingleton() {
	   
   }
   public static ProductSingleton getProduct() {
	   if (p1==null)
	       p1=new ProductSingleton();// gonna to execute only once time
	   return p1;
   }
}
