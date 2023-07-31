package com.Task;

/*WAP to create a student object with name , rollNumber, address and collegeName and 
 * create a static method to change the value of a static variable then inside the main method create and
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
		// using parameterized constructor to assign the value of instance variable
		TaskStaticMethod s = new TaskStaticMethod("pratiksha", 7, "amravati");

		System.out.println("Name 		: " + s.name);
		System.out.println("Roll Number 	: " + s.rollNumber);
		System.out.println("Address 	: " + s.address);

		System.out.println("College Name 	: " + ChangeCollege("sipna"));

	}

}
