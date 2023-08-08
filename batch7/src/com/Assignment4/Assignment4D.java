package com.Assignment4;
//Write the java program to design method for division of two number which returns int value to that method and result should be print into main method.

public class Assignment4D {
	public int div(int a, int b) {
		return a/b;
	}

	public static void main (String[] args) {
		Assignment4D n=new Assignment4D();
       int c = n.div(40,20);
    System.out.println("division  of two no is:"+c);
				
	}
}



