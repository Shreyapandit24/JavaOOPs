package com.oopsData.finalkeyword;

public class DBConnection {
//class level final keyword assign value first
	final int x=10;
	
	void display() {
		//in method we can only declare the var by using final and after u can initialize
		final int y;
		y=200;
		System.out.println(y);
	}
	public static void main(String[] args) {
		DBConnection dbConnection=new DBConnection();
		final int z;
		z=50;
		// and only once we can assign it
		//z=40;
		System.out.println(dbConnection.x);
		dbConnection.display();
		System.out.println(z);
		
	}
}
