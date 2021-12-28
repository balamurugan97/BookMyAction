package com.bookmyaction.tickettakie.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Table(name = "movies")
@Data
public class Payment {
	
	@Column(name = "transaction_id")
	@JsonProperty("transaction_id")
	private String transactionId;
	
	@Column(name = "requested_by")
	@JsonProperty("requested_by")
	private String requestedBy;
	
	@Column(name = "amount")
	@JsonProperty("amount")
	private String amount;
	
	@Column(name = "status")
	@JsonProperty("status")
	private Boolean status;
}
