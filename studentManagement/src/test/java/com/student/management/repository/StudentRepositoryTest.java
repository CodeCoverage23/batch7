package com.student.management.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.student.management.Entity.Students;
import com.student.management.Repository.StudentRepo;

@SpringBootTest(classes= {StudentRepositoryTest.class})
public class StudentRepositoryTest {

	@Mock
	StudentRepo repo ;
	
	@Test
	void findStudentWithCollege() {
		
		List<Students> list =new ArrayList<>();
		 list.add(new Students(12, "gita", 30, "amt", "rammeghe"));
		
		when(repo.findStudentbycollege("rammeghe")).thenReturn(list);
		
		List<Students> actual = repo.findStudentbycollege("rammeghe");
		
		assertEquals(list, actual);

	}
	
	
	@Test
	void FindAllData() {
		
		List<Students> list =new ArrayList<>();
		 list.add(new Students(12, "gita", 30, "amt", "rammeghe"));	
		list.add(new Students(13, "suresh", 27, "yavatmal", "divyacollege"));
		
		when(repo.findAll()).thenReturn(list);
		
		List<Students> findAll = repo.findAll();
		
//		assertThat(list).isEqualTo(findAll);
		assertNotNull(findAll);
		
		
	}
	
	
}
