package com.management.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.rating.entity.RatingEntity;
@Repository
public interface RatingRepo extends JpaRepository<RatingEntity, String>  {

	List<RatingEntity> findRatingByUserId(String userId);
	
	List<RatingEntity> findRatingByHotelId(String hotelId);
	
	
}
