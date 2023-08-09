package com.DailyTasks;
import java.util.Scanner;

public class fibonacciSeries {
	
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of terms in the Fibonacci series: ");
	        int n = scanner.nextInt();

	        System.out.println("Fibonacci series with " + n + " terms:");
	        printFibonacciSeries(n);
	        
	    }

	    public static void printFibonacciSeries(int n) {
	        int num1 = 0, num2 = 1;
	        int num3;

	        for (int i = 0; i < n; i++) {
	            System.out.print(num1 + " ");

	            int nextnum3 = num1+ num2;
	            num1 = num2;
	            num2 = nextnum3;
	        }
	    }
	}



