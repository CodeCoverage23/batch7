/*Assignment 5.2 Write a program to check whether the year is leap 
year or not*/

package com.assignments;
import java.util.Scanner;
public class Leapyear {
	
	public static void main(String[] args) {
		
		int year;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a year");
		year = sc.nextInt();
        
        if(year % 100 == 0 && year % 400 == 0 || 
        	    
        		year % 100 !=0 && year % 4 == 0)
        {
        	System.out.println("The year is leap year");
        }
        else
        {
        	System.out.println("The year is not a leap year");
        }   	
        
	}

}
