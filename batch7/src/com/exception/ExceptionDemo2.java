package com.exception;

import com.oops.consept.Employee;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		try {

			Employee arr[] = {};

			int a[] = new int[5];
			System.out.println(a[5]);

			System.out.println(10 / 0);

			String s = null;
			System.out.println(s.length());
		}
		/* catch (ArithmeticException e) {
			System.out.println("Inside Arithmetic catch block");
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
			System.out.println("Inside BoundsException catch block");
			System.out.println(e);
		}*/ catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Rest of the code...");
	}

}
