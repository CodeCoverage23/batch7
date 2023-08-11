package com.Assignment5;

import java.util.Scanner;

public class Assignment5Q3 { // write a program to find out maximum number among three number

	public static void main(String[] args) {
		int maximum;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the num a ");
		int a = s.nextInt();
		System.out.println("Enter the num b ");
		int b = s.nextInt();
		System.out.println("Enter the num c ");
		int c = s.nextInt();
		if (a > b) {
			System.out.println("a is greater than b");
		} else if (b > c) {
			System.out.println("b is greater than c");
		} else if (c > a) {
			System.out.println("c is greater than a");
		}
	}

}
