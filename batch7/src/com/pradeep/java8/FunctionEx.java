package com.pradeep.java8;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionEx {

	public static void main(String[] args) {

		ArrayList<Students> list= new ArrayList<>();
		list.add(new Students(101, "pradeep", 60));
		list.add(new Students(102, "aditya", 38));
		list.add(new Students(103, "snehal", 86));
		list.add(new Students(104, "john", 53));
		list.add(new Students(105, "dinesh",74));

		Function<Students,String> f = s->{
			int mark=s.marks;
			String grade="";
			if(mark>=80) grade="A[first class]";
			else if (mark>=60) grade= "B[second class]";
			else if(mark>=40) grade="C[third class]";
			else grade="Failed" ;
			return grade;
		}; 
		Predicate<Students> p=(s3)->s3.marks>=60;
		Consumer<Students> c = (s1) -> {
			System.out.println("student Id : " + s1.id);
			System.out.println("Student Name : " + s1.name);
			System.out.println("student marks : " + s1.marks);
			System.out.println("student Grade : " + f.apply(s1));
			System.out.println();
		};
		
		for(Students s2:list) {
			if(p.test(s2)) {
			c.accept(s2);	
			}}

}}
