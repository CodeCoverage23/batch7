package com.TaskArray;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int rollno ;
	String  name;
	int std;
	String address;
	
	Student(int rollno,String name,int std,String address){
		this.rollno=rollno;
		this.name=name;
		this.std=std;
		this.address=address;
		
	}
	
}

public class ArrayListDemo {

	public static void main(String[] args) {
		Student s1 = new Student(101,"jiya",10,"amravati");
		Student s2 = new Student(102,"Khushi",11,"amravati");
		Student s3 = new Student(103,"Pratiksha",12,"amravati");
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			Student st = (Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.std+" "+st.address);
		}
		

	}

}
