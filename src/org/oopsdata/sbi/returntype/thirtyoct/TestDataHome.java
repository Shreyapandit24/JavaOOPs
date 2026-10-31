package org.oopsdata.sbi.returntype.thirtyoct;

public class TestDataHome {
	public void getData() {
    	System.out.println("Fetch all Data");
    }
    public void getData(int x) {
    	System.out.println("Integer");
    }
    public void getData(int x, String y) {
    	System.out.println("Integer and String");
    }
    public void getData(String x) {
    	System.out.println("String");
    }
    public void getData(String x, int y) {
    	System.out.println("String and int");
    }
}
