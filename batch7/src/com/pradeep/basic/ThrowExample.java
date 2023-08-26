package com.pradeep.basic;

public class ThrowExample {

	public static void markValidate(int num ) {
		
		if (num>40) {
			
			System.out.println("the student are passed in the examination");
			
		}
		else
		{
			throw new ArithmeticException("the students are failed in examination");
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		markValidate(30);
		
		System.out.println("normal flow");
		
		
	}

}
