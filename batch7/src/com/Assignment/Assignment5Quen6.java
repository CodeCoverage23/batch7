package com.Assignment;

import java.util.Scanner;

//6. Write the program to check whether the no is greater than 100.

public class Assignment5Quen6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
        if(num>100) {
        	System.out.println("no is greater than 100");
        }else if(num==100) {
        	System.out.println("no is equal to 100");
	}else if(num<100)
		System.out.println("no is less than 100");

}
}