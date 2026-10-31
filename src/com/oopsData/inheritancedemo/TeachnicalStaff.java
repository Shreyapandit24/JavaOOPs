package com.oopsData.inheritancedemo;

public class TeachnicalStaff extends Details {
private String techString;

public String getTechString() {
	return techString;
}

public void setTechString(String techString) {
	this.techString = techString;
}

public TeachnicalStaff() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "TeachnicalStaff [techString=" + techString + "]";
}

}
