package com.assignment5;

import java.util.Scanner;

//5. Write a program to check whether number is even or odd.

public class Assignment5Q5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		
		if (num % 2 == 2)              
			{
			System.out.println("number is divide by 2 is even :" + num);
		} 
		else {
			System.out.println(" number is not divide by 2 or not equal by 2 is odd :" + num);
		}
	}

}
