package com.student.management.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.student.management.Entity.Students;

@ExtendWith(SpringExtension.class)
public class StudentTest {

	@Test
	void studentEntityTest(){
		
		Students student=new Students();
		student.setCollege("st gauarge");
		Students student1=new Students(14, "faixan", 26, "amt", "st gauarge");
		
		assertNotNull(student1);
		assertNotNull(student);
		assertNotNull(student.toString());
		assertEquals("st gauarge", student.getCollege());
		
	}
	
	
	
	
}
