package com.swapniltask;

import java.util.Scanner;

//Pass the parameter to the above methods and 
//take scanner class and read the input to pass the parameters value of the methods.
//WAP to print 1 to 100 numbers by using any loop and print in multiple of 5 your name, 
//In multiple of 7 your surname, In multiple of both 5 and 7 your full name.
public class Dailytask2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value to print name of particular multiple  :");
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
			System.out.println(i + " : prajakta gulhane"); 
			
				
			}
			else if ( i % 5 == 0) {
				System.out.println(i + " : prajakta");
			}
			else if (i % 7 == 0) {
				System.out.println(i + ": gulhane"); 
			}
			else
				System.out.println(i);
				
		}
	}
	
		}
	


