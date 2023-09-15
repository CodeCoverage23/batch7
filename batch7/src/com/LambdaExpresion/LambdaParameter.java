package com.LambdaExpresion;

interface addabale
{
	int add(int a,int b);
	
}
interface Show
{
	String show( String str);//function with single parameter
}

public class LambdaParameter
{
   public static void main(String[] args)
   {
	   
	   addabale d=(a ,b)->a+b;//single line of code
	   
	   System.out.println(d.add(20, 30));
	   
	   Show s1=(name)-> name;
       System.out.println(s1.show("Sonoo"));  
	   
		    
		   
//		//multiplr line of code in lambda expresion
//	   
//	   addabale d=(int a ,int b)->{
//	   
//		   int c;
//		   c=a+b;
//		   return c;
//		  
//		   
//	   };
	  
	   
	   
    }
}
