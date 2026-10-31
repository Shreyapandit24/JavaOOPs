package org.oopsdata.returntypeexamples;

import java.util.Scanner;

public class EmployeeServiceimplementation implements EmployeeService {
	private Employee employee = new Employee();
	@Override
	public Employee setData(){
		
		Scanner scanner=new Scanner(System.in);
		
		DeptService deptService=new DeptServiceImplementation();
		AddressInterface add = new AddressServiceImplementation();
        

		System.out.println("Enter employee id : ");
		int id=scanner.nextInt();
		System.out.println("Enter employee name : ");
		String name=scanner.next();
		System.out.println("Enter employee salary : ");
		float salary=scanner.nextFloat();
		Dept dept=deptService.setDept();
		Address address=add.setAddress();
					
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);
		employee.setDept(dept);
		employee.setAddress(address);
		return employee;
	}
	public Employee getData() {
		
		return employee;
	}

}
