package com.student.management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.student.management.Constant.StudentConstant;
import com.student.management.Dto.StudentDto;
import com.student.management.Dto.StudentFilter;
import com.student.management.Entity.Students;
import com.student.management.Repository.StudentRepo;
import com.student.management.exception.ResourceNotFoundException;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepo repo;
	// save data into db

	@Override
	public ResponseEntity<String> saveStudentToDb(StudentDto dto) {
		log.debug("student service Started");
		log.debug("studentDto : {}", dto);
		final Students entity = new Students();
		entity.setStudentName(dto.getStudentName());
		entity.setStudentAge(dto.getStudentAge());
		entity.setStudentAddress(dto.getStudentAddress());
		entity.setCollege(dto.getCollege());
		repo.saveAndFlush(entity);
		return new ResponseEntity<>(StudentConstant.SUCCESSFULLY_SAVED, HttpStatus.CREATED);
	}

	// get all data

	@Override
	public ResponseEntity<List<Students>> fetchAllStudent() {
		List<Students> findAll = repo.findAll();
		return new ResponseEntity<>(findAll, HttpStatus.OK);
	}	
	@Override
	public ResponseEntity<Students> fetchDataById(Integer Id) {
		Students findById = repo.findById(Id)
				.orElseThrow(() -> new ResourceNotFoundException("user with given Id is not Found : " + Id));
		;
		return new ResponseEntity<Students>(findById, HttpStatus.OK);
	}



	@Override
	public ResponseEntity<Students> updateStudent(StudentDto dto, Integer Id) {

		Students students = repo.findById(Id)
				.orElseThrow(() -> new ResourceNotFoundException("user with given Id is not Found" + Id));
		students.setStudentId(Id);
		students.setCollege(dto.getCollege());
		repo.save(students);

		return new ResponseEntity<Students>(students, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<String> deleteStudentById(Integer Id) {

		repo.deleteById(Id);

		return new ResponseEntity<>(StudentConstant.SUCCESSFULLY_DELETED, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Students>> fetchStudentWithName(String name,StudentFilter filter) {
		List<Students> response=new ArrayList<Students>();
		if(filter.getCollege()!=null&&name!=null) {
	     List<Students> students = repo.findStudent(filter.getCollege());
	     response.addAll(students);
			
		}
		else
		{
		List<Students> students = repo.findStudentByStudentName(name);
		  response.addAll(students);
		}
		
		return new ResponseEntity<List<Students>>(response,HttpStatus.OK);
	}

}
