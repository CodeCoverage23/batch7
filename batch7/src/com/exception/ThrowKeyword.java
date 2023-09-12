package com.exception;

import java.util.Scanner;

public class ThrowKeyword {

	public static void main(String[] args)
	{
		int a=10;
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		if(i==2)
		{
			throw new ArithmeticException("cannot divide by 2");
		}
		else
		{
			System.out.println(a/i);
			
		}
		
	}

}
