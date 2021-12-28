package com.bookmyaction.tickettakie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookmyaction.tickettakie.modal.CinemaHall;
import com.bookmyaction.tickettakie.repository.CinemaHallRepository;

@Service
public class CinemaHallService {
	
	CinemaHallRepository cinemaHallRepository;
	
	//List out all cinema halls based on movie id
	@Transactional(readOnly = true)
	public List<CinemaHall> getCinemaHallByMovie(String movieId){
		List<CinemaHall> cinemaHallList = new ArrayList<CinemaHall>();
		//gives the movie available or not on the particular cinema hall
		cinemaHallList = cinemaHallRepository.findByMovieId(movieId);
		return cinemaHallList;
	}
}
