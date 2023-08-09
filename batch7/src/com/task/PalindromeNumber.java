package com.task;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int pnum=num;
		int rev=0;
		int rem=0;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		if(pnum==rev)
		{
			System.out.println(pnum+" is a palindrome number.");
		}
		else
		{
			System.out.println(pnum+" is not a palindrome number.");
		}
	}

}
