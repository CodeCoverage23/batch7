package com.assignments;

public class Studentname {
	
	String getStudentName(String name) {
		
		return name;
		
	}
	
	public static void main(String[] args) {
		
		Studentname studentname = new Studentname();
		
		String s = studentname.getStudentName("Vaishnavi");
		
		System.out.println("Student name :" + s);
		
	}

}
