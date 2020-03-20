package com.marcos.redehotel.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.redehotel.domain.Hotel;
import com.marcos.redehotel.repositories.HotelRepository;

@Service
public class HotelService {

	@Autowired
	private HotelRepository repo;

	public Hotel find(Integer id) {
		Optional<Hotel> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
