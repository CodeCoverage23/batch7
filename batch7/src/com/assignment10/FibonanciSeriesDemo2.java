//2 Write a java program to display the Fibonacci series up to given number.
//(Fibonacci series mean next number is the sum of previous two numbers
//for example 0,1,1,2,3,5,8,13,21,34,55 etc.
//If enter no as 5 then output is 0,1,1,2,3).

package com.assignment10;

import java.util.Scanner;

public class FibonanciSeriesDemo2 {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of fibonanci series you want:");
		//Taking input from user as a number
		int number=sc.nextInt();
		//initialize variable num1=0;num2=1;
		int num1=0,num2=1,num3;
		System.out.print(num1+" "+num2);
		//for loop for no of iteration
	    for(int i=2;i<=number;i++)
		{   //addition of num1+num2 stotred in num3
			num3=num1+num2;
			System.out.print(" "+num3);
			
			num1=num2;
			num2=num3;
			
		}
	}

}
