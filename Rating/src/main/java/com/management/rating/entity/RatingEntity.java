package com.management.rating.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="Rating")
public class RatingEntity {
   @Id
	@Column(name="Rating_Id")
	private String ratingId;
	@Column(name="User_Id")
	private String userId;
	@Column(name="Hotel_Id")
    private String hotelId;
	@Column(name="Ratings")
	private int rating;
	
	
	
	
}
