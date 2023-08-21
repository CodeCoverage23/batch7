//2. Design method public //int getNumberCube(int num), return int value to that method and result 
//should be into main method.

package com.Assignment7;

import java.util.Scanner;

public class GetNumberCube {
	
	   public static int getNumberCube(int num) {
	        return num * num * num;     // Calculate the cube of the number
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int inputNumber = scanner.nextInt();     // Get input from the user

	        int result = getNumberCube (inputNumber);  // Call the method and get the result
	        
	        System.out.println("The cube of  inputNumber is: " + result);

	       
	    }
	}



