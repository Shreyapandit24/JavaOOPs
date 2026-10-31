package org.oopsdata.sbi.returntype.thirtyoct;

public class Test {
public static void main(String[] args) {
	Data d1=new Data();
	d1.getData();
	d1.getData(101);
	d1.getData("Shreya@gmail.com");
	d1.getData(111, "Shreya@gmail.com");
	d1.getData("shreya@gmail.com", 1022);
}
}
