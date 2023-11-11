package com.management.rating.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.management.rating.entity.RatingEntity;

public interface RatingService {

	ResponseEntity<RatingEntity> saveRating(RatingEntity entity);
	
	ResponseEntity<List<RatingEntity>> getAllRating();
	
	ResponseEntity<List<RatingEntity>> getRatingByUserId(String userId);
	
	ResponseEntity<List<RatingEntity>> getRatingByHotelId(String hotelId);
	
	ResponseEntity<RatingEntity> updateRatingById(RatingEntity entity, String ratingId);
	
}
