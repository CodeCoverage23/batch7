package com.Assignment7;

import java.util.Scanner;

//Design method to print factors of given number.

public class Assignment73 {
	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter any number");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i =1;i<=n;i++)
		{
		if(n%i==0) 
		{
		System.out.print(i+", ");
		}
		}	
	}

}
