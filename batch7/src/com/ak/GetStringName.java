package com.ak;

public class GetStringName {
	String GetStudentName(String name) //method with argument 
	{
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetStringName getStringName = new GetStringName(); //object of the class
		String s=getStringName.GetStudentName ("Aakanksha");//call the method
		System.out.println("Student Name is" +  s);//printing the student name
		
		//assignment 3
	}

}
