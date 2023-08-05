package com.pradeep.basic;

import java.util.Scanner;

public class Student {

	int rollNo;
	String name;
	String address;

//	static final String collegename="sipna";
	public Student(int rollNo, String name, String address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	public static void collegeName(String collegeName) {
		System.out.println("collegeName= " + collegeName);
	}

	public void display() {
		System.out.println("rollNo = " + rollNo + " name = " + name + " adrress = " + address);

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the college name : ");
		String collegename = sc.nextLine();
		collegeName(collegename);
		Student student1 = new Student(101, "sakshi", "nemani chowk,Badnera");
		Student student2 = new Student(102, "pratiksha", "rajapeth");
		Student student3 = new Student(103, "pratik", "rajkamal chowk");
		Student student4 = new Student(104, "akshay", "jaistambh chowk");
		Student student5 = new Student(105, "subhash", "gandhi chowk");
		student1.display();
		student2.display();
		student3.display();
		student4.display();
		student5.display();

	}

}

