package com.oopsData.inheritancedemo;

public class AdminStaff extends Details{
     private String adminId;

	 public String getAdminId() {
		 return adminId;
	 }

	 public void setAdminId(String adminId) {
		 this.adminId = adminId;
	 }

	 public AdminStaff() {
		super();
		// TODO Auto-generated constructor stub
	 }

	 @Override
	 public String toString() {
		return "AdminStaff [adminId=" + adminId + "]";
	 }
     
}
