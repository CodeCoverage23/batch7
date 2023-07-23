package com.roshani.basic;

public class DemoOperator {

	public static void main(String[] args) {
		// logical and
		System.out.println(true && true);

		// Bitwise and
		System.out.println(false & true);

		int a = 10;
		int b = 10;

		System.out.print("By using logical and :");
		System.out.println((a == 7) && (++b == 7));
		System.out.println(b);

		System.out.print("By Bitwise and :");
		System.out.println((a == 7) & (++b == 7));
		System.out.println(b);

	}

}
