package com.oopsData.inheritancedemo;

public class NonTechnicalStaff extends Details {
    private String nontechString;

	public String getNontechString() {
		return nontechString;
	}

	public void setNontechString(String nontechString) {
		this.nontechString = nontechString;
	}

	public NonTechnicalStaff() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NonTechnicalStaff [nontechString=" + nontechString + "]";
	}
    
}
