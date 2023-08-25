package com.ak;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// assignment7.4
		int n,r;
		System.out.println("enter any number");
		Scanner res =new Scanner(System.in);
		n=res.nextInt();
		while(n>0)
		{
			r=n%10;
			System.out.print(r);
			n=n/10;
		}
	}

}
