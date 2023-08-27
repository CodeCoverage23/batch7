package com.Assignment4;

import java.util.Scanner;

public class Assignment4Que1234 {

	public int add(int a, int b) { // addition of two number
		int c = a + b;
		return c;
	}

	public int sub(int k, int j) {// Subtraction of two number
		int l = j - k;
		return l;
	}

	public int mult(int count1, int count2) { // multiplication of two number
		int count3 = count1 * count2;
		return count3;
	}

	public float div(int x, int y) { // dividation of two number
		int z = x / y;
		return z;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int s = sc.nextInt();
		int p = sc.nextInt();
		Assignment4Que1234 m = new Assignment4Que1234();
		int d = m.add(s, p);
		System.out.println("addition " + d);
		int l = m.sub(p, s);
		System.out.println("subtraction" + l);
		int count3 = m.mult(s, p);
		System.out.println("multiplication" + count3);
		float z = m.div(p, s);
		System.out.println("dividation" + z);

	}

}
