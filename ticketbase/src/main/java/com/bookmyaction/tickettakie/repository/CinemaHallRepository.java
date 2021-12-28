package com.bookmyaction.tickettakie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmyaction.tickettakie.modal.CinemaHall;

@Repository
public interface CinemaHallRepository extends JpaRepository<CinemaHall, Long>{

	List<CinemaHall> findByMovieId(String movieId);

}
