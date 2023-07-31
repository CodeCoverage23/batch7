package com.Assign4;

import java.util.Scanner;

public class Que2 {
	public int subtraction(int a, int b) {
		int sub = a - b;
		return sub;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Que2 q = new Que2();
		int s = q.subtraction(a, b);
		System.out.println("subtraction:" + s);
	}

}
