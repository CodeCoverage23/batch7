package com.assignment7;


import java.util.Scanner;

//1. Design method to check whether the character is alphabet, digit and special symbol.

public class Assignment7Q1 {
   
	

	public static void main(String[] args) {
     
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		ch = sc.next().charAt(0); 
		
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			 
			System.out.println(ch + "is Alphabet");
		}else if (ch >= '0' && ch <='9') {
			
			System.out.println(ch + "is Digit");
		}else { 
			
			System.out.println(ch + "is special symbol");
		}
		
		
	}
}