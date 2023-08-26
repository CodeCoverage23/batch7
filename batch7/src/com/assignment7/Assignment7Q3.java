package com.assignment7;

import java.util.Scanner;

//3. Design method to print factors of given number( Enter no = 6 then factors should be displayed like 1,2,3,6.

public class Assignment7Q3 {

	public  int factors(int num) {
	int fact = 1;
	return fact;
}
	
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n =  sc.nextInt();
		for (i = 1;i<=n;i++) {
			if(n%1==0) {
				System.out.println(i+" ");
			}
		}
	}
	
}