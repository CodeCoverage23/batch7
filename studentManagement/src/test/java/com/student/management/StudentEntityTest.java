package com.student.management;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.student.management.Entity.Students;

@ExtendWith(SpringExtension.class)
public class StudentEntityTest {

@Test
void studentTest(){
	
	
	
	Students student= new Students();
	student.setCollege("sipma");

	Students student1= new Students(10,"pradeep",30,"amt","sipna");

	assertNotNull(student);
	assertNotNull(student1);
	assertNotNull(student.toString());
	assertEquals("sipma", student.getCollege());


	
}
	
	
	
	
	
	
}
