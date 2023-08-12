package Dailytask;

import java.util.Scanner;

//WAP to create a student object with name, rollNumber, address, and collegeName and create a static method 
//to change the value of a static variable then inside the main method create 5 objects of class, Use parameterised constructor to assign the values of instance variables.


public class task3 {
	int name;
	String rollnumber;
	String address;
	
	//static final string collegeName="KGIT"
	public  task3(int name,String rollnumber,String address) {
	this.name=name;
	this.rollnumber= rollnumber;
	this.address= address;
	}
	public static void collegeNmane(String collegeName) {
	System.out.println("collegeName=" + collegeName);	
	}
	public void student() {
		System.out.println("name =" + name + "rollnumber = " + rollnumber + "address = " +  address );
	}
	public static void main(String[] arge) {
		System.out.println("enter the collegeName: ");
		Scanner sc=new Scanner(System.in);
		String collegeName=sc.nextLine();
		
		task3 student1=new task3(1,"shreyash"," warud");
		task3 student2=new task3(2,"pradeep","amravti");
		task3 student3=new task3(3,"swapnil","kolkata");
		task3 student4=new task3(4,"mansi","delhi");
		task3 student5=new task3(5,"prajkta","dariyapur");
	
		student1.student();
		student2.student();
		student3.student();
		student4.student();
		student5.student();
		
		
	}

}
