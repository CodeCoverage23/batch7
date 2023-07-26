//Java Program to Dispaly even,odd numbers from 1to 100;
package com.task;

public class EvenOddNumberTill100 {

	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
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
