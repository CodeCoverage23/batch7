package com.Assignment6;

import java.util.Scanner;

public class Assignment6Q4 {
	static int fact = 1;
	public static int factorial(int a) {
		if (a > 0) {
			fact = fact * a;
			factorial(a - 1);
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value to calculate factorial");
		int num = sc.nextInt();
		//int num=5;
		if (num > 0) {
			int total = factorial(num);
			System.out.println("the factorial of given number is :" + total);
		}
	}
}