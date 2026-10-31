package org.oopsdata.sppu.signup.interfaceall.practiceex;

public class Test {
public static void main(String[] args) {
	StudentCreateService s1=new StudentService();
	StudentFetchService s2=new StudentService();
	
	s1.setDetails();
	s2.getDetails();
}
}
