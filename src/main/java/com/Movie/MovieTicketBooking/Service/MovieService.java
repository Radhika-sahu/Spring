package com.Movie.MovieTicketBooking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Movie.MovieTicketBooking.Dao.MovieDao;
import com.Movie.MovieTicketBooking.Entity.Movie;
import com.Movie.MovieTicketBooking.Exception.ResourceNotFoundException;
@Service
public class MovieService {
@Autowired
private MovieDao moviedao;
	public void addnewMovie(Movie m) {
		// TODO Auto-generated method stub
		this.moviedao.save(m);
	}
	public List<Movie> getByMovieId(Integer id) {
		// TODO Auto-generated method stub
		return moviedao.getByTheaterId(id);
	}
	public boolean updateMovie(Movie m) {
		// TODO Auto-generated method stub
	  if (moviedao.findById(m.getMovieId()).isPresent()) {
		    moviedao.save(m);
		       return true;
		        }
	  else
	  {
		  throw new ResourceNotFoundException("Movie","Id",m.getMovieId());
	  }
   }
	public String removeMovie(Integer id) {
		 if( moviedao.findById(id).isPresent())
         {
      	   moviedao.deleteById(id);
          return "Movie Deleted Successfully !";
         }
  
      // Doesn't exist, Cannot delete
     throw new ResourceNotFoundException("Movie","Id",id);
  
	}
}
