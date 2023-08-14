//2.write a program  to check whether  year is leap year or not. (If else stmt).

package com.Assignments.basic;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		int year;
		boolean leap;
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter a year.");
		year=a1.nextInt();
		
		if(year%4==0)
		{
			if (year%100==0)
			{
				if (year%400==0)
				{
					 leap= true;
					
				}else
					leap= false;
			}else
				leap=true;
		}else
			leap=false;
		
		
		if(leap)
				System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
			
		
	
			
		}

		
			


	

}
