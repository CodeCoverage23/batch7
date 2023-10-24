package com.assignment10;
//2. Write a java program to display the Fibonacci series up to given number.
//(Fibonacci series mean next number is the sum of previous two numbers 
//for example 0,1,1,2,3,5,8,13,21,34,55 etc. If enter no as 5 then output is 0,1,1,2,3).
public class Fibonacciseries {
	 
	public static void main(String[] args) {
		
		int num1 = 0; int num2 = 1;
		int count = 5;
		int num3;
		System.out.print(num1+ " "+ num2);
		for(int i= 2;i<=count;i++) {  //(initialization; condition; increment)
			num3 = num1+num2;//1 = 0+ 1;
			num1 = num2;
			num2 = num3;
			System.out.print(" "+ num3);
		}
		
		
	}
	

}
