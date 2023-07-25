package com.Assignment;

import java.util.Scanner;

// to print first characters of your name
public class Assignment2q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
			System.out.println("Enter your name : ");
			String str=s.next();
			
			char Firstchar = str.charAt(0);
			System.out.println("First Character of your name : "+ Firstchar);
			
			//to print first five characters
			
			char schar = str.charAt(1);
			char tchar = str.charAt(2);
			char fchar = str.charAt(3);
			char vchar = str.charAt(4);
			
			System.out.println("First five letters of your name : "+ Firstchar+schar+tchar+fchar+vchar);
		}


    
}


