package com.basic.Akash;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println("The list of Even no. is from 1 to" + number + ":");
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		
	}

}
