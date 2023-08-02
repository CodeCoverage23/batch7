package com.basic;

import java.util.Scanner;

public class FactorialNumber {
	
	static int m=1;
	
	
	public static void main(String[] args) {
		
		Scanner fact= new Scanner(System.in);
		System.out.println("enter a number to get factorial");
		int number= fact.nextInt();

		 

		for(int i=1;i<=number;i++)
		{
			
			m= m*i;
			
					//System.out.println("factorial Of 5 is:" + m);
			
	}
		
		System.out.println("factorial Of " +  number  + " is:" + m);

	}
}
