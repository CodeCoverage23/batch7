package com.assignment6;

import java.util.Scanner;

//4. Design method int fact orial(int no)  which returns int value to that method. print the results into main method
//(Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)
public class Assignment6Q4 {
	
	static int fact=1;
	
	public static int factorial(int num) {
		if (num>0) {
			fact = fact*num;
			factorial(num-1);
		}
		return fact;
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of calculate factorial");
		int num = sc.nextInt();
		if(num>0) {
			int total = factorial(num);
			System.out.println("the factorial of givien number is :" +total);
		}
		
		else {
			System.out.println("enter a valid number to calculate the factorial");
		}
	}
	
	

}
