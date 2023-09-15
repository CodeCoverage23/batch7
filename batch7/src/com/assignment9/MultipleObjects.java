
//1.Write the Java program in which create the multiple objects and display the count of number of objects created into class.

package com.assignment9;

import java.util.Scanner;

class Student
{
	int age;
	String name;

	// Constructor to initilize instance variable of class Student
	public Student(int age, String name)
	{

		this.age = age;
		this.name = name;

	}

}

public class MultipleObjects {

	public static void main(String[] args) {

		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many data you want");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {

			System.out.println("Enter student age");
			int age = sc.nextInt();
			System.out.println("Enter student name");
			String name = sc.next();
			Student st = new Student(age, name);
			{
				// count variable in incremented when new object is created
				count++;
			}

		}

		System.out.println("No of object created into class are:" + count);

	}

}
