package com.Assign5;
//write a program  to check whether  year is leap year or not.
//(If else stmt).

import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to be checked for a leap year : ");
		int year = sc.nextInt();
		
		if(year%4==0) {
			
			if(year%100==0) {
				if(year%400==0) {
					System.out.println(year + " is a leap year.");
				}
				else {
					System.out.println(year + " is not a leap year. ");
				}
			}
			else {
				System.out.println(year + " is a leap year.");
			}
		}
		else {
			System.out.println(year + " is not a leap year. ");
		}
		

	}

}
