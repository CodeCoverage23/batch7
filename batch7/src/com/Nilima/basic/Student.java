package com.Nilima.basic;

public class Student {
	
	private static final Student Student2 = null;
	int rollno;
	String name;
	String address;
	
	public Student(int i, String string) {
		// TODO Auto-generated constructor stub
	}


	public void student (int rollno,String Name,String address) {
		
		this.rollno=rollno;
		this.name=name;
		this.address=address;
	}

	
	public static void collegName(String collegeName) {
		
		System.out.println("collegeName="+collegeName);
		
	}
	
	public void display () {
		System.out.println("rollno="+"name"+name+"address="+address);
	}
	
	public static void main(String[] args) {
		
		Student.collegName("sipna");
		Student student1=new Student(101," sakshi , nemani chowk, Badnera");
		Student student2=new Student(102," priya , rajapeth, amravati");
		Student student3=new Student(103," pratik , nemani rajkamal, Badnera");
		
	Student2.display();


		
	}
}
