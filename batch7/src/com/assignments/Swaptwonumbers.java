/*Assignment 5.8 Write a program to swap the two numbers*/

package com.assignments;

import java.util.Scanner;

public class Swaptwonumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		
		System.out.println("Before swapping :" +num1+" "+num2);
	
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After swapping :" +num1+" "+num2);
		
	}

}
