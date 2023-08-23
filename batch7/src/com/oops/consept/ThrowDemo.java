package com.oops.consept;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
		int a = 10;
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();

		if (i == 2) {
			throw new ArithmeticException("Can not devide by 2");
		} else {
			System.out.println(a / i);
		}
	}

}
