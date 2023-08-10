package com.Task;
//WAP to print palindrome numbers till 500.

public class Palindrome500 {

	public static void main(String[] args) {
		int i = 0;
		int count = 500;

		for (i = 0; i <= count; i++) {
			int num = i;

			int orgnum = num;
			int rev = 0;

			while (num > 0) {
				int rem = num % 10;
				rev = rev * 10 + rem;
				num = num / 10;
			}

			if (orgnum == rev) {
				System.out.print(orgnum + " ");
			}
		}
	}

}
