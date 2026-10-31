package com.oopsData.example.login;

import java.util.Scanner;

public class GrandChildService extends GrandChild {
    Scanner scanner = new Scanner(System.in);

    public void setData() {
        // Parent fields
        System.out.println("Enter ID : ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.println("Enter Name : ");
        String name = scanner.nextLine();

        // Child fields
        System.out.println("Enter City : ");
        String city = scanner.next();
        System.out.println("Enter Dept : ");
        String dept = scanner.next();

        // Grandchild fields
        System.out.println("Enter Designation : ");
        String designation = scanner.next();
        System.out.println("Enter Salary : ");
        float salary =  scanner.nextFloat();

        // Set all using inherited setters
        this.setId(id);
        this.setName(name);
        this.setCity(city);
        this.setDept(dept);
        this.setDesignation(designation);
        this.setSalary(salary);
    }

    public void getData() {
        System.out.println("\n--- Grandchild (Employee) Details ---");
        System.out.println("ID          : " + this.getId());
        System.out.println("Name        : " + this.getName());
        System.out.println("City        : " + this.getCity());
        System.out.println("Department  : " + this.getDept());
        System.out.println("Designation : " + this.getDesignation());
        System.out.println("Salary      : " + this.getSalary());
    }
}