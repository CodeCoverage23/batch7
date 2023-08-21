package com.pradeep.basic;

class Parent{
	public Parent get() {
		
		System.out.println("this is parent class");
		return this;
	}
//	{
//return this;
//	
//	}
//		
//		System.out.println("this is parent class");
//		
//		return this;
//	}
}

class Child extends Parent{
	
  public Child get() {
	  
	  System.out.println("this is child class");
	 return this; 
  }
}








public class Covariant {

	public static void main(String[] args) {
		
      Parent p=new Parent();
      p.get();
      Child c=new Child();
      c.get();
       Parent p1=new Child();
		  p1.get();
	
		
	}

}
