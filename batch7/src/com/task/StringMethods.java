//WAP to print to compare the two strings with == and equals method and use concat method to perform concatenation for the same strings.

package com.task;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) 
	{
		String s1="code";
		String s2="code";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String:");
		String str1=sc.next();
		System.out.println("Enter second String:");
		String str2=sc.next();
		if(str1.equals(str2))
		{
			      System.out.println("Strings are equals by equal method");
		}
        String concat=str1.concat(str2);
        System.out.println("After concatenation:"+concat);
        System.out.println("First String:"+s1);
        System.out.println("Second String:"+s2);
      
		if(s1==s2)
		{
			System.out.println("Strings are equal by == ");
		}
		else
		{
			System.out.println("Strings are not equal by ==");
		}
		
	}

}
