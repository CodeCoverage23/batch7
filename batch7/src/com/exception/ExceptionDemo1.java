package com.exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		try {
			int a = 10;
			float b = a / 0;
			System.out.println(b);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Rest of the Code...");

	}

}
