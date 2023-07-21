package com.basic.control.stmt;

import java.util.Scanner;

public class DemoIfElseIf {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // object of scanner class
		System.out.println("Enter the Number : ");
		int number = s.nextInt(); // Method from scanner class to read integer value

		// int number = 1;

		if (number > 0) {
			System.out.println("Positive number");
		} else if (number < 0) {
			System.out.println("Negative Number");
		} else {
			System.out.println("Number is Zero");
		}

		System.out.println("Rest of the part");

	}

}
