package com.task;

public class Student 
{
	String name;
//	int rollNumber;
	static int rollNumber=0;
    String  address;
	static String clgname="ABC";
	/*
	Student()
	{
		rollNumber++;
		System.out.println("student RollNumber:"rollNumber);
	}
	*/
	public Student(String name1, String address1) 
	{
		
		name = name1;
		//this.rollNumber = rollNumber;
		address = address1;
		rollNumber++;
		
	}

	public static void changeValue()
	{
		
		
		clgname="IIT";
		//System.out.println("college name:"+clgname);
		
		
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
		Student s1=new Student("john","pune");
		s1.display();
		//String nm=changeValue("IIT");
		//System.out.println("college name:"+nm);
		
		Student s2=new Student("john1","Mumbai");
		s2.display();
		//String nm1=changeValue("WIT");
		//System.out.println("college name:"+nm1);
		Student s3=new Student("john3","pune");
		s3.display();
	//	String nm2=changeValue("BMIT");
		//System.out.println("college name:"+nm2);
		Student s4=new Student("john6","pune");
		s4.display();
		//String nm3=changeValue("XXX");
		//System.out.println("college name:"+nm3);
		Student s5=new Student("john78","Nashik");
		s5.display();
		//String nm4=changeValue("ABC");
		//System.out.println("college name:"+nm4);
		
		
	}

}
