package com.management.user.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="User_detail")
public class UserEntity {
	
	@Id
	@Column(name="user_Id")
	private String Id;
	@Column(name="user_name")
	private String name;
	@Column(name="user_email")
	private String email;
	
	@Column(name="user_about")
	private String about;
	 
	@Transient
	private List<Rating> ratings=new ArrayList<>();	
	
}
