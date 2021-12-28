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
@Table(name = "M_S_THEATRE_MASTER")
@Data
@EqualsAndHashCode(callSuper = true)
public class TheatreMaster extends BaseCommonModal {
	
	@Column(name = "theatre_name")
	@JsonProperty("theatre_name")
	private String theatreName;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "theatre_id", referencedColumnName = "id")
	private Set<TheatreScreenDetails> screens;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "theatre_id", referencedColumnName = "id")
	private Set<TheatreCanteenDetails> theatreCanteen;
	
	@Column(name = "theatre_address")
	@JsonProperty("theatre_address")
	private String theatreAdddress;
	
	@Column(name = "city")
	@JsonProperty("city")
	private String city;
	
	@Column(name = "longitude")
	@JsonProperty("longitude")
	private String longitude;
	
	@Column(name = "latitude")
	@JsonProperty("latitude")
	private String latitude;

}
