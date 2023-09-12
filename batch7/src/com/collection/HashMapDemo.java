package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args)
	{
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(101, "rabiya");
		h.put(103, "cc");
		h.put(102, "fff");
		h.put(141, "aaa");
		h.put(103, null);
		h.put(104, null);
		h.put(104, "aa");
		h.put(null, "ff");
		h.put(null, "dd");
		
		System.out.println(h);
		Set set=h.entrySet();
		System.out.println(set);
		
		for(Map.Entry m:h.entrySet())
		{
			System.out.println(m.getKey()+"="+m.getValue());
			
		}
		

	}

}
