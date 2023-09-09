package com.Assign5;

// write the program to print the square of any number.
import java.util.Scanner;
public class Que7 {
	
	
	public int sqr(int num) {
		
		int sqr = num *num;
		return sqr;
	}
        public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number:");
			
			int num = sc.nextInt();
			
			Que7 a = new Que7();
			System.out.println(a.sqr(num));
			
			
			
		}
}
