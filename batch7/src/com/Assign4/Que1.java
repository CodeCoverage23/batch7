package com.Assign4;

import java.util.Scanner;

public class Que1 {
	public int add(int a, int b) {
		return a + b;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Que1 t = new Que1();
		int s = t.add(a, b);
		System.out.println("addition:" + s);

	}

}
