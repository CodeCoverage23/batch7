package com.pradeep.basic;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		//input from user 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int number = sc.nextInt();
		System.out.println("the list of even number from 1 to " + number + " : ");
		int i = 1;
//		even number using for loop

		// for (int i = 1; i <= number; i++) {
//			if (i % 2 == 0) {
//
//				System.out.print(i + " ");
//			}
//		}

//		//Even number using while loop
//		while (i <= number) {
//
//			if (i % 2 == 0) {
//
//				System.out.print(i + " ");
//			}
//             i++   ; 
//		}

		// Even number using Do-While loop

		do {

			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;

		}

		while (i <= number);

	}
}