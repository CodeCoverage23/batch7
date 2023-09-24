package com.Assignment8;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeInformation {
	class Employee {
	    String firstName;
	   String lastName;
	    String city;
	    String mobileNumber;
	    String country;

	    public Employee(String firstName, String lastName, String city, String mobileNumber, String country) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.city = city;
	        this.mobileNumber = mobileNumber;
	        this.country = country;
	    }
	}

	    public ArrayList<Employee> employees = new ArrayList<>();
	    public void getUserInput() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of all student: ");
	        int numEmployees = scanner.nextInt();
	        scanner.nextLine(); 

	        System.out.print("Enter country for all student: ");
	        String country = scanner.nextLine();
	       

	        for (int i = 0; i < numEmployees; i++) {
	            System.out.println("Enter details for student " + (i + 1) + ":");
	            System.out.print("First Name: ");
	            String firstName = scanner.nextLine();
	            System.out.print("Last Name: ");
	            String lastName = scanner.nextLine();
	            System.out.print("City: ");
	            String city = scanner.nextLine();
	            System.out.print("Mobile Number: ");
	            String mobileNumber = scanner.nextLine();

	            Employee employee = new Employee(firstName, lastName, city, mobileNumber, country);
	            employees.add(employee);
	        }
	    }

	    public void getStudentInformation() {
	        System.out.println("student Information:");
	        for (Employee employee : employees) {
	            System.out.println("First Name: " + employee.firstName);
	            System.out.println("Last Name: " + employee.lastName);
	            System.out.println("City: " + employee.city);
	            System.out.println("Mobile Number: " + employee.mobileNumber);
	            System.out.println("Country: " + employee.country);
	            System.out.println();
	        }
	    }
	
	    public static void main(String[] args) {
	        EmployeeInformation employeeInfo = new EmployeeInformation();
	        employeeInfo.getUserInput();
	        employeeInfo.getStudentInformation();
	    }
	}











