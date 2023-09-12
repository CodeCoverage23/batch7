package com.task;

import java.util.Scanner;

public class StudentDemo 
{

	String name;

	static int rollNumber=0;
    String  address;
	static String clgname;
	
	public StudentDemo(String name1, String address1) 
	{
		
		name = name1;
		address = address1;
		rollNumber++;
		
		
	}

	public static void changeValue()
	{
		
		
		clgname="IIT";
		
		
		
	}
	public  void display()
	{
		
		
		System.out.println("Student name:"+name);
		System.out.println("Student rollnumber:"+rollNumber);
		System.out.println("Student address:"+address);
		System.out.println("college name:"+clgname);
		
	}

	public static void main(String[] args) 
	{
		changeValue();
		Scanner sc=new Scanner(System.in);
		String nm=sc.next();
		String addr=sc.next();
		StudentDemo s1=new StudentDemo(nm,addr);
		s1.display();
		
		
		StudentDemo s2=new StudentDemo("john1","Mumbai");
		s2.display();
		
		StudentDemo s3=new StudentDemo("john3","pune");
		s3.display();
	
		StudentDemo s4=new StudentDemo("john6","pune");
		s4.display();
		
		StudentDemo s5=new StudentDemo("john78","Nashik");
		s5.display();
		
		
	}


}
