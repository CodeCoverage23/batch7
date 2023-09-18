package com.pradeep.java8;
@FunctionalInterface
  interface Draw {
	 public int circle( int a, int b);
	 
 }

public class LamdaExample  {
	
	public static void main(String[] args) {
		
		Draw ex=(a,b)->a+b;
			System.out.println(ex.circle(12,20));
	}	

}
