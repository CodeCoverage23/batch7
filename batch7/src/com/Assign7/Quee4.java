package com.Assign7;

import java.util.Scanner;

public class Quee4 {
	public int getnumber(int num) {
		int  n, rem,  rev =0; 
		
		while (num!=0) {
			rem = num % 10;
			rev = rev * 10 + rem; 
			num = num / 10;
		}
		return rev;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");
		int n = sc.nextInt();
		Quee4 obj = new Quee4();
		int a=obj.getnumber(n);
		System.out.print(a);

	}

}
