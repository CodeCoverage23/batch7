//Java Program to Dispaly even,odd numbers from 1to 100;
package com.task;

import java.util.Scanner;

public class EvenOddNumberTill100 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("sum from:");
		int i=sc.nextInt();
		System.out.println("sum upto:");
		int num=sc.nextInt();
		for(;i<=num;i++)
	
		{
			if(i%2==0)
			{
				System.out.println(" Even numbers:"+i);
			}
			else
			{
				System.out.print(" Odd  numbers:"+i);
			}
		}

	}

}
