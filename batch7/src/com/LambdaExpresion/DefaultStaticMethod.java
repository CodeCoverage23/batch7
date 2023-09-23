package com.LambdaExpresion;
interface ParentInterface
{
	void show();
	void display();
	default String m1()
	{
		return "abcdef";
	}
	static void visible()
	{
		System.out.println("Static visible method");
	}
	
}
class Child implements ParentInterface
{

	@Override
	public void show()
	{
		System.out.println("child class show method");
		
	}

	@Override
	public void display()
	{
		System.out.println("child class display  method");
	}
}
public class DefaultStaticMethod {

	public static void main(String[] args) 
	{
		ParentInterface p=new Child();
		p.show();
		p.display();
		
		Child c=new Child();
		c.show();
		c.display();
		String str=c.m1();
		System.out.println(str);
		//default method of interface
		String a=p.m1();
		System.out.println(a);
		
		ParentInterface.visible();
	}

}
