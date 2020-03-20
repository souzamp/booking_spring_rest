package com.marcos.redehotel.resources;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.redehotel.domain.Hotel;
import com.marcos.redehotel.services.HotelService;

@RestController
@RequestMapping(value = "/hotel")
public class HotelResource {

	@Autowired
	private HotelService service;

	@RequestMapping(value="/{id}",method=RequestMethod.GET)

	public ResponseEntity<?> find(@PathVariable Integer id) throws ParseException {
		Hotel obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
}
