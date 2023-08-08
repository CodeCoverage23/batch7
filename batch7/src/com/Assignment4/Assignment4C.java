package com.Assignment4;
//Write the java program to design method for multiplication of two number which returns int value to that method and result should be print into main method.

public class Assignment4C {

	
		public int mul(int a, int b) {
			return a*b;
		}

		public static void main (String[] args) {
			Assignment4C n=new Assignment4C();
	       int c = n.mul(30,20);
	    System.out.println("Multiplication  of two no is:"+c);
					
		}
	}
