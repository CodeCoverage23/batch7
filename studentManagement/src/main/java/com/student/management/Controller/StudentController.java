package com.student.management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.management.Dto.StudentDto;
import com.student.management.Entity.Students;
import com.student.management.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {
    @Autowired
   StudentService studentservice;
	
	
	
// post mapping to save student to in db
	
@PostMapping("/SaveStudent")
public ResponseEntity<String> saveStudentToDb(@RequestBody StudentDto dto) {
	
	ResponseEntity<String> saveStudentToDb = studentservice.saveStudentToDb(dto);
	
	
	
	return saveStudentToDb;
}
	
@GetMapping("/allStudent")
public ResponseEntity<List<Students>> fetchStudentsFromDb(){
	
	ResponseEntity<List<Students>> fetchAllStudent = studentservice.fetchAllStudent();
 return fetchAllStudent;	
}
	
}
