package com.exception;

public class ExceptionDemo {

	public static void main(String[] args)
	{
		try 
		{
			int a=10;
			
			System.out.println("1");
			System.out.println(a/0);
			System.out.println("2");
			
		} 
		catch (Exception e)
		{
			System.out.println("3");
		}
		finally
		{
			System.out.println("4");
		}

	}

}
