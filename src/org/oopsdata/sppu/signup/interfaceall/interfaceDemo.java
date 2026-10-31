package org.oopsdata.sppu.signup.interfaceall;


public interface interfaceDemo {
	//interface dont have constructor
	private void display() {
		System.out.println("Private Display Sound");
	}
	default void DatabaseMetaData() {
		System.out.println("Default Data Method");
	}
	static void getData() {
		System.out.println("Static geteData");
	}
}
