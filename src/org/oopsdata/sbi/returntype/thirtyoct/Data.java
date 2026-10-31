package org.oopsdata.sbi.returntype.thirtyoct;

public class Data {
    public void getData() {
    	System.out.println("Fetch all Data");
    }
    public void getData(int eid) {
    	System.out.println("Fetch all Data using eid");
    }
    public void getData(int eid, String name) {
    	System.out.println("Fetch all Data using eid  &  name");
    }
    public void getData(String email) {
    	System.out.println("Fetch all Data using email");
    }
    public void getData(String dept, int id) {
    	System.out.println("Fetch all Data using dept");
    }
}
