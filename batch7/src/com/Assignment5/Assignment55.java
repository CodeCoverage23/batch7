package com.Assignment5;

import java.util.Scanner;

//Write a program a check whether number is even or odd.
public class Assignment55 {
public static void main(String[] args) {
	int n;
	System.out.println("enter any number");
	Scanner d = new Scanner(System.in);
	n = d.nextInt();
	if(n%2==0)
	{
		System.out.println("even number");
	}
	else
	{
	System.out.println("odd number");	
	}
	
}
}
