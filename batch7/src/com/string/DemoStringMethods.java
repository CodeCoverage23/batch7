package com.string;

public class DemoStringMethods {

	public static void main(String[] args) {

		String s1 = "Code"; // 1
		String s7 = "Code"; // 1
		String s6 = "CODE"; // 1
		String s2 = new String(s1); // 2
		String s3 = new String("Coverage");// 2
		String s4 = s1.concat(s3);
		String s10 = "Java".concat(" Program");
		System.out.println(s10);
		String s5 = "23456,dfghjk,fghj,ghj,8852,741";
		String string = s5.substring(5);
		System.out.println(s5.substring(0, 5));

		String[] split = s5.split(",");

		for (String s : split) {
			System.out.println("String Array : " + s);
		}
		System.out.println(s3.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(string);
		System.out.println(s1 + s2 + s3);
		System.out.println(s4);
		int l = s5.length();
		System.out.println(l);

		System.out.println(s1.equals(s6));
		System.out.println(s1.equalsIgnoreCase(s6));

		System.out.println(s1 == s2);
		System.out.println(s1 == s7);

	}

}
