package assignment5;

import java.util.Scanner;

// write a program to find out maximum number among three number(if else if ladder statement)

public class assignment58 {
	// int a=200,b=300,c=400;
	
	
	public static void main(String[] arge) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to be compare:");
		int a=sc.nextInt();
		System.out.println("number 1 : ");
		int b=sc.nextInt();
		System.out.println("number 2 : ");
		int c=sc.nextInt();
		System.out.println("number 3 : ");
		if(a>b && a>c) {
			System.out.println("maximum number is " + a);
			
		}
		else if(b>c && b>a) {
			System.out.println("maximum number is "+ b);
			
		}
		else {
			System.out.println("maximum number is "+ c);
		}
		
		}
		
	}
	


