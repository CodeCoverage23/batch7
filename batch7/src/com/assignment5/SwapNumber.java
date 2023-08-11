//8. Write a program to swap the two numbers.

package com.assignment5;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) 
	{
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number1:");
		int num1=sc.nextInt();
		
		System.out.println("Enter  Number2:");
		int num2=sc.nextInt();
		
		System.out.println("Before Swapping:"+num1+" "+num2);
		
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After Swapping:"+num1+" "+num2);
		*/
		
		int a=4;
		int b=5;
		System.out.println("without third variable  before Swapping:"+a+" "+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("without third variable After Swapping:"+a+" "+b);
		
		

	}

}
