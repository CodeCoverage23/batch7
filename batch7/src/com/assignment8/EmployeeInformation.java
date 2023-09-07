//1.1 Design the Employee class which contain
//firstName, lastName, city and mobileNumber and  country.
//1.2 Design the class as EmployeeInformation which takes the input for multiple students from user and Design method public void getUserInput(), 
//country is same for all the students.
//1.3 Pass the input to getStudentInformation() method
//1.4 Print the multiple student information into getStudentInformation () method.

package com.assignment8;

import java.util.Scanner;

public class EmployeeInformation
{
	
	
	static String country;

	String firstname;
	String lastname, city;
	long mobilenumber;

	int num;

	public void getUserInput()
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many student data you want to get from user");
		num = sc.nextInt();
		for (int i = 0; i < num; i++)
		{
			System.out.println("Enter student firstname");
			firstname = sc.next();
			System.out.println("Enter student Lastname");
			lastname = sc.next();
			System.out.println("Enter student city");
			city = sc.next();
			System.out.println("Enter student mobilenumber");
			mobilenumber = sc.nextLong();

		}
		System.out.println("Enter student country");
		country = sc.next();

	}

	public void getStudentInformation()
	{

		getUserInput();

		for (int i = 1; i <=num; i++)
		{
			System.out.println("<----Student"+i+"---->");
			System.out.println("student name:" + firstname);
			System.out.println("student Lastname:" + lastname);
			System.out.println("student city:" + city);
			System.out.println("student mobilnumber:" + mobilenumber);
			System.out.println("student country:" + country);
		}

	}

	public static void main(String[] args) {

		EmployeeInformation em = new EmployeeInformation();
		em.getStudentInformation();

	}

}
