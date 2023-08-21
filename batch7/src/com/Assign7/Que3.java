package com.Assign7;
//Design method to print factors of given number( Enter no = 6 then factors should be displayed like 1,2,3,6.

import java.util.Scanner;

public class Que3 {
	public int factors(int num) {
		int fact=1;
		return fact;
	}
	public static void main(String[] args) {
		int i;
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter the number");
		int n= sc.nextInt();
		for(i=1;i<=n;i++) {
			if (n%i==0)
			{
				System.out.print(i+" " );
			}
		}

}}
	
