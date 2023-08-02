//2. Write the java program to design method for substraction of two number 
//which returns int value to that method and result should be print into main method.

package com.Assignment4;

public class SubtractNumber {
	
	public static int Subtract(int num1, int num2) {
		
		return num1-num2;
	}

	
	 public static void main(String[] args) {
		 
	        int num1 =400;
	        int num2 = 60;

	      
	        int result =Subtract(num1,num2);

	        
	        System.out.println("The subtraction result is: " + result);
	    }

}
