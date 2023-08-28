package com.Assignment7;

import java.util.Scanner;

// Design method to print factors of given number
public class Assignment7Q3 {
	public static void factor(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(+i + " ");

			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if (num > 0) {
			factor(num);
		}

	}

}
