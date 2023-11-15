package com.management.user.service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.management.user.Exception.ResourceNotFoundException;
import com.management.user.entity.Hotel;
import com.management.user.entity.Rating;
import com.management.user.entity.UserEntity;
import com.management.user.repository.UserRepo;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
	UserRepo repo;
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public ResponseEntity<UserEntity> saveUser(UserEntity user) {
		String uuId = UUID.randomUUID().toString();
		user.setId(uuId);
		UserEntity saveAndFlush = repo.saveAndFlush(user);
		return new ResponseEntity<UserEntity>(saveAndFlush,HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<List<UserEntity>> getAlllUser() {
		List<UserEntity> findAll = repo.findAll();
		return new ResponseEntity<List<UserEntity>>(findAll,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<UserEntity> getUserById(String userId) {
	    UserEntity user = repo.findById(userId).
	    orElseThrow(()->new ResourceNotFoundException("user with given Id is not Found on server : " + userId));
	    
	          Rating[] ratingOfUser = restTemplate.getForObject("http://localhost:8082/rating/user/"+user.getId(), Rating[].class);
	    
	          List<Rating> ratings = Arrays.stream(ratingOfUser).toList();
		
		List<Rating> collect = ratings.stream().map(rating->{
			ResponseEntity<Hotel> hotelResponse=restTemplate.getForEntity("http://localhost:8081/hotel/get/"+rating.getHotelId(), Hotel.class);
		Hotel hotel	=hotelResponse.getBody();
		rating.setHotel(hotel);
		return rating;
		}).collect(Collectors.toList());
		
		user.setRatings(collect);
		
		return new ResponseEntity<UserEntity>(user,HttpStatus.OK);
	}

}
