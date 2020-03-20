package com.marcos.redehotel.domain;

import java.io.Serializable;
import java.util.Date;

public class Schedule implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private Date checkIn;
	private Date checkOut;

	public Schedule() {
		// TODO Auto-generated constructor stub
	}

	public Schedule(int id, Date checkIn, Date checkOut) {
		super();
		this.id = id;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getInputDate() {
		return checkIn;
	}

	public void setInputDate(Date inputDate) {
		this.checkIn = inputDate;
	}

	public Date getOutDate() {
		return checkOut;
	}

	public void setOutDate(Date outDate) {
		this.checkOut = outDate;
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
		Schedule other = (Schedule) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
