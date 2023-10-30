package com.student.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.student.management.Dto.StudentDto;
import com.student.management.Entity.Students;

public interface StudentService {

	
	ResponseEntity<String> saveStudentToDb(StudentDto dto);

	ResponseEntity<List<Students>> fetchAllStudent();
	
	ResponseEntity<Optional<Students>> fetchDataById(Integer Id);
	
	ResponseEntity<Students> updateStudent(StudentDto dto,Integer Id);
	
	
}
