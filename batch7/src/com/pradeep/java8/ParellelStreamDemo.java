package com.pradeep.java8;

import java.util.Arrays;
import java.util.List;

class StudentF{
	
	String sName;
	int score;
	public StudentF(String sName, int score) {
		super();
		this.sName = sName;
		this.score = score;
	}
	@Override
	public String toString() {
		return "StudentS [sName=" + sName + ", score=" + score + "]";
	}
	
	
	
	
	
	
}


public class ParellelStreamDemo {

	public static void main(String[] args) {

		List<StudentF> asList = Arrays.asList(
				
				new StudentF("sumit",30),
				new StudentF("nitesh",50),
				new StudentF("ritesh",93),
				new StudentF("nilesh",46)
				
				);
				
		//ParallelStream		
		asList.parallelStream().filter(s->s.score>40).forEach(s->System.out.println("student name :"+s.sName));		
	//convert stream into parallel stream
		System.out.println();
		asList.stream().parallel().filter(s->s.score>40).forEach(s->System.out.println("student name :"+s.sName));		

		
		
		
		
		
		
	}

}
