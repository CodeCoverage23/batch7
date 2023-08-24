package com.exception;

public class TestException {

	public static void main(String[] args) {

		int a = 24;

		if (a < 18) {
			throw new TooYoungException("You are too old to get married, you will never get a chance to get married");

		} else if (a > 60) {

			throw new TooOldException(
					"You are too Young to get married, Please wait for few years you definitely will get perfect match");
		} else {
			System.out.println("Thank you for registration..!");
		}

	}

}
