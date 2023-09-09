package com.Assign7;
import java.util.Scanner;

// Design method to print factors of given number
//(Enter no = 6 then factors should be displayed like 1,2,3,6.

public class Que2 {
	
public void factorial(int num) {//method for finding factorial
	
		for (int i = 1; i <=num; i++) {
			if (num % i ==0) {
				
				System.out.println(i);
			}
		}
	}

	           
  public static void main(String[] args) {
			
        	Scanner sc = new Scanner (System.in);
        	System.out.println("Enter the number:");
        	
        	int num = sc.nextInt();
        	Que2 a = new Que2();
        	
        	a.factorial(num);
		}
}
