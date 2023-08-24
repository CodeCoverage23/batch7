package com.Assignment7;

import java.util.Scanner;

//Design method to check whether the character is alphabet, digit and special symbol.

public class Assignment71 {
	public static void main(String[] args) {
		char ch;
		//int n;
		System.out.println("Enter any character");
	//	System.out.println("Enter any digit");
	//	System.out.println("Enter any special symbol");
		Scanner sc = new Scanner(System.in);
		ch=sc.next().charAt(0);
		//n=sc.nextInt();
		if(ch>=65 && ch<=90) 
		{
			System.out.println("This is a capital alphabet");
		}
		else if(ch>=97 && ch<=122)
		{
			System.out.println("This is a small alphabet");
		}
		else if(ch>=48 && ch<=57)
		{
			System.out.println("This is digit");
		}
		else
		{
			System.out.println("This is special symbol");
		}
		
	}

}
