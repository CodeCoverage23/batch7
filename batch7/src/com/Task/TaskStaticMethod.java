package com.Task;

/*WAP to create a student object with name , rollNumber, address and collegeName and 
 * create a static method to change the value of a static variable then inside the main method create 5
 * object of class , use parameterized constructor to assign the value of instance variables
 */
public class TaskStaticMethod {

	String name;
	int rollNumber;
	String address;
	static String collegeName = "IIT";

	public TaskStaticMethod(String name, int rollNumber, String address) {

		this.name = name;
		this.rollNumber = rollNumber;
		this.address = address;

	}

	// static method to change the value of a static variable
	public static String ChangeCollege(String college) {

		collegeName = college;
		return collegeName;

	}

	public static void main(String[] args) {
		// creating 5 object of class using parameterized constructor to assign the value of instance variable
		TaskStaticMethod student = new TaskStaticMethod("pratiksha", 7, "amravati");
		TaskStaticMethod s1 = new TaskStaticMethod("jiyaa", 8, "amravati");
		TaskStaticMethod s2 = new TaskStaticMethod("khushi", 9, "amravati");
		TaskStaticMethod s3 = new TaskStaticMethod("abhishek", 10, "amravati");
		TaskStaticMethod s4 = new TaskStaticMethod("krishna", 11, "amravati");
		

		System.out.println("student 1  ");

		System.out.println("Name 		: " + student.name);
		System.out.println("Roll Number 	: " + student.rollNumber);
		System.out.println("Address 	: " + student.address);
		
		System.out.println();

		System.out.println("student 2  ");

		System.out.println("Name 		: " + s1.name);
		System.out.println("Roll Number 	: " + s1.rollNumber);
		System.out.println("Address 	: " + s1.address);
		
		System.out.println();
		
		System.out.println("student 3  ");
		

		System.out.println("Name 		: " + s2.name);
		System.out.println("Roll Number 	: " + s2.rollNumber);
		System.out.println("Address 	: " + s2.address);
		
		System.out.println();
		
		System.out.println("student 4  ");

		System.out.println("Name 		: " + s3.name);
		System.out.println("Roll Number 	: " + s3.rollNumber);
		System.out.println("Address 	: " + s3.address);
		
		System.out.println();
		
		System.out.println("student 5  ");
		

		System.out.println("Name 		: " + s4.name);
		System.out.println("Roll Number 	: " + s4.rollNumber);
		System.out.println("Address 	: " + s4.address);
		
		System.out.println();
		
		
		System.out.println("College Name 	: " + ChangeCollege("sipna"));

	}

}
