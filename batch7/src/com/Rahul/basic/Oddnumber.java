package com.Rahul.basic;

import java.util.Scanner;

public class Oddnumber {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);   //scanner for taking input value
		System.out.println("Enter number: ");
		int a = s.nextInt();
		if (a%2==0) {
			System.out.println("number"+a+"is even");
		}
		
		
		else {
			System.out.println("number"+a+"is odd"); 
		}

	}

}
