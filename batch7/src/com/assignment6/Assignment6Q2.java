package com.assignment6;

import java.util.Scanner;

//2. Design method void multiplication (int no) and
//print the multiplication table. ( Example enter the no=5 then output like 

public class Assignment6Q2 {
	 
	public int multiplication(int num,int i) {
		int mul = num*1;
		return mul;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for(int i=1;i<=10;i++) {
			int mul = n*1;
			System.out.println(n+"*"+i+"="+n*i);
		}
	}

}
