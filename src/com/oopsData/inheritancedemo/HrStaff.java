package com.oopsData.inheritancedemo;

public class HrStaff extends Details {
private String hridString;

public String getHridString() {
	return hridString;
}

public void setHridString(String hridString) {
	this.hridString = hridString;
}

public HrStaff() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "HrStaff [hridString=" + hridString + "]";
}

}
