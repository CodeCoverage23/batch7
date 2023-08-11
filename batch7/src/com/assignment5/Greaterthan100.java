//6. Write the program to check whether the no is greater than 100.

package com.assignment5;

import java.util.Scanner;

public class Greaterthan100 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if(num>=100)
		{
			System.out.println(num+" is Greater than 100");
		}
		else
		{
			System.out.println(num+" is not Greater than 100");
		}
		

	}

}
