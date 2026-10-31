package org.oopsdata.returntypeexamples;

import java.util.Scanner;

public class DeptServiceImplementation implements DeptService {
    Scanner scanner=new Scanner(System.in);
    private Dept dept=new Dept();
    public Dept setDept() {
    	
    	System.out.println("Enter dept id : ");
    	int deptid=scanner.nextInt();
    	System.out.println("Enter dept name : ");
    	String dname=scanner.next();
    	System.out.println("Enter dept description : ");
    	String desc=scanner.next();
    	
    	dept.setDeptid(deptid);
    	dept.setDeptname(dname);
    	dept.setDeptdesc(desc);
     	
    	return dept;
    }
    public Dept getDept() {
    	return dept;
    }
}
