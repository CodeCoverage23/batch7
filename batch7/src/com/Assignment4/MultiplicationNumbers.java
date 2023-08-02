//3. Write the java program to design method for multiplication of two number
//which returns int value to that method and result should be print into main method.

package com.Assignment4;

public class MultiplicationNumbers {
	
  public static int Multiplication(int num1, int num2) {
		
		return num1*num2;
	}

	
	 public static void main(String[] args) {
		 
	        int num1 =70;
	        int num2 = 30;

	      
	        int result =Multiplication(num1,num2);

	        
	        System.out.println("The multiplication result is: " + result);
	    }


}
