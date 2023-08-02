//1. Write the java program to design method for addition of two number which returns 
//int results to that method and result should be print into main method.

package com.Assignment4;

public class AddNumber {
	
	public static int add(int num1, int num2) {
	
		return num1+num2;
	}

	
	 public static void main(String[] args) {
	        int num1 =40;
	        int num2 = 60;

	      
	        int sum = add(num1,num2);

	        
	        System.out.println("The sum is: " + sum);
	    }
	}

	
