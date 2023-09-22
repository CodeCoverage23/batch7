package com.LambdaExpresion;

interface Inter
{
	void m1();
}
public class LambdaDemo
{
	public static void main(String[] args)
	{
		Inter i=()->System.out.println("java programming");
		i.m1();
	}

}
