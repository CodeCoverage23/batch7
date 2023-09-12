//4. Design method public int getReverseNumber(int num) which return int value to that method and result print into main method.
package com.task;

import java.util.Scanner;

public class ReverseNumber1
{
	int rem,rev;

	public int getReverseNumber(int num)
	{
		//Reverse Operation
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;//return the reverse number to main method
	}
	
	public static void main(String[] args)
	{
		ReverseNumber1 rn=new ReverseNumber1();//ReverseNumber class object is created
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int num=sc.nextInt();                //Input From user
		int result=rn.getReverseNumber(num);//call go to getReverseNumber() function and get the reverse number in result varaible
		System.out.println("Output:"+result);
		

	}

}
