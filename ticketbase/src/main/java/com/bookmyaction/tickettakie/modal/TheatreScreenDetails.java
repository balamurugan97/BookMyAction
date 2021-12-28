package com.bookmyaction.tickettakie.modal;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "M_S_THEATRE_SCREEN_DETAILS")
@Data
@EqualsAndHashCode(callSuper = true)
public class TheatreScreenDetails extends BaseCommonModal {
	
	@Column(name = "screen_name")
	@JsonProperty("screen_name")
	private String screenName;
	
	@Column(name = "audio_system_type")
	@JsonProperty("audio_system_type")
	private String audioSystemType;
	
	@Column(name = "screen_type")
	@JsonProperty("screen_type")
	private String screenType;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "screen_id", referencedColumnName = "id")
	private Set<SeatArrangeMent> seatArrangements;
	
	@Column(name = "no_of_seats")
	@JsonProperty("no_of_seats")
	private int noOfSeats;
	
	
}
