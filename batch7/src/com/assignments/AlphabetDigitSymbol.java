package com.assignments;

import java.util.Scanner;

public class AlphabetDigitSymbol {
	
	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		ch = sc.next().charAt(0);
		
		if(ch >= 97 && ch <= 122 )
		{
			System.out.println("It is a small letter alphabet");
		}
		
		else if (ch >= 65 && ch <= 90)
		{
			System.out.println("It is a capital letter alphabet");
		}
		
		else if (ch >= 48 && ch <= 57)
		{
			System.out.println("It is a number ");
		}
		
		else if(ch>=33 && ch<=47  || ch>=58 && ch<=64 || ch>=91 && ch<=96 || ch>=123 && ch<=126)
			
		{
			System.out.println("It is a special symbol");
			
		}
		
}
}