package com.assignment5;

import java.util.Scanner;

//6. Write the program to check whether the no is greater than 100.
public class Assignment5Q6 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = Sc.nextInt();
		if (num > 100) {
			System.out.println(" number is big :" + num);
		} else {
			System.out.println("number is small :" + num);
		}
	}

}
