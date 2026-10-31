package org.oopsdata.sppu.signup.interfaceall.practiceex;
import java.util.Scanner;
public class StudentService implements StudentCreateService , StudentFetchService{
    Scanner scanner=new Scanner(System.in);
	static Student student=new Student();
    
    @Override
    public void setDetails() {
    	System.out.println("Enter Student ID : ");
    	int id = scanner.nextInt();
    	System.out.println("Enter Student Name : ");
    	String name= scanner.next();
    	System.out.println("Enter Studnet City : ");
    	String city= scanner.next();
    	System.out.println("Enter Student Dept : ");
    	String dept= scanner.next();
    	System.out.println("Enter Student percentage : ");
    	float percentage=scanner.nextFloat();
    	if(student==null) {
    		student=new Student();
    		System.out.println("Hi");
    	}else {
    	student.setSid(id);
    	student.setName(name);
    	student.setCity(city);
    	student.setDept(dept);
    	student.setPercentage(percentage);
    	}
    	
    }
    @Override
    public void getDetails() {
    	if(student==null) {
    		student=new Student();
    		System.out.println("Hi");
    	}else {
    	System.out.println("Student Details : ");
    	System.out.println("Student ID : "+student.getSid());
    	System.out.println("Student Name : "+student.getName());
    	System.out.println("Student City : "+student.getCity());
    	System.out.println("Student Department : "+student.getDept());
    	System.out.println("Student Percentage : "+student.getPercentage());
    	}
    }
    
}
