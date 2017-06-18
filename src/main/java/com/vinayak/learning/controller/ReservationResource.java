package com.vinayak.learning.controller;

import java.time.LocalDate;

import javax.websocket.server.PathParam;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vinayak.learning.model.request.ReservationRequest;
import com.vinayak.learning.model.response.ReservationResponse;
import com.vinayak.learning.restUtils.RestUtils;

@RestController
@RequestMapping(RestUtils.RESERVATION_RESOURCE_END_POINT)
public class ReservationResource {

	@RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ReservationResponse> getAvailableRooms(
			@RequestParam("checkin") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkin,
			@RequestParam("checkout") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkout) {
		ReservationResponse r = new ReservationResponse();
		r.setPrice(123);
		return new ResponseEntity<>(r, HttpStatus.OK);
	}

	@RequestMapping(path = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ReservationResponse> createReservation(@RequestBody ReservationRequest reservationRequest) {
		return new ResponseEntity<>(new ReservationResponse(), HttpStatus.CREATED);

	}

	@RequestMapping(path = "", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ReservationResponse> updateReservation(@RequestBody ReservationRequest reservationRequest) {
		return new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);

	}

	@RequestMapping(path = "/{reservationId}", method = RequestMethod.DELETE)
	public ResponseEntity<ReservationResponse> deleteReservation(@PathVariable long reservationId) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	}

}