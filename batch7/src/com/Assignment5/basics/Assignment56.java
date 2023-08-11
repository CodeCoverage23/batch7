
//6.Write the program to check whether the no is greater than 100.
package com.Assignment5.basics;

import java.util.Scanner;

public class Assignment56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int i = sc.nextInt();

		if (100 >= 0) {
			System.out.println("No.is grater then 100");
		} else {
			System.out.println("No.is less then100");
		}
	}
}
