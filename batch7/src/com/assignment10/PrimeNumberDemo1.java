
//1.Write Java program to check whether number is prime or not. ( Prime means  a number which is divisible by only two numbers: 1 and itself. So, if any number is divisible by any other number, it is not a prime number.)

package com.assignment10;

import java.util.Scanner;

public class PrimeNumberDemo1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number which you want to check as a prime:");
		//Taking input from user as a number
		int num=sc.nextInt();
		//count variable initialise to 0;
		int count=0;
		//check whetert number is greater than 1
		if(num>1)
		{
	    //for-loop for no of teration 
		for(int i=1;i<=num;i++)
		{
			//condition for to chect the primre number if true the count is incremented
			if(num%i==0)
			{
				count++;
			}
				
		}
		//if count value is two for given number then it is prime number
		if(count==2)
		{
			System.out.println("Number is Prime Number");
		}
		else
		{
			System.out.println("Number is Not a Prime Number");
		}
		}
		else
		{
			System.out.println("Invalid number");
		}

	}

}
