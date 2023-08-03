package com.pradeep.basic;

import java.util.Scanner;

public class NameMultiple {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value to print name of perticular multiple : ");
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			if (i % 5 == 0 && i % 6 == 0) {
				System.out.println(i + " : pradeep patankar");
			}
				else if (i % 5 == 0) {
				System.out.println(i + " : pradeep");}
			else if (i % 6 == 0) {
				System.out.println(i + " : patankar");
		
		     }else
				System.out.println(i);

		}
		}}
	


