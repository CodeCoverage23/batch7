package com.ak;

import java.util.Scanner;

public class SwapingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter Second Number: ");
		int number2 = scanner.nextInt();
		
		System.out.println("Before Swapping Number : number1 = "+ number1 + " number2 = " + number2);
		
		int temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("After Swapping Number : number1 = " +number1 + " number2 = " + number2);
	}
	//Assignment 5)8
}
