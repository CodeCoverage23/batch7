package com.assignment3;
// Design the separate method as String getStudentName (String name) which return student name and print it.

public class Question1 {
 public String getStudentName (String name) {
	 return name;
 
 }

	public static void main(String[] args) {
		Question1 a = new Question1();
		String s =a.getStudentName("Swati");
		
		System.out.println(s);
		

	}

}
