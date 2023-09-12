package com.StringMethods;

public class StringMethodsDemo {

	public static void main(String[] args) 
	{
		String name="  ";
		/*
		 * int len=name.length(); if(len==0) {
		 * System.out.println("name string is empty:"); } else {
		 * System.out.println("name string is not empty:"); }
		 */
//		if(name.isEmpty())
//		{
//			  System.out.println("name string is empty:");
//	    } else
//	    {
//			 System.out.println("name string is not empty:");
//	    }
//		if(name.trim().length()==0)
//		{
//			  System.out.println("name string is empty:");
//	    } else
//	    {
//			 System.out.println("name string is not empty:");
//	    }
	
	if(name.trim().isEmpty())
	{
		  System.out.println("name string is empty:");
    } else
    {
		 System.out.println("name string is not empty:");
    }
	}


}

