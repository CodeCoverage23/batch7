package com.exception;

public class NestedTryDemo {

	public static void main(String[] args) {

		try {

			String s = null;
			System.out.println(s.length());

			try {
				System.out.println(10 / 0);
			} catch (Exception e) {
				System.out.println(e);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
