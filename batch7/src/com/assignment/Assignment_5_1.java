package com.assignment;

import java.util.Scanner;

//write a program to check the number is positive or negative.

public class Assignment_5_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num= sc.nextInt();
		if(num>0){
			System.out.println("Number is positive ");
		}else {System.out.println("number is negative");
		}
		
	}
}