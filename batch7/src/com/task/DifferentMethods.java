package com.task;

import java.util.Scanner;

public class DifferentMethods
{
   
	
	public long addition(int num1,long num2)
	{
		return num1+num2;
	}
	public double substraction(int num1,double num2)
	{
		return num1-num2;
	}
	public float multiplication(int num1,float num2)
	{
		return num1*num2;
	}
	public long division(int num1,long num2)
	{
		return num1/num2;
	}
	public static void main(String[] args)
	{
		DifferentMethods d=new DifferentMethods();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1=sc.nextInt();
		System.out.println("Enter second number:");
		long num2=sc.nextInt();
		
		
		while(true)
		{
			System.out.println("1:Addition\n2:Substraction\n3:Multiplication\n4:Division\n5:Exit");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Addition is:"+d.addition(num1, num2));
			
			        break;
			case 2:System.out.println("Substractionis:"+d.substraction(num1, num2));
	                break;
			case 3:System.out.println("Multiplication is:"+d.multiplication(num1, num2));
	                break;
			case 4:System.out.println("Division is:"+d.division(num1, num2));
	               break;
			case 5:System.exit(0);
	                break;
	        default:System.out.println("invalid option");
			}
			
		}
		
	}

}
