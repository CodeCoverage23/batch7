//2.write a program  to check whether  year is leap year or not. (If else stmt).

package com.Assignment5.java;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String args[]) {

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a year: ");
		        
		        int year = scanner.nextInt();

		        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		        	
		            System.out.println(year + " is a leap year.");
		            
		        } else {
		            System.out.println(year + " is not a leap year.");
		        }

		      
		    }
       }