    package com.Assign5;
   // write the program to check whether the no is greater than 100.

    import java.util.Scanner;

    public class Que6 {

	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter the number:");
		
	int num = sc.nextInt();
		
		
	if (num>100) {
	System.out.println(num+" is greater than 100");
			
			
		}
	else {
	System.out.println(num+" is not greater than 100");
			
		}
	}
}
