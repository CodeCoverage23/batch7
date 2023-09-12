package com.StringMethods;

import java.util.Scanner;

public class NoOfWordInString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		//without space in split prints no of character
		 // with space prints no of string
		String[] arr=s.split(" ");
		String[] arr1=s.split("");
		System.out.println("No Of words in String are:"+arr.length);
		System.out.println("No Of character in String are:"+arr1.length);
		

	}

}
