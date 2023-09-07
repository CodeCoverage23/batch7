package com.pradeep.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		Vector<Integer> v= new Vector();
	         System.out.println(v.capacity());
	         for(int i=0;i<10;i++) {
	        	 
	        	 v.addElement(i);
	        	 
	         }
	
		System.out.println(v.capacity());
		
		v.addElement(86);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v);
		
		Enumeration<Integer> e = v.elements();
		 while(e.hasMoreElements()) {
			 Integer next = e.nextElement();			 
			  if(next%2==0) {
				  System.out.print(" "+next);
				 
			  }
			 
		 }
		 System.out.println();
		System.out.println(v);
		
	}
	
	
	
}
