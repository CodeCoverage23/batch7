//String Reverse
package com.task;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		System.out.println("Original String:"+str);
		String reverse=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reverse String is:"+reverse);
		
	}

}
