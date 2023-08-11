//3.write a program to find out maximum number among three number(if else if ladder statement)

package com.assignment5;

import java.util.Scanner;

public class MaximumNumber 
{
	
	public void  maxNumber(int num1,int num2,int num3)
	{
		int max=0;
		/*
		
		if(num1>num2)
		{
			max=num1;
		}
		else if(num2>num3)
		{
			max=num2;
		}
		else
		{
			max=num3;
		}
		
		
		return max;
		*/
		if(num1>num2 && num1>num3)
		{
			
		
			System.out.println("the greatest number is :"+num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("the greatest number is :"+num2);
		}
		else if(num3>num1 && num3>num2)
		{
			System.out.println("the greatest number is :"+num3);
		}
		else
		{
			System.out.println("Invalid numbers:");
		}
	}
	
    
	public static void main(String[] args)
	{
		
		MaximumNumber mn=new MaximumNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1:");
		int num1=sc.nextInt();
		
		System.out.println("Enter number2:");
		int num2=sc.nextInt();
		
		System.out.println("Enter number3:");
		int num3=sc.nextInt();
		System.out.println(num1+" "+num2+" "+num3);
		
		//System.out.println("Maximum Number is:"+mn.maxNumber(num1, num2, num3));
		mn.maxNumber(num1, num2, num3);
		
		
		
		
		
	}

}
