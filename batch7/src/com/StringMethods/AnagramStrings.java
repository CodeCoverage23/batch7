package com.StringMethods;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {

	public static void main(String[] args)
	{

//		step1:covert to lower case
//		step2:convert to chaArray
//		step3:sort the arrays
//		step4:compare the arrays
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String");
		String str1=sc.nextLine();
		System.out.println("Enter Second String");
		String str2=sc.nextLine();
		
		
		 str1 = str1.toLowerCase();  
	     str2 = str2.toLowerCase();  
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(arr2);
		
		if(Arrays.equals(arr1, arr2)==true)
		{
			System.out.println("Both Strings are Anagram");
		}
		else
		{
			System.out.println("Both Strings are Not Anagram");
		}
	}

}
