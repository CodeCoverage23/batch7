package com.management.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.hotel.entity.HotelEntity;
import com.management.hotel.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	@Autowired
	HotelService service;
	
	/*
	 * save data into db 
	 * @param hotelEntity
	 * return hotel
	 */
	@PostMapping("/create")
	public ResponseEntity<HotelEntity> saveHotelData(@RequestBody HotelEntity hotel){
		
		return service.saveHotel(hotel);
		
	}
	
	
	/*
	 * fetch all data from db 
	 *
	 * return List of hotels
	 */
	@GetMapping("/all")
	public ResponseEntity<List<HotelEntity>> FetchAllHotel(){
		
		return service.fetchAllHotelData();
	}
	
	
	/*
	 * fetch all data from db 
	 *
	 * return List of hotels
	 */
	@GetMapping("/get/{hotelId}")
	public ResponseEntity<HotelEntity> fetchHotelById(@PathVariable String hotelId)
	{
		ResponseEntity<HotelEntity> fetchHotelById = service.fetchHotelById(hotelId);
		return fetchHotelById;
		
	}
	

}
