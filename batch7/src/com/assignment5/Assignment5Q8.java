package com.assignment5;
//8. Write a program to swap the two numbers.

public class Assignment5Q8 {

	public static void main(String[] args) {
		int a = 46; // 24
		int b = 24;// 46

		int number;
		System.out.println(" before swap :" + a + " " + b);
		number = a;// number =46
		a = b;// a=24
		b = number;// 46

		System.out.println(" after swapping :" + a + " " + b);
	}

}
