package com.Assignment;
//1. Design method to check whether the character is alphabet, digit and special symbol.

import java.util.Scanner;

public class Assignment7Que1 {
	public void check(char ch) {

		if (ch >= 65 && ch <= 90) {
			System.out.println(" it is a big Alphabet");
		} else if (ch >= 97 && ch <= 122) {
			System.out.println(" it is a small Alphabet");

		} else if (ch >= '0' && ch <= '9') {
			System.out.println(" it is Digit");
		} else if (ch >= 33 && ch <= 47 || ch >= 58 && ch <= 64 || ch >= 91 && ch <= 96 || ch >= 123 && ch <= 126) {
			System.out.println(" it is special Symbol");

		}
	}

	public static void main(String[] args) {
		Assignment7Que1 as = new Assignment7Que1();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any input");
		char st = sc.next().charAt(0);

		as.check(st);
	}

}
