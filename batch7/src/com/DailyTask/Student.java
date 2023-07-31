package com.DailyTask;

public class Student {

	String name;
	int rollNo;
	String address;
	static String collegeName = "IIt";

	static void change() {
		collegeName = "oxford";
	}

	public Student(String name, int rollNo, String address, String collegeName) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
	}

	void display() {
		System.out.println(name + " : " + rollNo + " : " + address + " : " + collegeName);

	}

	public static void main(String[] args) {
		Student st1 = new Student("love", 56, "pune", collegeName);
		Student st2 = new Student("kunal", 55, "mumbai", collegeName);
		Student st3 = new Student("jivan", 43, "amravati", collegeName);
		Student st4 = new Student("kiran", 12, "akola", collegeName);
		Student st5 = new Student("pawan", 22, "nagpur", collegeName);


		st2.change();
		
		st1.display();
		st2.display();
		st3.display();
		st4.display();
		st5.display();
	}

}
