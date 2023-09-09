    package com.Assign5;

    // write a program to find out maximum number among three number.
    import java.util.Scanner;

    public class Que3 {
    public static void main(String[] args) {
		// int a=100,b=200,c=300;
		
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the numbers to be compare:");
	
	System.out.println("number 1:");
	
	int a=sc.nextInt();
	System.out.println("number 2:");
	
	int b=sc.nextInt();
	System.out.println("number 3:");
	
	int c=sc.nextInt();
	if(a>c&& a>c) {
		
		System.out.println("maximum number is "+a);
		
	}
	else if (b>c && b>a) {
		System.out.println("maximum number is"+b);
		
	}
	else {
		System.out.println("maximum number is"+c);
	}
	}

}
