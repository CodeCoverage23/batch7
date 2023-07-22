package com.Task;

import java.util.Scanner;

public class TaskOddEven {

	public static void main(String[] args) {
	//program to find out number is odd or even
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int num = s.nextInt();
				
		if(num%2==0) {
			System.out.println(num + " is an even number");
		}
		else {
			System.out.println(num + " is an odd number");
		}

	}

}
