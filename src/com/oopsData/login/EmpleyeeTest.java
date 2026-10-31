package com.oopsData.login;

import java.util.Scanner;

public class EmpleyeeTest {
	public static void main(String[] args) {
		Employee e1 = Employee.getInstance();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter emp id : ");
		int id=sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Enter emp name : ");
		String name= sc.nextLine();
		
		
		System.out.println("Enter emp salary : ");
		double sal=sc.nextDouble();
		
		
		Employee.setData(id,name,sal);
		Employee.getData();
		
		sc.close();
	}
}
