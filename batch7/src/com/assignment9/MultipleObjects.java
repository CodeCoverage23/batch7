
//1.Write the Java program in which create the multiple objects and display the count of number of objects created into class.

package com.assignment9;

import java.util.Scanner;
class Student
{
	int age;
	String name;
	static int count;
	//Constructor to initilize instance variable of class Student
	public Student(int age, String name) 
	{
		
		this.age = age;
		this.name = name;
		//count variable incrementing when constructor is called .means obejct are created.
		count++;
	}
	//To print the values of Student class
	void display()
	{
		
		System.out.println("Student age:"+age+"\nStudent name:"+name);
    }
	
	
}
public class MultipleObjects
{

	public static void main(String[] args)
	{
		//Creating s1 object of student class:object1
		Student s1=new Student(23,"abc");
		//Creating s2 object of student class:object2
		Student s2=new Student(24,"xyz");
		//Creating s3 object of student class:object3
		Student s3=new Student(26,"pqr");
		//Creating s4 object of student class:object4
		Student s4=new Student(28,"lmo");
		//Creating s5 object of student class:object5
		Student s5=new Student(29,"def");
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		//Printing the no of object creted using count varaible
		System.out.println("No of object created into class are:"+Student.count);
		
		
		//Program-2 Accepting data from user
		
//	Student[] st=new Student[2];
//	int count=0;
//	for(int i=0;i<2;i++)
//		{
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter student age");
//			int age=sc.nextInt();
//			System.out.println("Enter student name");
//		String name=sc.next();
//		st[i]=new Student(age,name);
//		{
//		       //count variable in incremented when new object is created
//				count++;
//			}
//		
//		}
//		
//		System.out.println("No of object created into class are:"+count);
		

		
	}

}
