package com.bookmyaction.tickettakie.modal;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Table(name = "cinema_hall")
@Data
public class CinemaHall extends BaseCommonModal{
	
	@Column(name = "cinema_hall_id")
	@JsonProperty("cinema_hall_id")
	private String cinemaHallId;
	
	@Column(name = "cinema_hall_name")
	@JsonProperty("cinema_hall_name")
	private String cinemaHallNmae;
	
	@Column(name = "total_seats")
	@JsonProperty("total_seats")
	private int totalSeats;
	
	@Column(name = "booked_seats")
	@JsonProperty("booked_seats")
	private String bookedSeats;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "movie_id")
	@JsonProperty("available_movies")
	private List<Movies> movielist = new ArrayList<Movies>();

}
