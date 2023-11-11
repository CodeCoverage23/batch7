package com.management.hotel.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.management.hotel.entity.HotelEntity;
import com.management.hotel.repository.HotelRepository;
import com.mangement.hotel.exception.ResourceNotFoundException;
@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
	HotelRepository repo;
	
	@Override
	public ResponseEntity<HotelEntity> saveHotel(HotelEntity hotel) {
		String randomId = UUID.randomUUID().toString();
		hotel.setHotelId(randomId);
		HotelEntity response = repo.save(hotel);
		return new ResponseEntity<HotelEntity>(response,HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<List<HotelEntity>> fetchAllHotelData() {
		List<HotelEntity> findAll = repo.findAll();
		return new ResponseEntity<List<HotelEntity>>(findAll,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<HotelEntity> fetchHotelById(String hotelId) {
		
		HotelEntity findById = repo.findById(hotelId)
				.orElseThrow(() -> new ResourceNotFoundException("user with given Id is not Found : " + hotelId));		
		return new ResponseEntity<HotelEntity>(findById,HttpStatus.OK);
	}

}
