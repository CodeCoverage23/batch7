package com.Assign5;

import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("the number is even");
		} else {
			System.out.println("the number is odd");
		}
	}

}
