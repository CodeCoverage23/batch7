package com.assignment5;

import java.util.Scanner;

//1.write a program to check the number is positive or negative.
public class Assignment5Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		if (num == 0)
		{
			System.out.println(num+" is neither positive nor negative number");
			
		}
		else if(num>0)
		{
			System.out.println(num+" is a positive number");
		}
		
		else{
			System.out.println(num+"is a negative number");
		}
	}

}
