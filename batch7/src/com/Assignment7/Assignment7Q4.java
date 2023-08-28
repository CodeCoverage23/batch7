package com.Assignment7;

import java.util.Scanner;

public class Assignment7Q4 {
	
	int rev=0;
	public int getreverseNumber(int num) {
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev= rev*10+rem;
			num=num/10;
			}
		return rev;
			}

	public static void main(String[] args) {
		Assignment7Q4 d=new Assignment7Q4();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number to reverse ");
		int num=sc.nextInt();
		int result=d.getreverseNumber(num);		
		System.out.println( +result);

	}

}
