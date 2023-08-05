package com.DailyTask;
//WAP to reverse the string.

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string name");
		String s = sc.next();
          for(int i=s.length(); i>0; i--) {
			System.out.print(s.charAt(i-1));
			
		}
	}

}
