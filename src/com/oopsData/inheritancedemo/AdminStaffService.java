package com.oopsData.inheritancedemo;

import java.util.Scanner;


public class AdminStaffService extends Details{
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
		  System.out.println("Enter adminId ");
		  String adminId=scanner.next();
		  
		  AdminStaff s1 = new AdminStaff();
		  s1.setId(id);
		  s1.setName(name);
		  s1.setDept(dept);
		  s1.setCollege(college);
		  s1.setAdhar(adhar);
		  s1.setAdminId(adminId);
		  
		  System.out.println(s1.getId());
		  System.out.println(s1.getName());
		  System.out.println(s1.getDept());
		  System.out.println(s1.getCollege());
		  System.out.println(s1.getAdhar());
		  System.out.println(s1.getAdminId());
	}
}
