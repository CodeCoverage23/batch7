////1.1 Design the Employee class which contain
//firstName, lastName, city and mobileNumber and  country.
//1.2 Design the class as EmployeeInformation which takes the input for multiple students from user and Design method public void getUserInput(), 
//country is same for all the students.
//1.3 Pass the input to getStudentInformation() method
//1.4 Print the multiple student information into getStudentInformation () method.

package com.assignment8;

import java.util.Scanner;

public class EmployeeInformation
{
	int num;//No of student data stored in num variable;

	public Employee[] em;//Array of Employee 
	String firstname, lastname, city;

	static String country;
	long mobilenumber;

	//getUserInput()method  for getting input from user
	public void getUserInput()
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many student data you want to get from user");
		num = sc.nextInt();
		em = new Employee[num];//No of Employee Objects Created
		for (int i = 0; i < em.length; i++) 
		{
			System.out.println("Enter student firstname");
			firstname = sc.next();
			System.out.println("Enter student Lastname");
			lastname = sc.next();
			System.out.println("Enter student city");
			city = sc.next();
			System.out.println("Enter student mobilenumber");
			mobilenumber = sc.nextLong();
			em[i] = new Employee(firstname, lastname, city, mobilenumber);
		}
		System.out.println("Enter student Country");
		country = sc.next();
		new Employee(country);
	

	}
    //Printing the multiple student information into getStudentInformation () method.
	public void getStudentInformation() 
	{

		//Passing the input to getStudentInformation() method
		getUserInput();

		for (int i = 0; i < em.length; i++) {

			System.out.println(em[i]);
		}

	}

	public static void main(String[] args) {
		EmployeeInformation e = new EmployeeInformation();
		e.getStudentInformation();

	}

}
