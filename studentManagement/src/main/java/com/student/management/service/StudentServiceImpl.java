package com.student.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.student.management.Constant.StudentConstant;
import com.student.management.Dto.StudentDto;
import com.student.management.Entity.Students;
import com.student.management.Repository.StudentRepo;

import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
public class StudentServiceImpl implements StudentService {
    @Autowired
	StudentRepo repo;
	//save data into db
	
	@Override
	public ResponseEntity<String> saveStudentToDb(StudentDto dto) {
     log.debug("student service Started");
     log.debug("studentDto : {}", dto);
     final Students entity=new Students();
     entity.setStudentName(dto.getStudentName());
     entity.setStudentAge(dto.getStudentAge());
     entity.setStudentAddress(dto.getStudentAddress());
     entity.setCollege(dto.getCollege());
      repo.saveAndFlush(entity);
		return new ResponseEntity<>(StudentConstant.SUCCESSFULLY_SAVED,HttpStatus.CREATED);
	}
	
	// get all data 
	
	@Override
	public ResponseEntity<List<Students>> fetchAllStudent() {
		List<Students> findAll = repo.findAll();
		return new ResponseEntity<>(findAll,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Optional<Students>> fetchDataById(Integer Id) {
    Optional<Students> findById = repo.findById(Id);
		return new ResponseEntity<Optional<Students>>(findById,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Students> updateStudent(StudentDto dto,Integer Id) {
		
		Optional<Students> findById = repo.findById(Id);
		Students students = findById.get();
		students.setStudentId(Id);
		students.setCollege(dto.getCollege());
		repo.save(students);
		
		return new ResponseEntity<Students>(students,HttpStatus.OK);
	}

	
	
	
	
	
	
}
