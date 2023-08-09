package com.assignment;

import java.util.Scanner;

//Write the program to check whether the no is greater than 100.

public class Assignment_5_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no  :  ");
		int num = sc.nextInt();
		if (num > 100) {
			System.out.println("the given number is grester than 100");
		} else {
			System.out.println("the given number is less than 100");
		}
	}
}
