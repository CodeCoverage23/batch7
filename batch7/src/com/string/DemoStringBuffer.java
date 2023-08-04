package com.string;

public class DemoStringBuffer {

	public static void main(String[] args) {

		StringBuffer s1 = new StringBuffer("Code ");

		s1.append("Coverage");

		System.out.println(s1);

		StringBuilder s2 = new StringBuilder("Java ");

		s2.append("Program");

		System.out.println(s2.length());
		System.out.println(s2);

	}

}
