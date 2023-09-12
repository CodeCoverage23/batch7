package com.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args)
	{
		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		t.put(106, "rabiya");
		t.put(186, "aaa");
		t.put(196, "bbb");
		t.put(166, "cccc");
		t.put(107, "rrrrr");
		t.put(101, "riya");
		
		System.out.println(t);
		System.out.println(t.ceilingKey(187));
		System.out.println(t.ceilingEntry(187));
		
		System.out.println(t.firstEntry());
		System.out.println(t.higherKey(186));
		System.out.println(t.headMap(186));
		System.out.println(t.headMap(108));
		System.out.println(t.keySet());
		System.out.println(t.subMap(106, 166));
		
		 for(Map.Entry m:t.entrySet())
		 {    
		       System.out.println(m.getKey()+" "+m.getValue());    
		  }    
		    System.out.println("descendingMap: "+t.descendingMap()); 
	}

}
