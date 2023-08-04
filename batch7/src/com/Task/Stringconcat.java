package com.Task;
//WAP to print to compare the two strings with == and equals method and use concat method to perform concatenation for the same strings.

public class Stringconcat {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";

		System.out.println(s1 == s2); // compare with ==
		System.out.println(s1.equals(s2)); // compare with equals()

		System.out.println(s1.concat(s2)); // concatenation of two string

	}

}
