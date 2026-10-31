package com.oopsData.abstractwithinheritance;

import java.util.Scanner;

public class EmployeeData extends EmployeeService {
	Scanner scanner=new Scanner(System.in);
	//Employee e1=new Employee();
	Address a1=new Address();
	Dept d1=new Dept();
	
    public void setData() {
    	System.out.println("Enter Emp id: ");
    	int eid=scanner.nextInt();
    	System.out.println("Enter Emp name : ");
    	String name = scanner.next();
    	System.out.println("Enter Salary : ");
    	float salary=scanner.nextFloat();
    	System.out.println("Enter adhar : ");
    	String adhar=scanner.next();
    	System.out.println("Enter pan : ");
    	String pan=scanner.next();
    	System.out.println("Enter mobileno : ");
    	String mobile=scanner.next();
    	System.out.println("Enter dob : ");
    	String dob=scanner.next();
    	System.out.println();
    	System.out.println("Enter Address Details :");
    	System.out.println("Enter Flatno : ");
    	int flatno=scanner.nextInt();
    	System.out.println("Enter area : ");
    	String area=scanner.next();
    	System.out.println("Enter city: ");
    	String city=scanner.next();
    	System.out.println("Enter taluka : ");
    	String taluka=scanner.next();
    	System.out.println("Enter district : ");
    	String district=scanner.next();
    	System.out.println("Enter state : ");
    	String state = scanner.next();
    	System.out.println("Enter pincode : ");
    	int pincode = scanner.nextInt();
    	System.out.println();
    	System.out.println("Enter Department details : ");
    	System.out.println("Enter Dept id : ");
    	int did=scanner.nextInt();
    	System.out.println("Enter Department Name : ");
    	String dname = scanner.next();
    	System.out.println("Enter building name : ");
    	String buildingname = scanner.next();
    	
    	setEid(eid);
    	setName(name);
    	setSalary(salary);
    	setAdhar(adhar);
    	setPan(pan);
    	setMobile(mobile);
    	setDob(dob);
    	a1.setFlatno(flatno);
    	a1.setArea(area);
    	a1.setCity(city);
    	a1.setTaluka(taluka);
    	a1.setDistrict(district);
    	a1.setState(state);
    	a1.setPincode(pincode);
    	d1.setDid(did);
    	d1.setDname(dname);
    	d1.setBuildingname(buildingname);
    	
    	
    }
    
    public void getData() {
    	System.out.println("Employee ID: "+getEid());
    	System.out.println("Employee Name: "+getName());
    	System.out.println("Employee Salary: "+getSalary());
    	System.out.println("Employee Adhar no is : "+getAdhar());
    	System.out.println("Employee PAN no is: "+getPan());
    	System.out.println("Employee Mobile Number: "+getMobile());
    	System.out.println("Employee Date of Birth: "+getDob()+"\n");
    	System.out.println("Employee's Address Details : ");
    	System.out.println("Address : "+a1.getFlatno()+"\t"+a1.getArea()+"\t"+a1.getCity()+"\t"+a1.getTaluka()+"\t"+a1.getDistrict()+"\t"+a1.getState()+"\t"+a1.getPincode()+"\n");
    	System.out.println("Employee's Department Details : ");
    	System.out.println("Department : "+d1.getDid()+"\t"+d1.getDname()+"\t"+d1.getBuildingname());
    	
    }
}
