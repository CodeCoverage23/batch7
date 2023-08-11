package com.Assignment5;

import java.util.Scanner;

//Write a program to find out maximum number being among three numbers(if else if ladders stmt)
public class Assignment53 {
	
	public static void main(String[] args) {
		
		Scanner d = new Scanner(System.in);
		int a,b,c;
		System.out.println("Entre the first number :");
		a=d.nextInt();
		System.out.println("Entre the second number :");
		b=d.nextInt();
		System.out.println("Entre the third number :");
		c =d.nextInt();
		
		if(a>b && a>c) {
			System.out.println("give maximum number :" + a);
		}
		else if (b>a  &&  b> c)
		{
			System.out.println("give maximum number :" +b);
		}
		else  {
			System.out.println("give maximum number :" + c);
		}
		
	}
	

}
