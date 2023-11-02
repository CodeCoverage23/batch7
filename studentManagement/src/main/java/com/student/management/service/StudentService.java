package com.student.management.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.student.management.Dto.StudentDto;
import com.student.management.Dto.StudentFilter;
import com.student.management.Entity.Students;

public interface StudentService {

	ResponseEntity<String> saveStudentToDb(StudentDto dto);

	ResponseEntity<List<Students>> fetchAllStudent();

	ResponseEntity<Students> fetchDataById(Integer Id);

	ResponseEntity<Students> updateStudent(StudentDto dto, Integer Id);

	ResponseEntity<String> deleteStudentById(Integer Id);

	ResponseEntity<List<Students>> fetchStudentWithName(String name, StudentFilter filter);

}
