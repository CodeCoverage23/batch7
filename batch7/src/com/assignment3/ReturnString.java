////1. Design the separate method as String getStudentName (String name) which return student name and print it.
package com.assignment3;

public class ReturnString 
{
	public String getStudentName(String name)
	{
		return name;
	}
	public static void main(String[] args) 
	{
	
		ReturnString r=new ReturnString();
		System.out.println("Student Name:"+r.getStudentName("Rabiya Shaikh"));
		
		
      
	}
	
}
