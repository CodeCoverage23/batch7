//2. Design method void multiplication (int no) and print the multiplication table. 
//( Example enter the no=5 then output like 5*1=5.......5*10=50) 

package com.Assignment6;

public class MultiplicationTable {
	
	public static void main(String args[]) {
		
		int no=5;
		
		for (int i=1; i<=10; i++){
			
		// System.out.println("5*i :"+(5*i));
		 
		 System.out.println(no + " * " + i + " = " + (no * i));
		}
	}

}
