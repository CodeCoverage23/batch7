package com.Task;
//WAP to reverse the string.

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		
		for (int r=s.length()-1;r>=0;r--) {
			System.out.print(s.charAt(r));
		}
		

	}

}
