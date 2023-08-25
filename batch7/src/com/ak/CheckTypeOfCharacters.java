package com.ak;

import java.util.Scanner;

public class CheckTypeOfCharacters {

	public static void main(String[] args) {
		// assignment no 7.1
		char ch;
		System.out.println("enter any character:");
		Scanner sc = new Scanner(System.in);
		
	
		ch=sc.next().charAt(0);
		if(ch>=65 && ch<=90)
		{
			System.out.println("This is a capital alphabet");	
		}
		else if(ch>=97 && ch<=122)
		{
			System.out.println("This is a small alphabet");	
		}
		else if(ch>=48 && ch>=57)
		{
			System.out.println("This is digit");	
		}
		else {
			System.out.println("This is special symbol");	
		}
	}

}
