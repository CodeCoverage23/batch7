package com.collection;

import java.util.EnumMap;

//Java EnumMap class is the specialized Map implementation for enum keys. It inherits Enum and AbstractMap classes.
public class EnumMapDemo 
{
	 public enum Days {  
		   Monday, Tuesday, Wednesday, Thursday  
		   };  

	public static void main(String[] args) 
	{
		
		 EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);  
		   map.put(Days.Monday, "1");  
		   map.put(Days.Tuesday, "2");  
		   map.put(Days.Wednesday, "3");  
		   map.put(Days.Thursday, "4");  
		 
		   map.forEach((k,v)->System.out.println(k+"="+v));
	}

}
