package com.bookmyaction.tickettakie.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyaction.tickettakie.modal.CinemaHall;
import com.bookmyaction.tickettakie.service.CinemaHallService;

@RestController
@RequestMapping("/rest/bookmyaction/")
public class CinemaHallController {
	
	CinemaHallService cinemaHallService;
	
	//After selecting movie user have to select cinemaHall
	@RequestMapping(value = "/getcinemahall/{movie_id}",method =  RequestMethod.GET)
	@PreAuthorize("user,admin")
	public ResponseEntity<List<CinemaHall>> getMovies(String movieId) {
		return ResponseEntity.ok(cinemaHallService.getCinemaHallByMovie(movieId));
		
	}
}
