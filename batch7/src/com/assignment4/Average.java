//5. Write the Java Program to calculate total of five subject marks and average of it.

package com.assignment4;

public class Average {
	
	

	public static void main(String[] args)
	{
		int subject1=65;
		int subject2=60;
		int subject3=64;
		int subject4=62;
		int subject5=61;
		int total_marks=0;
		total_marks=subject1+subject2+subject3+subject4+subject5;
		System.out.println("Total marks of five subjects is:"+total_marks);
		double average=total_marks/5;
		System.out.println("Average is:"+average);
		
	}

}
