package com.management.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.rating.entity.RatingEntity;
import com.management.rating.service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	@Autowired
	RatingService service;
	
	
	@PostMapping("/create")
	public ResponseEntity<RatingEntity> saveRating(@RequestBody RatingEntity entity )
	{
		return service.saveRating(entity);
	}
	
	
	@GetMapping("/all")
     public ResponseEntity<List<RatingEntity>> getAllRating(){
		return service.getAllRating();
	
	}
	
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<List<RatingEntity>> fetchUserId(@PathVariable String userId){
		return service.getRatingByUserId(userId);
	}	
	
	@GetMapping("/hotel/{hotelId}")
	public ResponseEntity<List<RatingEntity>> fetchHotelId(@PathVariable String hotelId){
		return service.getRatingByUserId(hotelId);
	}	
	
	@PatchMapping("/update/{ratingId}")
	public ResponseEntity<RatingEntity> updateRating(@RequestBody RatingEntity entity,@PathVariable String ratingId){
		return null;
		
		
		
	}
	
	
}	
