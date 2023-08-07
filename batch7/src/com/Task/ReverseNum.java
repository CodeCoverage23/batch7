package com.Task;

import java.util.Scanner;

public class ReverseNum {
	
	public int num(int num) {
		int rev = 0;
		
		for(;num!=0;num=num/10) {
			int remainder=num%10;
			
			rev = rev *10 + remainder;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");

		int num = sc.nextInt();
		
		ReverseNum r = new ReverseNum();
		System.out.println(r.num(num));
	

	}

}
