package com.Movie.MovieTicketBooking.Service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Movie.MovieTicketBooking.Dao.TheaterDao;
import com.Movie.MovieTicketBooking.Entity.Theater;
import com.Movie.MovieTicketBooking.Exception.ResourceNotFoundException;
@Service
public class TheaterService {
    @Autowired
	private TheaterDao thdao;
	public String addNewTheater(Theater th) {
		// TODO Auto-generated method stub
		thdao.save(th);
		return "Theater Added Successfully ";
	}
	public boolean updateTheaater(Theater th) {
		// TODO Auto-generated method stub
		if(thdao.findById(th.getId()).isPresent())
		{
			thdao.save(th);
			return true;
		}
		else
		{
			throw new ResourceNotFoundException("Theater","Id",th.getId());
		}
	}
	public Optional<Theater> getByname(Integer id) {
		// TODO Auto-generated method stub
		Optional<Theater> th =thdao.findById(id);
		return th;
	}
	public Boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		if(thdao.findById(id).isPresent())
		{
		thdao.deleteById(id);
		return true;
	}
		else
		{
			throw new ResourceNotFoundException("Theater","Id",id);
		}
}
	public List<Theater> getAllTheater() {
		// TODO Auto-generated method stub
		return thdao.findAll();
	}
}
