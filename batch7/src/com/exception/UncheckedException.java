package com.exception;

public class UncheckedException {

	public static void main(String[] args)
	{
		int age=14;
		if(age<18)
		{
			throw new YoungException("wait for couple of yeras");
		}
		else if(age>60)
		{
			throw new OldException("not applicable");
		}
		else
		{
			System.out.println("Tanks for registration");
		}
			
	}
	

}
