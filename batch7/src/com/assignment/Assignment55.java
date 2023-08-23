package com.assignment;
import java.util.Scanner;

public class Assignment55 {
	public static void main(String[]args) {
		int n;
		System.out.print("Enter a number");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		if(n%2==0)
		{
			System.out.print("even number");
		}
		
		else
		{
			System.out.print("odd number");
		}
	}

}
