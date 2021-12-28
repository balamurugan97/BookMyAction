package com.bookmyaction.tickettakie.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "M_S_MOVIE_LANGUAGES")
@Data
@EqualsAndHashCode(callSuper = true)
public class MovieLanguages extends BaseCommonModal{
	@Column(name = "language")
	@JsonProperty("language")
	private String language;
}
