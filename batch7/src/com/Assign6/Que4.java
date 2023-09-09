package com.Assign6;

import java.util.Scanner;

//design method int factorial (int no)which returns int value to
 // that method.print the results into main method (Example enter no as 5,factorial means 5*4*3*2*1 then output is 120)
  
  
 
   
  

public class Que4 {
 public int factorial(int num) {
		   
		   int fact = 1;
		   for (int i = num; i>1;i--) {
			   fact = fact *1;
			   
		   }
		   return fact;
	   }
	   
	   public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		
		Que4 a = new Que4();
		System.out.println(a.factorial(num));
				
				
		
	}
}
