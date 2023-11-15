package com.management.user.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
private String hotelId;
private String hotelName;
private String location;
private String about;
@Override
public String toString() {
	return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", location=" + location + ", about=" + about
			+ "]";
}
	
	
	
}
