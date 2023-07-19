package com.basic;

public class DemoOperators {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a++);// 11
		System.out.println(++a);// 12

		int b = 50;

		if (a > b || b == 50) {
			System.out.println("Logical And");
		}

		a = b += a;

		System.out.println(a);
	}

}
