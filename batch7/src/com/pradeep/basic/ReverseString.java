package com.pradeep.basic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string : ");
		String name = sc.next();
		String org=name;

//		String name = "swati";
		// 012345
//	using for loop

		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);

		}
		if (rev.equals(org)) {

			System.out.println("the " + name + " is a palindrome String");
		}
		else {
			System.out.println("the " + name + " is not a palindrome String");
		}
//		System.out.println("the reverse String : " + rev);

//using String builder or StringBuffer
//		StringBuilder sb = new StringBuilder(name);
//		StringBuilder reverse = sb.reverse();
//		System.out.println("the reverse string with StringBuilder : " + reverse);

	}

}
