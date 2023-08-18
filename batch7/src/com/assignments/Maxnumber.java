/*Assignment 5.3 Write a program to find out maximum number among 
three numbers*/

package com.assignments;
import java.util.Scanner;
public class Maxnumber {
	
	public static void main(String[] args) {
		
	int num1;
	int num2;
	int num3;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number");
    num1 = sc.nextInt();
	
	System.out.println("Enter a number");
	num2 = sc.nextInt();	
		
    System.out.println("Enter a number");
    num3 = sc.nextInt();
		
    if( num1 > num2 && num1 > num3)
    {
    	System.out.println("The maximum number is :" +num1);
    }
    else if( num2 > num3 && num2 > num1 )
    {
    	System.out.println("The maximum number is :" +num2);
    }
    else
    {
    	System.out.println("The maximum number is :" +num3);
    }
    
	}
	
}
