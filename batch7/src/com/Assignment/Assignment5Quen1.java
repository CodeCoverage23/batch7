package com.Assignment;

import java.util.Scanner;

//1.write a program to check the number is positive or negative.

public class Assignment5Quen1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int no = sc.nextInt();
		if (no > 0) {
			System.out.println("Number is positive");

		} else if(no<0) {
			System.out.println("Number is negative");
	}else
		System.out.println("Number is invalid");

}
}