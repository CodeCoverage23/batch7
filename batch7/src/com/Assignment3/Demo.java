package com.Assignment3;
//Design seperate method as string getstudent name (string name) which return student name to that method and print  it.

public class Demo {
//method with argument
	String getStudentName(String name) {
		return name;
	}
	public static void main(String[] args) {
		Demo demo =new Demo(); //object of the class
		
		String s = demo.getStudentName("Riya"); //call the method
		
		System.out.println("Student name is" + s); //printing the student name
	}
	
}
