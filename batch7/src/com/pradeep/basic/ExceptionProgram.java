package com.pradeep.basic;

import java.io.IOException;
import java.io.LineNumberReader;

public class ExceptionProgram {

	public static void main(String[] args) {

		int a = 15;
		int b = 0;
		String name=null;
	
		
		try {
			name.length();
			
					
		}
//		catch (NullPointerException e) {
//			System.out.println("nullpointer exception");
//			
//	}

		catch (NumberFormatException e) {
			System.out.println("arithmatic exception");
			
	}
//		catch (Exception e) {
//			System.out.println("exception");
//			
//	}
		
		finally {	

		System.out.println("rest of the code");

	}
		
}
}