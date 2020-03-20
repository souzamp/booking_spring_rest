package com.marcos.redehotel.domain;

import java.io.Serializable;
import java.util.Date;

public class Hotel implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private double rating;
	private Date availability;
	private String state;

	public Hotel() {
	}

	public Hotel(int id, String name, double rating, Date availability, String state) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.availability = availability;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Date getAvailability() {
		return availability;
	}

	public void setAvailability(Date availability) {
		this.availability = availability;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
