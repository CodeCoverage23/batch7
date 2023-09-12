package com.basic;

abstract class AbstractClass //abstract class  
{  
//abstract method declaration  
abstract void display();  
}  
public class DemoAbstractClass extends AbstractClass   
{  
//method impelmentation  
void display()  
{  
System.out.println("Abstract method?");  
}  
public static void main(String args[])  
{  
//creating object of abstract class  
	AbstractClass  obj = new DemoAbstractClass();  
//invoking abstract method  
obj.display();  
}  
}  