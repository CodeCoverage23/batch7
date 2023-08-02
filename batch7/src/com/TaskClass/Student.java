package com.TaskClass;
import java.util.Scanner;

public class Student {
	// In the above example do read the college name from the user by using
	// readLine() of Scanner class.

	int rollNo;
	String studentname;
	String adress;
	static String collagename;

	public Student(int r, String s, String a, String c) {
		rollNo = r;
		studentname = s;
		adress = a;
		collagename = c;
	}

	public void display() {
		System.out.println(rollNo + " " + studentname + " " + adress + " " + collagename + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter collage name");
		String a = sc.next();
		Student s1 = new Student(110, "Sampada", "", "Nagpur");
		Student s2 = new Student(110, "Swati", " ", "Khamgaon");
		Student s3 = new Student(111, "Vaishnavi", "", "Nandura");
		Student s4 = new Student(112, "Priya", "", "Amravti");
		Student s5 = new Student(113, "Snehal", "", "Shegaon");
		s1.display	();				
				s2.display	();		
				s3.display	();	
				s4.display	();	
				s5.display	();	
		
		

	}

}
