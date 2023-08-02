package com.task;

import java.util.Scanner;

public class ReadLineMethod 
{


	String name;

	static int rollNumber=0;
    String  address;
	static String clgname;
	
	public ReadLineMethod(String name1, String address1) 
	{
		
		name = name1;
		address = address1;
		rollNumber++;
		
	}

	public static void changeValue()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter college name:");
		clgname=sc.nextLine();
	
		
		
		
		
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
		ReadLineMethod s1=new ReadLineMethod("john","pune");
		s1.display();
		
		
		ReadLineMethod s2=new ReadLineMethod("john1","Mumbai");
		s2.display();
		
		ReadLineMethod s3=new ReadLineMethod("john3","pune");
		s3.display();
	
		ReadLineMethod s4=new ReadLineMethod("john6","pune");
		s4.display();
		
		ReadLineMethod s5=new ReadLineMethod("john78","Nashik");
		s5.display();
		
		
	}

	
}
