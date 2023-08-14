package com.Assignments.basic;

import java.util.Scanner;

    public class ReverseIfElse {
    	
    	public static void main(String[] args) {
    
    		int rev=0;
    		
    		Scanner number=new Scanner(System.in);
    		System.out.println("Enter a number:");
    	    int num = number.nextInt();
    	    
    	    if (num!=0)
    	    {
    	    	for(int i=0; i<=num;i++)
    	    	{
    	    	int rem= num%10;
    	    	rev= rev*10 +rem;
    	    	num=num/10;
    	    	
    	    	}
    	    	System.out.println("reverse no. is:" + rev);
    	    }else
    	    	System.out.println("cant reverse number");
    	    
    	    

}
}