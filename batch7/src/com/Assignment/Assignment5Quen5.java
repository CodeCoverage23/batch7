package com.Assignment;

import java.util.Scanner;

//5. Write a program to check whether number is even or odd.

public class Assignment5Quen5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (num % 2 == 0 && num > 0) {
			System.out.println("Number is even");
		} else if (num > 0) {
			System.out.println("No is odd");

		} else
			System.out.println("No is invalid");

	}
}
