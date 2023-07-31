package com.Assign4;
import java.util.Scanner;

public class Que3 {
	public int multiplication(int a, int b) {
		int mul = a * b;
		return mul;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Que3 q = new Que3();
		int c = q.multiplication(a, b);
		System.out.println("multiplication:" + c);

	}

}