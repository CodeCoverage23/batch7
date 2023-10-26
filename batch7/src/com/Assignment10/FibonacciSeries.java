//2. Write a java program to display the Fibonacci series up to given number. 
//(Fibonacci series mean next number is the sum of previous two numbers for 
//example 0,1,1,2,3,5,8,13,21,34,55 etc. If enter no as 5 then output is 0,1,1,2,3).


package com.Assignment10;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		         Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of terms in the Fibonacci series: ");
		        int n = scanner.nextInt();
		        scanner.close();

		        System.out.println("Fibonacci series up to " + n + " terms:");
		        printFibonacciSeries(n);
		    }

		    public static void printFibonacciSeries(int n) {
		        int first = 0, second = 1;

		        if (n >= 1) {
		            System.out.print(first + " ");
		        }
		        if (n >= 2) {
		            System.out.print(second + " ");
		        }

		        for (int i = 3; i <= n; i++) {
		            int next = first + second;
		            System.out.print(next + " ");
		            first = second;
		            second = next;
		        }
		    }
	}
