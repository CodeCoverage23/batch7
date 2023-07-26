package com.basic.control.stmt;

public class DemoNestedForLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 2; i++) {
			System.out.println("Outer for loop " + i);
			for (int a = 1; a <= 2; a++) {
				System.out.println("Inner for loop");
			}

		}

	}

}
