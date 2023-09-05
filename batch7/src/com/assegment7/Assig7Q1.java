package com.assegment7;

import java.util.Scanner;

//Design method to check whether the character is alphabet, digit and special symbol.

public class Assig7Q1 {

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);
		System.out.println("enter any character ");
		int ch = SC.nextInt();

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch + " is alphabet");
		} else if (ch > '0' && ch < '9') {
			System.out.println(ch + " is digit ");
		}

		else {
			System.out.println(ch + " is a special symbol");
		}

	}

}
