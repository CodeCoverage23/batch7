package com.ak;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		// assignment no 7.3
		int n;
		System.out.println("enter any number");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+",");
			}
		}
		
	}

}
