package com.basic.Control.Statement;

 import java.util.Scanner;
 
public class EvenOdd {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Even number upto 100 : ");
	int number= sc.nextInt();
	
	
	System.out.println("the list of even number from 1 to " +number + " : ");
	

			int i = 1;
		
           for ( i = 1; i <= number; i++) {
				if (i % 2 == 0) {
						System.out.print(i + " ");
				}


              }
           
           System.out.println("Odd number upto 100 :");
           
           for ( i = 1; i <= number; i++) {
				if (i %2 != 0) {
						System.out.print(i + " ");
				}

}
}
}
