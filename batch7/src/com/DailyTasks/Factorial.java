package com.DailyTasks;
 
public class Factorial {

	public static void main(String[] args) {
		int fact=1;
	
		
		if(5>0) {
			for(int i=1;i<=5;i++) {
				
			fact=fact*i;	
					
			}
			System.out.println("the factorial of the given number 5 is : "+fact);
				
		}else {
			
			System.out.println("please enter a valid number to calculate factorial");
			
		}
	}
}
