package com.assign10;

import java.util.Scanner;

/*
 * Write Java program to check whether number is prime or not. 
 * ( Prime means  a number which is divisible by only two numbers: 1 and itself.
 *  So, if any number is divisible by any other number, it is not a prime number.)

 */
public class Que1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		
		if(isPrime(n)) {
			System.out.println(n +" is a prime number.");
		}else {
			System.out.println(n +" is not a prime number.");
		}

	}

	public static boolean isPrime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		return false;
	}

}
