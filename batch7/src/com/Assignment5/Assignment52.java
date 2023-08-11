package com.Assignment5;

import java.util.Scanner;

//Write a program to check whether year is leap or not(if else stmt).
public class Assignment52 {
	public static void main(String[] args) {
		
		Scanner d = new Scanner(System.in);
		System.out.println("entre leap year :");
		int year = d.nextInt();
		if((year%400==0) || (year%4==0) && (year%100!=0) ){
			System.out.println("the leap year is :");
		}
		else {
			System.out.println("the leap year is not leap year");
		}
	}

}
