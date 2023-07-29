package com.Assignmen4;
//4. Write the java program to design method for division of two number which returns int value to that method and result should be print into main method.

public class Assignment4quen4 {
	public int division(int g, int h) {
		int division = g/h;
		return  division;	
	}
	

	public static void main(String[] args) {
		int c = 65;
		int v = 13;
		 Assignment4quen4 obj = new Assignment4quen4();
		 System.out.println("Division : "+ obj.division(c, v));
		

	}

}
