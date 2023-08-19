/*Assignment 5.6 Write a program to check whether no. is 
greater than 100*/

package com.assignments;

import java.util.Scanner;

public class NumberGreaterThan100 {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	
	if(num > 100)
	{
		System.out.println("The number is greater than 100");
	}
	else
	{
		System.out.println("The number is less than 100");
	}
}

}
