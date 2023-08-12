package com.assignment5;

import java.util.Scanner;

public class Assignment5Q2 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter a year");
		int year = Sc.nextInt();
		
		if((year%400==0)  || (year%4==0) &&  (year%100!=0))
		{
			System.out.println("is a leap year :" +year);
		}
		else
		{
			System.out.println("is not a leap year :" +year );
		}
	}

}
