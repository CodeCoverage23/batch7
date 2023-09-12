package com.task;

import java.util.Scanner;

public class EvenOddBySwitching
{
		static boolean isEven(int n)
		{
		boolean even_no = true;
		for (int i=1; i <= n; i++)
		even_no = !even_no;
		return even_no;
		}
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			if(isEven(n))
			{
				System.out.println("Even number");
			}
			else
			{
				System.out.println("Odd number");
			}
			
		}


	
		

}
