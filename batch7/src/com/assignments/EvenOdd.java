/*Assignment 5.5 Writw a program to check whether the number is 
even or odd*/

package com.assignments;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int i = sc.nextInt();
		
		if(i % 2 == 0)
		{
		System.out.println("The number is even");	
		}
		else if (i % 2 != 0)
		{
			System.out.println("The number is odd");
		}
		else
		{
			System.out.println("The number is invalid");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
