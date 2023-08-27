package com.oops.consept;

public class MethodOverloadingDemo {

	/*
	 * 1. No of parameter are different
	 */

	public void multiplication(int a, int b) {

		System.out.println(a * b);
	}

	public void multiplication(int a, int b, int c) {

		System.out.println(a * b * c);
	}

	/*
	 * 2. Date types of parameter should be different
	 */
	public void multiplication(int a, float b) {

		System.out.println(a * b);
	}

	public void multiplication(float a, long b) {

		System.out.println(a * b);
	}

	public static void main(String[] args) {

		MethodOverloadingDemo demo = new MethodOverloadingDemo();
		demo.multiplication(11, 11);

		demo.multiplication(11, 11, 11);

		demo.multiplication(14.5f, 22);

		demo.multiplication(14, 44.5f);
	}
}
