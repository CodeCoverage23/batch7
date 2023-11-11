package com.management.hotel.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.management.hotel.entity.HotelEntity;

public interface HotelService {

	public ResponseEntity<HotelEntity> saveHotel(HotelEntity hotel);
	
	public ResponseEntity<List<HotelEntity>> fetchAllHotelData();
	
	public ResponseEntity<HotelEntity> fetchHotelById(String hotelId);
	
	
}
