package com.management.rating.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.management.rating.entity.RatingEntity;
import com.management.rating.exception.ResourceNotFoundException;
import com.management.rating.repository.RatingRepo;
@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	RatingRepo repo;
	
	@Override
	public ResponseEntity<RatingEntity> saveRating(RatingEntity entity) {
		String uuid = UUID.randomUUID().toString();
		entity.setRatingId(uuid);
		RatingEntity save = repo.save(entity);
		
		return new ResponseEntity<RatingEntity>(save,HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<List<RatingEntity>> getAllRating() {
       List<RatingEntity> findAll = repo.findAll();
        return new ResponseEntity<List<RatingEntity>>(findAll,HttpStatus.OK) ;
	}

	@Override
	public ResponseEntity<List<RatingEntity>> getRatingByUserId(String userId) {

		List<RatingEntity> findRatingByUserId = repo.findRatingByUserId(userId);
		
		return new ResponseEntity<List<RatingEntity>>(findRatingByUserId,HttpStatus.OK) ;
	}

	@Override
	public ResponseEntity<List<RatingEntity>> getRatingByHotelId(String hotelId) {
    List<RatingEntity> findRatingByHotelId = repo.findRatingByHotelId(hotelId);
		
		return new ResponseEntity<List<RatingEntity>>(findRatingByHotelId,HttpStatus.OK) ;
	}

	@Override
	public ResponseEntity<RatingEntity> updateRatingById(RatingEntity entity, String ratingId) {
		RatingEntity response = repo.findById(ratingId).orElseThrow(()-> new ResourceNotFoundException("rating with given id is not present : "+ratingId));
//		response.setRatingId(ratingId);
		response.setUserId(entity.getUserId());
		RatingEntity save = repo.save(response);
		return new ResponseEntity<RatingEntity>(save,HttpStatus.CREATED);
	}

}
