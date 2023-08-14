package com.Assign6;

import java.util.Scanner;

public class Que4Fact {

	static int fact = 1;

	public static int factorial(int num) {
		if (num > 0) {
			fact = fact * num;
			factorial(num - 1);
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		if (num > 0) {
			int total = factorial(num);
			System.out.println("the factorial of given number is :" + total);
		} else {

			System.out.println("please enter a valid number to calculate the fatorial");
		}
	}

}
