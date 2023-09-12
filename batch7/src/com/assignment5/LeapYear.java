//2.write a program  to check whether  year is leap year or not. (If else stmt).

package com.assignment5;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year:");
		int year=sc.nextInt();
		if((year%400==0) || (year%4==0) && (year%100!=0))
		//if((year%400==0) && (year%4==0) &&(year%100!=0))
         
		{
			System.out.println(year+" is a leap year");
		}
		else
		{
			System.out.println(year+" is not  a leap year");
		}
	
	}

}
