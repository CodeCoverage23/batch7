package com.task;

import java.util.Scanner;

public class MultipleOf5and7 {

	public static void main(String[] args)
	{
		//Print 1to 100 using for-loop
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		System.out.println("Enter a number 1 ");
		int number1=sc.nextInt();
		System.out.println("Enter a number 2 ");
		int number2=sc.nextInt();
		System.out.println("Numbers from 1to 100:");
		int i;
		for(i=1;i<=num;i++)
		{
			
			
			//if(i%7==0 && i%5==0)
			if(i%number1==0 && i%number2==0)
			{
				
				System.out.println(i+": Rabiya shaikh");
			
			}
			//else if(i%5==0)
			else if(i%number1==0)
			{
				
			  
				System.out.println(i+": rabiya");
			
			}
			//else if (i%7==0)
			else if(i%number2==0)
			{
				System.out.println(i+": Shaikh");
			}
			else
			{
				System.out.println(+i);
			}
			 
			
			
		}
		

	}

}
