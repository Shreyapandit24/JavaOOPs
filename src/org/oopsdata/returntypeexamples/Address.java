package org.oopsdata.returntypeexamples;

public class Address {
    private int flatno;
    private String area;
    private String taluka;
    private String district;
    private String state;
    private int pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int flatno, String area, String taluka, String district, String state, int pincode) {
		super();
		this.flatno = flatno;
		this.area = area;
		this.taluka = taluka;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}
	public int getFlatno() {
		return flatno;
	}
	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getTaluka() {
		return taluka;
	}
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", area=" + area + ", taluka=" + taluka + ", district=" + district
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}
    
    
}
