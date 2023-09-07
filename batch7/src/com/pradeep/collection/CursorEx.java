package com.pradeep.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorEx {

	public static void main(String[] args) {

		ArrayList<Integer> list =new ArrayList<>();
	list.add(58);
	list.add(93);
	list.add(53);
	list.add(79);
	list.add(46);
	list.add(32);
	System.out.println(list);
	   Iterator<Integer> itr = list.iterator();
	       while(itr.hasNext())
	       {
	    	   
	    	   Integer next = itr.next();
	    	   
	    	   if(next%2==0) {
	    		   itr.remove();
	    		   System.out.println(next);
	    	   }
	    	   
	       }
	       System.out.println(list);
	}

}
