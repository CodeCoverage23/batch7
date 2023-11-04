package com.student.management.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="Student_table")
public class Students {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int studentId;
@Column(name="student_name",nullable = false,length = 255)
private String studentName;
@Column(name="student_age")
private int studentAge;
@Column(name="student_address")
private String studentAddress;
@Column(name="college")
private String college;
	
	
	
	
	
	
	
	
	
}
