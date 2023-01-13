package com.Movie.MovieTicketBooking.Controller;

import java.util.HashMap;


import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Movie.MovieTicketBooking.Dao.TheaterDao;
import com.Movie.MovieTicketBooking.Entity.Movie;
import com.Movie.MovieTicketBooking.Entity.Theater;
import com.Movie.MovieTicketBooking.Exception.ResourceNotFoundException;
import com.Movie.MovieTicketBooking.Service.MovieService;


@RestController
public class MovieController {
	
@Autowired
private TheaterDao theaterdao;
@Autowired
private MovieService movies;
	// Add movie
//	@PostMapping(value="/movie/add")
//	public ResponseEntity<?> addnewMovie(@RequestBody Movie m)
//	{
//		//this.movies.addnewMovie(m);
//		int movieId = m.getTheaterId();
//		 if (theaterdao.findById(movieId).isPresent())
//		 {
//		Optional<Theater>th=theaterdao.findById(movieId);
//			 Theater id=th.get();
//			 m.setTheeater(id);
//		this.movies.addnewMovie(m);
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("httpStatus", HttpStatus.CREATED.toString());
//		map.put("message", "Movie added Successfully !");
//		return new ResponseEntity<>(map, HttpStatus.CREATED);
//		 }
//		 else
//		{
//		 throw new ResourceNotFoundException("Movie","theaterId",movieId);
//		 }
//
//	}
//	
	//Get Movie By Theater Id
	@GetMapping(value="/movie/byTheaterId")
	public ResponseEntity<?> getMovie(@RequestBody Integer id)
	{
		List<Movie> list = null;
		list = this.movies.getByMovieId(id);
		if (list.size() != 0) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("httpStatus", HttpStatus.FOUND.toString());
			map.put("message", " Fetched All Movies of  theater  "+id);
			map.put("content", list);
			return new ResponseEntity<>(map, HttpStatus.FOUND);
		} else {
			throw new ResourceNotFoundException("Movie", "TheaterId", id);
		}
	}
	
//	// Update method (updating)
//		@PutMapping(value = "/movie/update")
//		public ResponseEntity<?> updatemovie(@RequestBody Movie m) {
//
//			boolean message = this.movies.updateMovie(m);
//			Map<String, Object> map = new HashMap<String, Object>();
//			map.put("httpStatus", HttpStatus.OK.toString());
//			map.put("message", "Movie Updated Successfully !");
//			return new ResponseEntity<>(map, HttpStatus.OK);
//
//		}
//		
//
//		// delete method(deleting)
//		@DeleteMapping(value = "/movie/delete")
//		public ResponseEntity<?> removeMovieById(@RequestBody Integer id) {
//			//int movieId = .getOfficeId();
//			Map<String, Object> map = new HashMap<String, Object>();
//			String message = this.movies.removeMovie(id);
//			map.put("httpStatus", HttpStatus.OK.toString());
//			map.put("message", "Movie Deleted Successfully !");
//			return new ResponseEntity<>(map, HttpStatus.OK);
//
//		}
}
