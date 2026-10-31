package org.oopsdata.sppu.home;

import java.util.Scanner;

public abstract class Details implements AdminDetails,DevDetails{

	Scanner scanner=new Scanner(System.in);
	Address add1=new Address();
	Admin a1=new Admin();
	Developer d1=new Developer();
	
	
	abstract void getDevDetails();
	abstract void getTesterDetails();

//	public Address createAddress() {
//		System.out.println("Enter Address details : ");
//		System.out.println("Enter flat no : ");
//		add1.setFlatno(scanner.nextInt());
//		System.out.println("Enter area : ");
//		add1.setArea(scanner.next());
//		System.out.println("Enter taluka : ");
//		add1.setTaluka(scanner.next());
//		System.out.println("Enter District : ");
//		add1.setDistrict(scanner.next());
//		System.out.println("Enter State : ");
//		add1.setState(scanner.next());
//		System.out.println("Enter PINCODE : ");
//		add1.setPincode(scanner.nextInt());
//		
//		return add1;
//	}


	public void setAdminDetails() {
		System.out.println("Enter admin Details : ");
		System.out.println("Enter admin id : ");
		int id=scanner.nextInt();
		System.out.println("Enter admin name : ");
		String name=scanner.next();
		System.out.println("Enter admin salary : ");
		float salary=scanner.nextFloat();
		System.out.println("Enter admin privildges : ");
		String privildges=scanner.next();

		System.out.println("Enter Admin Address details : ");
		System.out.println("Enter flat no : ");
		int flatno = scanner.nextInt();
		System.out.println("Enter area : ");
		String area=scanner.next();
		System.out.println("Enter taluka : ");
		String taluka=scanner.next();
		System.out.println("Enter District : ");
		String district = scanner.next();
		System.out.println("Enter State : ");
		String state=scanner.next();
		System.out.println("Enter PINCODE : ");
		int pincode=scanner.nextInt();
		
		add1.setFlatno(flatno);
		add1.setArea(area);
		add1.setTaluka(taluka);
		add1.setDistrict(district);
		add1.setState(state);
		add1.setPincode(pincode);
		
		a1.setAdminId(id);
		a1.setAdname(name);
		a1.setSalary(salary);
		a1.setPrivilege(privildges);
		a1.setAddress(add1);
		//a1.setAddress(createAddress());

	}
	
	public void getAdminDetails(){
		System.out.println("\n Admin Details : ");
		System.out.println("Admin id : "+a1.getAdminId());
		System.out.println("Admin name : "+a1.getAdname());
		System.out.println("Admin salary : "+a1.getSalary());
		System.out.println("Admin Privildges : "+a1.getAddress());
		System.out.println("Admin Address Details : ");
		System.out.println("Flat no : "+add1.getFlatno());
		System.out.println("Area : "+add1.getArea());
		System.out.println("Taluka : "+add1.getTaluka());
		System.out.println("District : "+add1.getDistrict());
		System.out.println("State : "+add1.getState());
		System.out.println("Pincode : "+add1.getPincode()+"\n");

	}
	
	public void setDevDetails() {
		System.out.println("Enter Developer Details : ");
		System.out.println("Enter developer id : ");
		int id=scanner.nextInt();
		System.out.println("Enter developer name : ");
		String name=scanner.next();
		System.out.println("Enter developer salary : ");
		float salary=scanner.nextFloat();
		System.out.println("Enter dept : ");
		String dept=scanner.next();

		System.out.println("Enter Address details : ");
		System.out.println("Enter flat no : ");
		int flatno = scanner.nextInt();
		System.out.println("Enter area : ");
		String area=scanner.next();
		System.out.println("Enter taluka : ");
		String taluka=scanner.next();
		System.out.println("Enter District : ");
		String district = scanner.next();
		System.out.println("Enter State : ");
		String state=scanner.next();
		System.out.println("Enter PINCODE : ");
		int pincode=scanner.nextInt();

		add1.setFlatno(flatno);
		add1.setArea(area);
		add1.setTaluka(taluka);
		add1.setDistrict(district);
		add1.setState(state);
		add1.setPincode(pincode);
		
		d1.setDevId(id);
		d1.setDevName(name);
		d1.setDevSalary(salary);
		d1.setDevDept(dept);
		d1.setAddress(add1);
		//d1.setAddress(createAddress());

	}


}
