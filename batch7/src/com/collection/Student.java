package com.collection;

public class Student implements Comparable<Student>
{

	int rollno,age;
	String name;
	public Student(int rollno, int age, String name)
	{
		
		this.rollno = rollno;
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Student o)
	{
		if(age==o.age)
		return 0;
		else if(age>o.age)
			return 1;
		else
			return -1;
	}
	
}
