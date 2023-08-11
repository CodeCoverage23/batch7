package com.Assignment5;

import java.util.Scanner;

public class Assignment5Q2 {//write a program  to check whether  year is leap year or not

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the number ");
		int number = s.nextInt();
		if (number%4==0) {
		System.out.println("The year is leap year");
	}
		else {
			System.out.println("The year is not leap year");
		}

}}
