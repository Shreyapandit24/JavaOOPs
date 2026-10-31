package com.oopsData.finalkeyword;

import java.util.Scanner;

public class EmployeeData {
	private final Scanner scanner=new Scanner(System.in);
    void getData() {
	final int emp_id;
	final int org_id;
	System.out.println("Enter your EmpID: ");
	emp_id=scanner.nextInt();
	System.out.println("Enter your Organization Id : ");
	org_id=scanner.nextInt();
	
	System.out.println("Employee ID is: "+emp_id);
	System.out.println("Organization ID is: "+org_id);
    }
    
    public static void main(String[] args) {
		EmployeeData emp1=new EmployeeData();
		emp1.getData();
	}
}
