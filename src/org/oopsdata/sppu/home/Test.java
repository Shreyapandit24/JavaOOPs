package org.oopsdata.sppu.home;

public class Test {
public static void main(String[] args) {
	Service sc=new Service();
	sc.setAdminDetails();
	sc.setDevDetails();
	sc.setTesterDetails();
	
	sc.getAdminDetails();
	sc.getDevDetails();
	sc.getTesterDetails();
	
}
}
