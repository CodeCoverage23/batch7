package com.task;

import java.util.Scanner;

public class EvenOddANDOperator {

	public static void main(String[] args) 
	{
//		Example
//		num is 4 then binary value is 0010
//		0010
//		&
//		0001
//		----
//		0000=0->Even number
//		num is 5 then binary value is 0011
//		0011
//		&
//	    0001
//		----
//		0001=1->Odd number
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number");
//		int num=sc.nextInt();
//		if((num & 1)==0)
//		{
//			System.out.println("Even number");
//		}
//		else
//		{
//			System.out.println("Odd number");
//		}
		//by divide and multiply by 2
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		if((num/2)*2==num)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
		
	}

}
