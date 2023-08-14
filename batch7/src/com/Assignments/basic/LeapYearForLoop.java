package com.Assignments.basic;

import java.util.Scanner;

public class LeapYearForLoop {

	public static void main(String[] args) {
		  int year;
          // boolean  ;
	
	Scanner a1=new Scanner(System.in);
	System.out.println("Enter a year.");
	year=a1.nextInt();
	
	if ((year%4==0) && (year%100!=0) ||( year%400==0))
	
			System.out.println(year + " is a leap year.");
	else
		System.out.println(year + " is not a leap year.");
		

	}

}
