package com.marcos.redehotel;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcos.redehotel.domain.Category;
import com.marcos.redehotel.domain.Hotel;
import com.marcos.redehotel.repositories.CategoryRepository;
import com.marcos.redehotel.repositories.HotelRepository;

@SpringBootApplication
public class BookingApplication implements CommandLineRunner {

	@Autowired
	private HotelRepository hotelRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy"); // United States style of format.
		Date myDate = format.parse("01/10/2020");

		Category cat1 = new Category(null, "stay");
		Category cat2 = new Category(null, "flight");

		Hotel ht1 = new Hotel(null, "Hotel Aconchego", 7.9, myDate, "Pernambuco");
		Hotel ht2 = new Hotel(null, "Ideal Prince Hospedagem", 9.6, myDate, "Pernambuco");

		cat1.getHotels().addAll(Arrays.asList(ht1, ht2));

		ht1.setCategory(cat1);
		ht2.setCategory(cat1);

		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		hotelRepository.saveAll(Arrays.asList(ht1, ht2));

	}

}
