package com.pradeep.basic;

import java.util.Scanner;

public class Factorial1 {
static int fact=1;
public static int factorial(int num) {
	if (num>0) {
	fact=fact*num;
	factorial(num-1);
	}
	return fact;
}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value to calculate factorial");
		int num = sc.nextInt();
		if(num>0) {
		int total=factorial(num);
		System.out.println("the factorial of given number is :"+total);
	}
		else {
			
			System.out.println("please enter a valid number to calculate the fatorial");
		}
}
}