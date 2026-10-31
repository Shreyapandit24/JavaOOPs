package org.oopsdata.sppu.home;

public class Service extends Details implements TesterDetails {
   
	Tester t1=new Tester();
	
	
   public void getDevDetails() {
	   System.out.println("Developer Details : ");
	   System.out.println("Developer id : "+d1.getDevId());
	   System.out.println("Developer name : "+d1.getDevName());
	   System.out.println("Developer Dept : "+d1.getDevDept());
	   System.out.println("Developer Salary : "+d1.getDevSalary());
	   System.out.println("Developer Address Details : ");
	   System.out.println("Flat no : "+add1.getFlatno());
	   System.out.println("Area : "+add1.getArea());
	   System.out.println("Taluka : "+add1.getTaluka());
	   System.out.println("District : "+add1.getDistrict());
	   System.out.println("State : "+add1.getState());
	   System.out.println("Pincode : "+add1.getPincode()+"\n");
   }
	public void setTesterDetails() {
		System.out.println("Enter Tester Details : ");
		System.out.println("Enter Tester id : ");
		int id=scanner.nextInt();
		System.out.println("Enter Tester name : ");
		String name=scanner.next();
		System.out.println("Enter Tester salary : ");
		float salary=scanner.nextFloat();
		System.out.println("Enter Tester dept : ");
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
		
		t1.setTesterId(id);
		t1.setTesterName(name);
		t1.setTesterDept(dept);
		t1.setTesterSalary(salary);
		t1.setAddress(add1);
		//t1.setAddress(createAddress());
   }
	
   public void getTesterDetails() {
	   System.out.println("Tester Details : ");
	   System.out.println("Tester id : "+t1.getTesterId());
	   System.out.println("Tester name : "+t1.getTesterName());
	   System.out.println("Tester Dept : "+t1.getTesterDept());
	   System.out.println("Tester Salary : "+t1.getTesterSalary());
	   System.out.println("Tester Address Details : ");
	   System.out.println("Flat no : "+add1.getFlatno());
	   System.out.println("Area : "+add1.getArea());
	   System.out.println("Taluka : "+add1.getTaluka());
	   System.out.println("District : "+add1.getDistrict());
	   System.out.println("State : "+add1.getState());
	   System.out.println("Pincode : "+add1.getPincode());
   }
   
	
	
	
	
}
