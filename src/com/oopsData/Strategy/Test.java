package com.oopsData.Strategy;
import java.util.Scanner;
//scanner class with switch case
public class Test {
	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		Address address = new Address();
		System.out.println("Select Role: \n1. Employee \n2. Admin \n3. Exit");
        int key = scanner.nextInt();
        
		switch (key) {
		case 1: {
			Employee e1=new Employee();
			System.out.println("Enter employee id:");
	        e1.setId(scanner.nextInt());
	        System.out.println("Enter Name:");
	        e1.setName(scanner.next());
	       
            System.out.println("Enter flat no: ");
	        address.setFlatno(scanner.nextInt());
	        System.out.println("Enter city:");
	        address.setCity(scanner.next());
	        System.out.println("Enter district : ");
	        address.setDistrict(scanner.next());
	        System.out.println("Enter taluka :");
	        address.setTaluka(scanner.next());
	        System.out.println("Enter PINCODE : ");
	        address.setPincode(scanner.nextInt());
	        System.out.println("Enter area :");
	        address.setArea(scanner.next());
	        
	        e1.setAddress(address);
            System.out.println("\nSuccessfully Created Employee: ");
            break; 

		}
		case 2: {
			Admin ad1=new Admin();
			ad1.setId(scanner.nextInt());
			ad1.setName(scanner.next());
			
			
			System.out.println("Enter flat no: ");
	        address.setFlatno(scanner.nextInt());
	        System.out.println("Enter city:");
	        address.setCity(scanner.next());
	        System.out.println("Enter district : ");
	        address.setDistrict(scanner.next());
	        System.out.println("Enter taluka :");
	        address.setTaluka(scanner.next());
	        System.out.println("Enter PINCODE : ");
	        address.setPincode(scanner.nextInt());
	        System.out.println("Enter area :");
	        address.setArea(scanner.next());
	        
	        ad1.setAddress(address);
            System.out.println("\nSuccessfully Created Employee: ");
            break; 
			

		}
		case 3:
            System.out.println("Exiting...");
            break;

		default:
			 throw new IllegalArgumentException("Unexpected value: " + key);
		}

		scanner.close();
	}

}
