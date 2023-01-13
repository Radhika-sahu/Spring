package com.Movie.MovieTicketBooking.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Movie.MovieTicketBooking.Entity.Movie;
import com.Movie.MovieTicketBooking.Entity.Theater;

public interface MovieDao extends JpaRepository<Movie, Integer> {
	List<Movie> getByTheaterId(Integer id);
}
