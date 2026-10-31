package com.oopsData.irctc.login;

import java.util.Locale.Category;

public class Product {
    private int pid;
    private String pname;
    private float price;
    private Category category;
	public Product() {
		super();
		
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
    
    
    
}
