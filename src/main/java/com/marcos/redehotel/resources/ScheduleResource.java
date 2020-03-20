package com.marcos.redehotel.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.redehotel.domain.Schedule;

@RestController
@RequestMapping(value = "/schedule")
public class ScheduleResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Schedule> list() throws ParseException {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		Date checkIn = format.parse("2020-02-01");
		Date checkOut = format.parse("2020-02-07");

		Schedule sch = new Schedule(1, checkIn, checkOut);

		List<Schedule> list = new ArrayList<>();
		list.add(sch);

		return list;
	}
}
