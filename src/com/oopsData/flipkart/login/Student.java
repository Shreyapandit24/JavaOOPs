package com.oopsData.flipkart.login;

public class Student extends Details{
private float per;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public float getPer() {
	return per;
}

public void setPer(float per) {
	this.per = per;
}

@Override
public String toString() {
	return "Student [per=" + per + "]";
}

}
