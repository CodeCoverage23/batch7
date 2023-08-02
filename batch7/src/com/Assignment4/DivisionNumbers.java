//4. Write the java program to design method for division of two number
//which returns int value to that method and result should be print into main method.


package com.Assignment4;

public class DivisionNumbers {
 
public static int Division(int num1, int num2) {
		
		return num1/num2;
	}

	
	 public static void main(String[] args) {
		 
	        int num1 =200;
	        int num2 = 10;

	      
	        int result =Division(num1,num2);

	        
	        System.out.println("The Division result is: " + result);
	    }


}
