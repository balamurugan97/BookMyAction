package com.bookmyaction.tickettakie.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookmyaction.tickettakie.modal.Movies;	

@RestController
@RequestMapping("/rest/bookmyaction/")
public class BookMovie {

	
	@RequestMapping(value = "/getmovies",method =  RequestMethod.GET)
	@PreAuthorize("user,admin")
	public Movies getMovies() {
		return null;
		
	}
}
