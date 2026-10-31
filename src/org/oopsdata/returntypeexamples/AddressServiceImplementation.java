package org.oopsdata.returntypeexamples;

import java.util.Scanner;

public class AddressServiceImplementation implements AddressInterface{
   private Address address=new Address();
   Scanner sc = new Scanner(System.in);
   
   public Address setAddress() {
	   System.out.println("Enter Flat no : ");
	   int flatno=sc.nextInt();
	   System.out.println("Enter Area : ");
	   String area=sc.next();
	   System.out.println("Enter taluka : ");
	   String taluka=sc.next();
	   System.out.println("Enter district : ");
	   String district=sc.next();
	   System.out.println("Enter State : ");
	   String  state=sc.next();
	   System.out.println("Enter pincode : ");
	   int pincode=sc.nextInt();
	   
	   address.setFlatno(flatno);
	   address.setArea(area);
	   address.setTaluka(taluka);
	   address.setDistrict(district);
	   address.setState(state);
	   address.setPincode(pincode);
	   
	   return address;
   }
   
   public Address getAddress() {
	   
	   return address;
   }
}
