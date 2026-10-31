package org.oopsdata.returntypeexamples;

public class Test {
   public static void main(String[] args) {
	   EmployeeService employeeService=new EmployeeServiceimplementation();
	   Employee employee=employeeService.setData();
	   System.out.println(employee.toString());
	   
}
}
