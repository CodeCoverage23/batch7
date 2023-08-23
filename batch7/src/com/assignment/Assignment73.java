package com.assignment;
import java.util.Scanner;

public class Assignment73 {

	public static void main(String[] args) {
		int a,i;
		System.out.println("Enter a number");
		Scanner r = new Scanner(System.in);
		a=r.nextInt();
		System.out.print("the factors of "+ a +"are:");
		for(i=1; i<=a; ++i) {
			if (a %i==0) {
				System.out.print(i +" ");
			}
		}
			
		
		
		// TODO Auto-generated method stub

	}

}
