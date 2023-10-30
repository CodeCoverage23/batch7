package com.student.management.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
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


//get by id

@GetMapping("/get/{Id}")
public ResponseEntity<Optional<Students>> fetchStudentById(@PathVariable Integer Id)
{
	ResponseEntity<Optional<Students>> fetchDataById = studentservice.fetchDataById(Id);
	
	return fetchDataById;
	
}


@PatchMapping("update/{Id}")
public ResponseEntity<Students> updateStudent(@RequestBody StudentDto dto,@PathVariable Integer Id)
{
	ResponseEntity<Students> updateStudent = studentservice.updateStudent(dto, Id);
	return updateStudent;
}



	
}
