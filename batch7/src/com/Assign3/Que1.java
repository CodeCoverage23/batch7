package com.Assign3;
//Design the separate method as String getStudentName (String name) which return student name and print it.
public class Que1 {
	
	
	public String getStudentName(String name) {
		
		return name;
		
	}

	public static void main(String[] args) {
		
		Que1 s =new Que1();    //object creation
		
		String a=s.getStudentName("Pratiksha");
		
		//creating local variable for one more string
		
		String b=s.getStudentName("Jiyaa");
		
		System.out.println(a);
		
		System.out.println(b);
		

	}

}
