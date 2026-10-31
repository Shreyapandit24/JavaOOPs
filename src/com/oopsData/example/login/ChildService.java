package com.oopsData.example.login;

import java.util.Scanner;

public class ChildService extends Child {
	Scanner scanner=new Scanner(System.in);
	public void setData() {
    	System.out.println("Enter City : ");
    	String city=scanner.next();
    	System.out.println("Enter Dept : ");
    	String dept=scanner.next();
    	
    	//Child c1=new Child();
    	this.setCity(city);;
    	this.setDept(dept);;
    }
	public void getData() {
		//Child c1=new Child();
        System.out.println(this.getCity());
        System.out.println(this.getDept());
	
	
    }
}
