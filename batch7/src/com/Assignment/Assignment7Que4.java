package com.Assignment;

import java.util.Scanner;

//4. Design method public int getReverseNumber(int num) which return int value to that method and result print into main method.

public class Assignment7Que4 {
	public int getReverseNumber(int num) {
		int rev = 0;
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		Assignment7Que4 as = new Assignment7Que4();
		int ans = as.getReverseNumber(num);
		System.out.println(ans);
	}

}
