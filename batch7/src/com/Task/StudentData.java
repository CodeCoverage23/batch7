package com.Task;

import java.util.Scanner;

public class StudentData {
	int rollno;
	String address;
	String name;
	public StudentData(int rollno,String address, String name) {
		this.rollno=rollno;
		this.address=address;
		this.name=name;
		}
	public static void collegename( String collegename) {
		System.out.println("collegename"+collegename);
	}
	public void display() {
		System.out.println("rollno="+rollno+"address="+address+"name="+name);
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner("String.in") ;
		System.out.println("Enter the college name:");
		String name=sc.nextLine();
		StudentData.collegename(":shri shivaji college");
			
		StudentData student1=new StudentData(32,"amravati","Akash");
		StudentData student2=new StudentData(33,"Darapur","Akshay");
		StudentData student3=new StudentData(34,"akola","Anuj");
		StudentData student4=new StudentData(35,"Buldhana","Anup");
		StudentData student5=new StudentData(36,"Auragabad","Adesh");
		student1.display();
		student2.display();
		student3.display();
		student4.display();
		student5.display();
	}
}


