package com.task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentArrayList 
{
	String name;
	String address;
	int rollno;

	
	
	public StudentArrayList(String name, String address, int rollno) 
	{
		
		this.name = name;
		this.address = address;
		this.rollno = rollno;
	}



	public static void main(String[] args) 
	{
		

		ArrayList<StudentArrayList> al=new ArrayList<>();
		
		StudentArrayList s=new StudentArrayList("rabiya","pune",47);
		StudentArrayList s1=new StudentArrayList("john","pune",34);
		StudentArrayList s2=new StudentArrayList("eshrat","pune",32);
		
		al.add(s);
		al.add(s1);
		al.add(s2);
		
//		Iterator<StudentArrayList> i=al.iterator();
//		while(i.hasNext())
//		{
//			StudentArrayList sl=(StudentArrayList)i.next();
//			System.out.println(sl.rollno+" "+sl.name+" "+sl.address);  
//		}
		for(StudentArrayList st:al)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.address); 
		}
	}

}
