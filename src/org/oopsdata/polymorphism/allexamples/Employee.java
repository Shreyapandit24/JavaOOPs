package org.oopsdata.polymorphism.allexamples;

public class Employee {
    private int id;
    private String name;
    private float salary;
	
    public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}




	public Employee(Employee employee) {
		super();
		this.id = employee.id;
		this.name = employee.name;
		this.salary = employee.salary;
		
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.salary);
	}
    
    
}
