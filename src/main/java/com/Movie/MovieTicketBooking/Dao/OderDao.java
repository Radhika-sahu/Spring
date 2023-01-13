package com.Movie.MovieTicketBooking.Dao;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.Movie.MovieTicketBooking.Entity.Oder;


@Repository
public interface OderDao extends JpaRepository<Oder, Integer> {

}
