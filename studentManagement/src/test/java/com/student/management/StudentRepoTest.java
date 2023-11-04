package com.student.management;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.student.management.Dto.StudentFilter;
import com.student.management.Entity.Students;
import com.student.management.Repository.StudentRepo;
import com.student.management.service.StudentServiceImpl;

@SpringBootTest(classes= {StudentRepoTest.class})
class StudentRepoTest {

	@Mock
	StudentRepo repo;
	
	@InjectMocks
	StudentServiceImpl service ;
@Test
void findAll() {
	var studentFilter=new StudentFilter();
	studentFilter.setCollege("sipma");
	studentFilter.setStudentName(null);
	List<Students> list = new ArrayList<>();
	list.add(new Students(12, "pradeep", 30, "amt", "sipma"));
	ResponseEntity<List<Students>> response=new ResponseEntity<List<Students>>(list,HttpStatus.OK);
//	
//when(service.fetchStudentWithName("sipma",studentFilter)).thenReturn(response);
//	
//	ResponseEntity<List<Students>> findAll = service.fetchStudentWithName("sipma",studentFilter);
when(repo.findAll()).thenReturn(list);
ResponseEntity<List<Students>> fetchAllStudent = service.fetchAllStudent();
	assertEquals(new ResponseEntity<List<Students>>(list,HttpStatus.OK), fetchAllStudent);
	
	

	
	
}
	
	
	@Test
	void findAllTest() {
		
		List<Students> list = new ArrayList<>();
		list.add(new Students(12, "pradeep", 30, "amt", "sipma"));
		
		when(repo.findAll()).thenReturn(list);
		
		List<Students> findAll = repo.findAll();
		
		assertThat(list).isEqualTo(findAll);
		
	}
	

	@Test
	void findByCollegeTest() {
		
		List<Students> list = new ArrayList<>();
		list.add(new Students(12, "pradeep", 30, "amt", "sipma"));
		
		when(repo.findStudentbycollege("sipma")).thenReturn(list);
		
		List<Students> findAll =repo.findStudentbycollege("sipma");
		
		assertThat(list).isEqualTo(findAll);
		
	}
	
	
	
}
