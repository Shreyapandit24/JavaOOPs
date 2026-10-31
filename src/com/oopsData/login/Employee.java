package com.oopsData.login;

public class Employee {
	
	private static volatile Employee e1=null;
	
	private static int empid;
	private static String empname;
	private static double empsalary;
	
	private Employee() {
		
	}
	
    
    public static Employee getInstance() {
    	if(e1==null) {
    		e1=new Employee();
    	}
    	return e1;
    }
    
    public static void setData(int empid,String empname,double empsalary) {
    	e1.empid = empid;
    	e1.empname = empname;
    	e1.empsalary = empsalary;
    }
    public static void getData() {
    	System.out.println("Employee ID : "+ empid);
    	System.out.println("Employee Name : "+ empname);
    	System.out.println("Employee Salary : "+ String.format("%.2f",empsalary));
    }
}
