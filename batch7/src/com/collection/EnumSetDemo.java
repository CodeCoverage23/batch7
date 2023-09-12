package com.collection;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
//Java EnumSet class is the specialized Set implementation for use with enum types. It inherits AbstractSet class and implements the Set interface.
enum days {  
	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
	}  
public class EnumSetDemo {

	public static void main(String[] args)
	{
		  Set<days> set = EnumSet.of(days.FRIDAY, days.WEDNESDAY);
		  
//		  Iterator<days> iter = set.iterator();  
//		    while (iter.hasNext())  
//		      System.out.println(iter.next());  
		  
		  set.forEach((days)->System.out.println(days));
		  
		  Set<days> set1 = EnumSet.allOf(days.class);  
	      System.out.println("Week Days:"+set1);  
	      Set<days> set2 = EnumSet.noneOf(days.class);  
	      System.out.println("Week Days:"+set2);     

	}

}
