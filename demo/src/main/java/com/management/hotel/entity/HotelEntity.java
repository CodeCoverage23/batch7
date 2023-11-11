package com.management.hotel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Hotel_Details")
public class HotelEntity {
    @Id
	@Column(name="hotel_id")
	private String hotelId;
	
    @Column(name="Hotel_Name")
    private String hotelName;
   
    @Column(name="Hotel_Location")
    private String hotelLocation;
	
    @Column(name="About_Hotel")
	private String about;
	
	
}
