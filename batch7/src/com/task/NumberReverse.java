package com.task;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("Original Number:"+num);
		int rev=0;
		int rem=0;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse Number is:"+rev);
	}

}
