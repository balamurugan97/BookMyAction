package com.bookmyaction.tickettakie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyaction.tickettakie.modal.Payment;

@RestController
@RequestMapping("/rest/bookmyaction/")
public class PaymentController {
	
	//return the response success or fail
	@RequestMapping(value = "/getcinemahall/{movie_id}",method =  RequestMethod.GET)
	@PreAuthorize("user,admin")
	public ResponseEntity<Payment> getPayment(String movieId) {
		return null;
		
	}
}
