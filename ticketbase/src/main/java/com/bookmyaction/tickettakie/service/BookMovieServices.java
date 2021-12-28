package com.bookmyaction.tickettakie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookmyaction.tickettakie.modal.Movies;

@Service
public class BookMovieServices {
	
	//List out all the movies which are available
	@Transactional(readOnly = true)
	public List<Movies> getMovies(){
		List<Movies> moviesList = new ArrayList<Movies>();
		return moviesList;
	}

}
