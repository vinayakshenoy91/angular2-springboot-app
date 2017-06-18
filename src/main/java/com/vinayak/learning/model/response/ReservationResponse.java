package com.vinayak.learning.model.response;

import com.vinayak.learning.model.Self;

public class ReservationResponse {

	private Long id;

	private Integer roomNumber;

	private Integer price;

	private Self self;

	public ReservationResponse() {

	}

	public ReservationResponse(Integer roomNumber, Integer price) {

		this.roomNumber = roomNumber;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Self getSelf() {
		return self;
	}

	public void setSelf(Self self) {
		this.self = self;
	}

}
