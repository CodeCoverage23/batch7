package com.swapniltask;
//WAP to create a student object with name, rollNumber, address,and collegeName and 

//create a static method to change the value of a static variable then inside 
//the main method create 5 objects of class,
//Use parameterised constructor to assign the values of instance variables.

public class Dailytask3 {
	
	int rollNo;
	String name;
	String address;
	
	public Dailytask3(int rollNo ,String name,String address) {
	 this.rollNo = rollNo;
	this.name = name;
	this.address = address;
	
	} 
	public static void collegeName(String collegeName) {
		System.out.println("collegeName =" +collegeName);
		
	}
	
	public void display() {
		System.out.println("rollNol ="+rollNo+"name ="+name+" address =" +address);
		
	}

	public static void main(String[] args) {
		 
Dailytask3.collegeName("pote");
Dailytask3 student1 = new Dailytask3(201, "priya", "jaisthamb chowk, amravti");
		student1.display();
		Dailytask3 student2 = new Dailytask3(202, "priya", "sainager");
		Dailytask3 student3 = new Dailytask3(203, "shravni", "rajapeth");
		Dailytask3 student4 = new Dailytask3(204, "tina", "rajkamal");
		Dailytask3 student5 = new Dailytask3(205, "pooja", "gandhi");
		student2.display();
		student3.display();
		student4.display();
		student5.display();
}

}
