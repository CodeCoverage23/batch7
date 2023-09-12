package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparable
{

	public static void main(String[] args)
	{
		List<Student>l=new ArrayList<Student>();
		
		l.add(new Student(45,23,"eshrat"));
		l.add(new Student(46,26,"eshrat"));
		l.add(new Student(12,13,"ishu"));
		l.add(new Student(56,43,"taugeer"));
		System.out.println("Before sorting");
		for(Student st:l)
		{  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}
     
        Collections.sort(l);
       System.out.println("After sorting");
       System.out.println("Based on age");
       for(Student st1:l)
       {  
   		System.out.println(st1.rollno+" "+st1.name+" "+st1.age);  
	   }

}
}
