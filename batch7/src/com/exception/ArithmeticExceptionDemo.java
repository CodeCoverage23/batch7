package com.exception;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) 
	{
		
		try
		{
			int a=10;
			
			System.out.println(a/0);
		//	String s=null;
			
		//	System.out.println(s.length());
			 
			System.out.println("rest of the code");

			
		}
		
//		catch (NullPointerException e)
//		{
//			System.out.println(e);
//		}
//		catch (ArithmeticException e)
//		{
//			System.out.println(e);
//		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");
		
	}

}
