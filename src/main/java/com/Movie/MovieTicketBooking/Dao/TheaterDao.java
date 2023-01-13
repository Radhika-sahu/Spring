package com.Movie.MovieTicketBooking.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.Movie.MovieTicketBooking.Entity.Theater;


@Repository
public interface TheaterDao extends JpaRepository<Theater, Integer>{

}
