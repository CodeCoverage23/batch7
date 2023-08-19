package com.task;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args)
	{
		/*
	  151=1^3+5^3+1^3=127:Not armstrong
	  */
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      int num=sc.nextInt();
      int original=num;
     
      int countlen=0;
      while(num>0)
      {
    	 num=num/10;
    	 countlen=countlen+1;
    	
    	  
      }
      
      System.out.println("length of "+original+":is "+countlen);
     
      int arm=0;
      int num2=original;
      while(num2>0)
      {
    	 
    	int sum=1;
    	int rem=0;
    	rem=num2%10;
    	
    	 for(int i=0;i<countlen;i++)
    	 {
    		 
    		  
    		  sum=sum*rem;
    		  
    		
    		  
    		 
    	 }
    	
    	 arm=arm+sum;
    	 num2=num2/10;
    	
    	 
    	 
    	 
    }
    
     System.out.println("Addition of sum is :"+arm);
     if(original==arm)
 	 {
 		 System.out.println(original+" is a Armstrong number");
 	 }
 	 else
 	 {
 		 System.out.println(original+" is not a Armstrong number"); 
 	 }
     
     
    	
	
    	  
    
     
     
      }
	}


