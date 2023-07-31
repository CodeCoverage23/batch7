package com.Assign4;

import java.util.Scanner;

public class Que4 {
	public double division(int a, int b) {
		int div = a / b;
		return div;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		int b = sc.nextInt();

		Que4 q = new Que4();
		double i = q.division(a, b);
		System.out.println("division:" + i);

	}

}
