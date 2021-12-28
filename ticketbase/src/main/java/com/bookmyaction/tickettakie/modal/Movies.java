package com.bookmyaction.tickettakie.modal;

import java.time.Duration;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "M_S_MOVIES")
@Data
@EqualsAndHashCode(callSuper = true)
public class Movies extends BaseCommonModal {
	
	@Column(name = "movie_name")
	@JsonProperty("movie_name")
	private String movieName;
	
	@Lob
	@Column(name = "movie_pic_url")
	@JsonProperty("movie_pic_url")
	private String moviePictureUrl;
	
	@Column(name = "movie_tag")
	@JsonProperty("movie_tag")
	private String movieTag;
	

	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "movie_id",referencedColumnName = "id")
	private Set<MovieDimensionType> movies;
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "movie_id",referencedColumnName = "id")
	private Set<MovieLanguages> movieLanguages;
	
	@Column(name = "movie_duration")
	@JsonProperty("movie_duration")
	private Duration movieDuration;
	
	@Column(name = "movie_certificate")
	@JsonProperty("movie_certificate")
	private String movieCertificate;

}
