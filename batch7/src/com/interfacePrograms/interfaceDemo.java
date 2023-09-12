package com.interfacePrograms;

public interface interfaceDemo 
{

	public void display();
	
 public	static void staticMethod()
	{
		System.out.println("Static method");
	}
 default void defaultMethod() {
		System.out.println("I am default method");
	}
    void show();
	
}

