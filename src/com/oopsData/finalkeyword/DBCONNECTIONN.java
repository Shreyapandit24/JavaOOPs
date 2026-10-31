package com.oopsData.finalkeyword;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class DBCONNECTIONN {

   
   public static void dbconn() throws IOException {
	   final  String url;
	   final  String username;
	   final  String password;
	   
	   File f1=new File("C:\\Users\\pandi\\eclipse-workspace\\oopsData\\src\\com\\oopsData\\finalkeyword\\db.properties");
	   FileInputStream f2=new FileInputStream(f1);
	   
	   Properties p1=new Properties();
	   p1.load(f2);
	   
	   url=p1.getProperty("url");
	   password=p1.getProperty("password");
	   username=p1.getProperty("username");
	   
	   System.out.println(url);
	   System.out.println(password);
	   System.out.println(username);
	   
   }
   
   public static void main(String[] args) throws IOException {
	DBCONNECTIONN.dbconn();
}
   
   
}
