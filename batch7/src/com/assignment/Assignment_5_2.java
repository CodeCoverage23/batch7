package com.assignment;

import java.util.Scanner;

//write a program  to check whether  year is leap year or not
public class Assignment_5_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YEAR : ");
		int num = sc.nextInt();
		if (num % 4 == 0) {
			System.out.println("The given year is a leap year ");
		} else {
			System.out.println("The given year is non Leap year");
		}
	}

}
