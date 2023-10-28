package com.student.management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.management.Entity.Students;
@Repository
public interface StudentRepo extends JpaRepository<Students, Integer> {

}
