package com.pradeep.basic;


// if the parent class method does not throw any exception then child class  method throw unchecked exception or no exception but not checked exception

class Parent5{
		
		public void msg() {
			
			System.out.println("parent class");
		}
		
	}
	
	class Child5 extends Parent5{

    public void msg()throws RuntimeException{
		
		System.out.println("IOEXcepiton");
	
	}
	}
	public class ExceptionMethodOverriding1 extends Parent5 {	
	
	public static void main(String[] args) {

		Parent5 p = new Child5();
		p.msg();
	
	}

}
