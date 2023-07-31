package com.Loop;

import java.util.Scanner;

//multiple of 5 7 and both using for loop stmt print name 
public class Task {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(i + " Lovekesh Raut");
			} else if (i % 5 == 0) {
				System.out.println(i + " love");
			} else if (i % 7 == 0) {
				System.out.println(i + " raut");
			} else
				System.out.println(i);

		}
	}
}
