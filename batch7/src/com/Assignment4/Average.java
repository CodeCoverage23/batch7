//5. Write the Java Program to calculate total of five subject marks and average of it.

package com.Assignment4;

public class Average {
	

	
	 public static void main(String[] args) {
	        int Phy =40;
	        int Chem =60;
	        int Bio  =60;
	        int Math=50;
	        int Eng =90;

	      
	        int total = Phy  +Chem  +Bio  + Math  +Eng ;
	        
	        int average = total/5;

	        System.out.println("The total marks is: " + total );
	        
	        System.out.println("The Average is: " + average);
	    }
	
	

}
