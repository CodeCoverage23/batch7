package com.assignment8;

public class Employee
{
    //Variables declaration
	String firstname, lastname, city;
	static String country;
     
	long mobilenumber;
	
	//Constructor1
	public Employee(String firstname, String lastname, String city, long mobilenumber)
	{
	
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.mobilenumber=mobilenumber;
		
	
	
	}
	//constructor 2 for static variable  country
	public Employee(String country) 
	{
		this.country= country;
	}
	@Override
	//Displaying output
	public String toString()
	{


	   
		return  "student name:"+firstname +"\n"+"student Lastname:"+lastname+"\n"+"student city:"+city+"\n"+"student mobilnumber:"+mobilenumber+"\n"+"Student Country:"+country; 
     }
}
