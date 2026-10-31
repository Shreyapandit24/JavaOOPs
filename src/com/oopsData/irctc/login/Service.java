package com.oopsData.irctc.login;

import java.util.Scanner;

public class Service {
	Scanner scanner=new Scanner(System.in);
	void getData() {

		System.out.println("Enter product id:");
		int id=scanner.nextInt();
		System.out.println("Enter Product name :");
		String pname=scanner.next();
		System.out.println("Enter price :");
		float price=scanner.nextFloat();
		System.out.println("Category of the product:\n");
		System.out.println("Enter category id :");
		int cid=scanner.nextInt();
		System.out.println("Enter category name :");
		String cname=scanner.next();
		System.out.println("Enter category desc :");
		String cDesc=scanner.next();

		Category c1=new Category();
		c1.setCid(cid);
		c1.setcName(cname);
		c1.setcDesc(cDesc);

		Product p1=new Product();
		p1.setPid(id);
		p1.setPname(pname);
		p1.setPrice(price);
		c1.setCid(cid);
		c1.setcName(cname);
		c1.setcDesc(cDesc);

		//this statement returning some object
		System.out.println(p1+"\n");

		System.out.println("Displaying Details : \n");
		System.out.println("Product id : "+p1.getPid());
		System.out.println("Product name : "+p1.getPname());
		System.out.println("Product Price : "+p1.getPrice()+"\n");
		System.out.println("Product Category Details : ");
		System.out.println("Category id : "+c1.getCid());
		System.out.println("Category name : "+c1.getcName());
		System.out.println("Category Description : "+c1.getcDesc());
	}
}
