package com.assignment8;

public class Employee
{

	String firstname, lastname, city;
	static String country;
     
	long mobilenumber;
	
	
	public Employee(String firstname, String lastname, String city, long mobilenumber)
	{
	
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.mobilenumber=mobilenumber;
		
	
	
	}
	public Employee(String country) 
	{
		this.country= country;
	}
	@Override
	public String toString()
	{


	   
		return  "student name:"+firstname +"\n"+"student Lastname:"+lastname+"\n"+"student city:"+city+"\n"+"student mobilnumber:"+mobilenumber+"\n"+"Student Country:"+country; 
     }
}
