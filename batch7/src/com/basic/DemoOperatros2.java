package com.basic;

public class DemoOperatros2 {

	public static void main(String[] args) {

		// Logical and
		System.out.println(true && true);

		// Bitwise and
		System.out.println(false & true);

		int a, b;

		a = 5;
		b = 5;

		System.out.print("By using logical and : ");
		System.out.println((a == 6) && (++b == 6));
		System.out.println(b);

		System.out.print("By using bitwise and : ");
		System.out.println((a == 6) & (++b == 6));
		System.out.println(b);

		int i = 50;
		int j = 30;

		System.out.println("Result: " + (a & b));

	}

}
