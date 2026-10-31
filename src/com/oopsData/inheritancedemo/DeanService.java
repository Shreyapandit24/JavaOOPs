package com.oopsData.inheritancedemo;

import java.util.Scanner;

public class DeanService {
	public void getData() {
		Scanner scanner = new Scanner(System.in);
		  
		  System.out.println("Enter id ");
		  int id= scanner.nextInt();
		  System.out.println("Enter name ");
		  String name=scanner.next();
		  System.out.println("Enter dept ");
		  String dept=scanner.next();
		  System.out.println("Enter adhar ");
		  String adhar=scanner.next();
		  System.out.println("Enter college ");
		  String college=scanner.next();
		  System.out.println("Enter education ");
		  String edu=scanner.next();
		  System.out.println("Enter salary ");
		  float salary=scanner.nextFloat();
		  
		  Dean s1 = new Dean();
		  s1.setId(id);
		  s1.setName(name);
		  s1.setDept(dept);
		  s1.setCollege(college);
		  s1.setAdhar(adhar);
		  s1.setSalary(salary);
		  s1.setEducation(edu);
		  
		  
		  System.out.println(s1.getId());
		  System.out.println(s1.getName());
		  System.out.println(s1.getDept());
		  System.out.println(s1.getCollege());
		  System.out.println(s1.getAdhar());
		  System.out.println(s1.getSalary());
		  System.out.println(s1.getEducation());
	}
}
