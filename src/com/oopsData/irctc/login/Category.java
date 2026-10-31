package com.oopsData.irctc.login;

public class Category {
 private int cid;
 private String cName;
 private String cDesc;
 public Category() {
	super();
 }
 public int getCid() {
	return cid;
 }
 public void setCid(int cid) {
	this.cid = cid;
 }
 public String getcName() {
	return cName;
 }
 public void setcName(String cName) {
	this.cName = cName;
 }
 public String getcDesc() {
	return cDesc;
 }
 public void setcDesc(String cDesc) {
	this.cDesc = cDesc;
 }
 @Override
 public String toString() {
	return "Category [cid=" + cid + ", cName=" + cName + ", cDesc=" + cDesc + "]";
 }
 
 
}
