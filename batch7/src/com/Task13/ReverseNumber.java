package com.Task13;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int rem, n, rev = 0;
		System.out.println("  enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;

			n = n / 10;

		}
		System.out.println("reverse number :"+rev);

	}

}
