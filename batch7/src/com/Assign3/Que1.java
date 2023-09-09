package com.Assign3;
// Design the separate method as string getStudentName(String name) which return student name and print it.

public class Que1 {
	public String getStudentName(String name) {
		
		return name;
	}

public static void main(String[] args) {
	Que1 s=new Que1();  // object creation
	
	String a=s.getStudentName("Nilima");
	//creating local variable for one more string
	
	String b=s.getStudentName("Prajakta");
	System.out.println(a);
	System.out.println(b);

}



}











