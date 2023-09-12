package com.task;

import java.util.Scanner;

public class FIbonanciseries 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int n01 = 0;
		int n02 = 1;
		System.out.print(n01 + " " + n02);

		for (int i = 2; i < num; i++)
		{
			int next = n01 + n02;
			//System.out.print(" " + next);
			n01 = n02;
			n02 = next;
			System.out.print(" " + next);

		}

	}
}
