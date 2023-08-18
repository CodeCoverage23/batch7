/*Assignment 5.1 Write a program to check number is possitive or
negative*/


package com.assignments;

import java.util.Scanner;

public class PossitiveOrNegative {
	
	public static void main(String[] args) {
		
		int num;
        
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		
		if (num > 0) {
		System.out.println("The number is possitive");	
		}
		else if (num < 0) {
			System.out.println("The number is negative");
		}
		else {
			System.out.println("The numbe is neither posstive nor netive");
		}
		
		
		
	}

}
