package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListComparator {

	public static void main(String[] args)
	{
		
		List<StudentDemo>l=new ArrayList<StudentDemo>();
		l.add(new StudentDemo(45,23,"eshrat"));
		l.add(new StudentDemo(46,26,"abc"));
		l.add(new StudentDemo(12,13,"rg"));
		l.add(new StudentDemo(56,43,"taugeer"));
		  
		System.out.println("Sorting by Name");  
		  
		 
		Collections.sort(l,new NameComparator());  
		for(StudentDemo st: l)
		{  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		

	}

}
