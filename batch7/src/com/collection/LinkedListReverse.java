package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReverse {

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Ravi");  
        ll.add("Vijay");  
        ll.add("Ajay");  
        
       Iterator<String> i= ll.descendingIterator();
       while(i.hasNext())
       {
    	   System.out.println(i.next());
       }
	}

}
