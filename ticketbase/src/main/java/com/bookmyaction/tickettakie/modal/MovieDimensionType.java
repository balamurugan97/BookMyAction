package com.bookmyaction.tickettakie.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "M_S_MOVIE_DIMENSIONS")
@EqualsAndHashCode(callSuper = true)
@Data
public class MovieDimensionType extends BaseCommonModal{
	
	public static enum MOVIE_DIMENSIONS_TYPE{
		TWODIMENSION("2D"),THREEDIMENSION("3D");

		MOVIE_DIMENSIONS_TYPE(String type) {
			return;
		} 
	};

	@Column(name = "type")
	@JsonProperty("type")
	@Enumerated(EnumType.STRING)
	private MOVIE_DIMENSIONS_TYPE type;
	
}
