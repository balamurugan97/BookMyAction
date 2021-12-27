package com.bookmyaction.tickettakie.modal;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "movies")
@Data
@EqualsAndHashCode(callSuper = true)
public class Movies extends BaseCommonModal {
	
	

}
