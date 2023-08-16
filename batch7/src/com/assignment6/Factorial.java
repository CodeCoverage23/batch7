//4. Design method int fact orial(int no)  which returns int value to that method. print the results into main method (Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)

package com.assignment6;

import java.util.Scanner;

public class Factorial 
{
	public int factorial(int no)
	{
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) 
	{
		Factorial f=new Factorial();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int no=sc.nextInt();
		int fact=f.factorial(no);
		System.out.println("Factorial of "+no+" is:"+fact);
	}

}
