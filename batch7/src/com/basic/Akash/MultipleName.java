package com.basic.Akash;

import java.util.Scanner;

public class MultipleName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for multiple name");
		int num = sc.nextInt();
		for (int i = 1;i<=num;i++) {
			if(i%2==0 && i%4==0) {
				System.out.println(i+ ": AkashAswar");
				}
			else if(i% 2==0) {
				System.out.println(i+": Akash");
				}
			else if(i%4==0) {
				System.out.println(i+": Aswar");
				}
			else 
				System.out.println(i);
		}

	}

}
