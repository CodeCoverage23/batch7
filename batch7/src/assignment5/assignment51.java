package assignment5;

import java.util.Scanner;

//.write a program to check the number is positive or negative.

public class assignment51 {
	

	 public static void main(String[] arge) 
	 {
		 Scanner Sc= new Scanner(System.in);
		 System.out.println("enter a number");
		 int num=Sc.nextInt();
		 if(num==0)
		 {
			 System.out.println("nrther positive not nigative number" +num);
		 }
		 else if(num>0)
		 {
			 System.out.println("the number is greater then 0 is positive " +num);
		 }
		 else
		 {
		 
			 System.out.println("the number is smaller than 0 is negative" +num);
		 }
	 
	 
	 }

}