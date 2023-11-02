package com.student.management.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.management.Entity.Students;
@Repository
public interface StudentRepo extends JpaRepository<Students, Integer> {

	List<Students>  findStudentByStudentName(String name);
	@Query(value="select * from student_table where college=:college",nativeQuery=true)
	List<Students>  findStudent(String college);

	List<Students>  findStudentbycollege(String college);
 }
