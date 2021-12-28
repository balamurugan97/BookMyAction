package com.bookmyaction.tickettakie.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "T_S_MOVIE_SCRENNING")
public class MovieScreening {

	  	@Column(name = "screen_id")
	  	@JsonProperty("screen_id")
	    private long screenId;
	  	
	    @Column(name = "movie_name")
		@JsonProperty("movie_name")
	    private String movieName;
	    
	    @Column(name = "screnning_start_date")
	    private java.sql.Date screeningStartDate;
	    
	    @Column(name = "screnning_end_date")
	    private java.sql.Date screeningEndDate;
	    
	    @Column(name = "screnning_time")
	    private java.sql.Time screeningTime;
	    
	    
	
}
