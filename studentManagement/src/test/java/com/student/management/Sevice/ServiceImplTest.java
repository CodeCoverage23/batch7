package com.student.management.Sevice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.student.management.Entity.Students;
import com.student.management.Repository.StudentRepo;
import com.student.management.service.StudentServiceImpl;

@ExtendWith(SpringExtension.class)
public class ServiceImplTest {
   
	@Mock
	StudentRepo repo;
	
	@InjectMocks
	StudentServiceImpl service;
	
	@Test
	void testDataById() {
		
		Students student=new Students(13, "pratik", 25, "amt", "sipna");
	 Optional<Students> ofNullable = Optional.ofNullable(student);
		ResponseEntity<Students> expected=new ResponseEntity<Students>(student,HttpStatus.OK);
				
		when(repo.findById(13)).thenReturn(ofNullable);
		
		ResponseEntity<Students> actual = service.fetchDataById(13);
		
		assertEquals(expected, actual);
		
	}
	
	
	
	
}
