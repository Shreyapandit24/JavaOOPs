package org.oopsdata.polymorphism.allexamples;

public class Product {
   private int pid;
   private String pname;
   private String pdesc;
   public Product() {
	super();
	// TODO Auto-generated constructor stub
   }
   public Product(int pid, String pname, String pdesc) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pdesc = pdesc;
   }
   
   public Product(Product product) {
	   this.pid = product.pid;
		this.pname = product.pname;
		this.pdesc = product.pdesc;
		System.out.println(this.pid);
		System.out.println(this.pname);
		System.out.println(this.pdesc);
	   
   }
	
   public void display() {
	   System.out.println("This is product class");
   }
   public void diaplay(int pid) {
	   System.out.println("This is Pid block");
   }
   public void display(int pid,String pname) {
	   System.out.println("This is Pid & Pname");
   }
   public int display(int pid) {
	   return pid;
   }
	
}
