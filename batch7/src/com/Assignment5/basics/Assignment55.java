package com.Assignment5.basics;

import java.util.Scanner;

public class Assignment55 {

	public static void main(String[] args) {
		int i;
		Scanner r = new Scanner(System.in);
		System.out.println("entre the value");
		i = r.nextInt();

		if (i % 2 == 0) {
			System.out.println("No is even");

		} else {
			System.out.println("No is odd");

		}
	}
}