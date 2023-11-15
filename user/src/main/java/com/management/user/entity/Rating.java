package com.management.user.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
private String ratingId;
private String userId;
private String hotelId;
private int rating;

private Hotel hotel;

@Override
public String toString() {
	return "Rating [ratingId=" + ratingId + ", userId=" + userId + ", hotelId=" + hotelId + ", rating=" + rating
			+ ", hotel=" + hotel + "]";
}
	
	
}
