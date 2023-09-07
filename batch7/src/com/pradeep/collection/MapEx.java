package com.pradeep.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {

		Map<Integer, String> map= new HashMap<>();
		   map.put(101, "amit");
		   map.put(102, "ganesh");
		   map.put(103,"sharad");
		   map.put(104,"sharad");
		   map.put(104, "dinesh");
		   map.put(105, null);
		   map.put(106, null);
		   map.put(null, "suresh");
		   System.out.println(map);
		   //traversing the object
		   Set<Entry<Integer, String>> set = map.entrySet();
		     Iterator<Entry<Integer, String>> itr = set.iterator();
		      while(itr.hasNext()) {
		    	  
	    	  Entry<Integer, String> next = itr.next();
//		    	Map.Entry<Integer,String> entry= (Map.Entry<Integer,String>) itr.next();
		    	  
		    	              System.out.println(next.getKey()+" "+next.getValue());
		      }
		
		
		
	}

}
