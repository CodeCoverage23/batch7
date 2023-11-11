package com.management.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.hotel.entity.HotelEntity;

@Repository
public interface HotelRepository extends JpaRepository<HotelEntity, String> {

}
