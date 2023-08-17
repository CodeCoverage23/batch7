package com.ak;

public class FactorialNumber {
	//Design method int factorial(int no) which returns int value to that method. print the results into main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =9,fact=1;
		
		for(int i =1;i<=n;i++) {
			fact = fact*i;
		}
	
       
	System.out.println("factorial="+ fact);
		
		}
	}

