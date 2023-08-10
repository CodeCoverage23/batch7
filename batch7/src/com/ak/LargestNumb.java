package com.ak;

import java.util.Scanner;

public class LargestNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Three Numbers ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int largestNumb =a;
		if(b>largestNumb) {
			largestNumb=b;
		}
		if(c>largestNumb) {
			largestNumb=c;
		}
		System.out.println("The Largest Number Is: "+largestNumb);
	}
	
//assignment 5)3
}
