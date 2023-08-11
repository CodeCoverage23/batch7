package com.Assignment5;

import java.util.Scanner;

public class Assignment5Q8 {//Write a program to swap the two numbers

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in); 
		System.out.println("Enter the number of a ");
		int a=s.nextInt();
		System.out.println("Enter the number of b ");
		int b=s.nextInt();
		System.out.println("Before Swapping :"+a+ " "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping :"+a+ " "+b);

	}

}
