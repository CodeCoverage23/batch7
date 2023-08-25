package com.assignments;

import java.util.Scanner;

public class CubeofNumber {
	
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		num = sc.nextInt();
		
		System.out.println("The cube of a  "+num+" is :"+ num*num*num);

	}

}
