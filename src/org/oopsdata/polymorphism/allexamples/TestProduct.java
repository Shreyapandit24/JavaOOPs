package org.oopsdata.polymorphism.allexamples;

public class TestProduct {
   public static void main(String[] args) {
	   Product p1=new Product(101,"Mobile","This is Smartphone.");
	   Product p2=new Product(p1);
	   
	   Product p3=new Product();
	   p3.display();
	   p3.diaplay(10);
	   p3.diaplay(26);
	   p3.display(1010,"Camera");
}
}
