package com.StringMethods;

import java.util.Scanner;

public class MultipleString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of string");
		int n=sc.nextInt();
		String s[]=new String[n];
		
	    sc.nextLine();
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.nextLine();
		}
		for(String str:s)
		{
			System.out.println(str);
		}

	}

}
