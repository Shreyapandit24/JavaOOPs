package com.oopsData.abstractdemo.login;

public class Test {
public static void main(String[] args) {
	//EmployeeService emp1=new EmployeeService(); cannot create cause method is not implemented
    EmployeeService e1=new Child(); // reference creation of employee class
    Child c1=new Child();
    e1.getData();
    //e1.display(); parent cannot access any king of data from child class
    c1.display();
    c1.getData();//Child can access any kind of data from parent as well own class
}
}
