package assignment5;

import java.util.Scanner;

//  Write the program to print the square of any number.


public class assignment55 {
	public int sqr(int num) {
		int sqr = num*num;
		return sqr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.println("enter number");
		int orgnum=sc.nextInt();
		assignment55 s = new assignment55();
		System.out.println(s.sqr(orgnum));
		 
		 
	}
}
