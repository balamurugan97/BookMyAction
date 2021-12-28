package com.bookmyaction.tickettakie.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "M_S_SEAT_ARRANGEMENT")
public class SeatArrangeMent {

	@Column(name = "row_id")
	@JsonProperty("row_id")
	private char rowId;
	
	@Column(name = "no_of_seats")
	@JsonProperty("no_of_seats")
	private int noOfSeats;
		
	@Column(name = "seat_type")
	@JsonProperty("seat_type")
	private String seatType;

}
