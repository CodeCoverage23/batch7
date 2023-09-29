package com.assign10;

import java.util.Scanner;

/*
 * Write a java program to display the Fibonacci series up to given number. (
 * Fibonacci series mean next number is the sum of previous two numbers for example 
 * 0,1,1,2,3,5,8,13,21,34,55 etc. If enter no as 5 then output is 0,1,1,2,3).

 */
public class Que2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of element in a fibonacci series : ");
		int n=sc.nextInt();
		
		printFiboSeries(n);

	}

	public static void printFiboSeries(int n) {
		int first=0;
		int second=1;
		if(n>=1) {
			System.out.print(first);
		}
		if(n>=2) {
			System.out.print(", "+second);
		}
		for(int i=3;i<=n;i++) {
			int next=first+second;
			System.out.print(", "+next);
			first=second;
			second=next;
		}
	}

}
