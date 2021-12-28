package com.bookmyaction.tickettakie.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User extends BaseCommonModal{
	
	@Column(name = "user_id")
	@JsonProperty("user_id")
	private String userId;
	
	@Column(name = "user_name")
	@JsonProperty("user_name")
	private String userName;
	
	@Column(name = "requested_seats")
	@JsonProperty("requested_seats")
	private String requestedSeats;
	
	@Column(name = "movie_id")
	@JsonProperty("movie_id")
	private String movieId;

}
