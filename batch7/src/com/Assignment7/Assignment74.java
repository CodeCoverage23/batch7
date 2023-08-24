package com.Assignment7;

import java.util.Scanner;

//DEsign method public int getReverseNumber(int num) which return int value to that method and result print into main method.

public class Assignment74 {
	public static void main(String[] args) {
		int n,r;
		System.out.println("Enter any number");
		Scanner rev=new Scanner(System.in);
		n=rev.nextInt();
		while(n>0) 
		{
		   r= n%10;
		    System.out.print(r);
		  n = n/10;
		}
		
	}
	

}
