package com.oopsData.example.login;

import java.util.Scanner;

public class ParentService extends Parent{
	Scanner scanner=new Scanner(System.in);
	public void setData() {
    	System.out.println("Enter Id : ");
    	int id=scanner.nextInt();
    	System.out.println("Enter Name : ");
    	String name=scanner.next();
    	
    	//Parent p1=new Parent();
    	this.setId(id);
    	this.setName(name);
    }
	public void getData() {
		//Parent p1=new Parent();
        System.out.println(this.getId());
        System.out.println(this.getName());
    }
    
	
}
