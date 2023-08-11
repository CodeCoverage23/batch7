package com.Assignment;

import java.util.Scanner;

//2.write a program  to check whether  year is leap year or not. (If else stmt).

public class AssignmentNo5Quen2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();
		if (year % 4 == 0 || year % 400 == 0 && year != 0) {
			System.out.println(year + " : year is leap year");
		} else
			System.out.println(year + " : year is not leap year");

	}

}
