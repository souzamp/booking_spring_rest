package com.marcos.redehotel.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.redehotel.domain.Hotel;

@RestController
@RequestMapping(value = "/hotel")
public class HotelResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Hotel> listHotel() throws ParseException {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		Date availibility = format.parse("2020-02-16");
		
		Hotel hotel = new Hotel(1, "Canadian", 8.9, availibility, "PE");

		List<Hotel> listHotel = new ArrayList<>();
		listHotel.add(hotel);
		
		return listHotel;
	}
}
