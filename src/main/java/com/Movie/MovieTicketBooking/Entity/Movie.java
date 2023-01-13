package com.Movie.MovieTicketBooking.Entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="movie")
public class Movie  {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movieid")
    private Integer movieId;

    @Column(name = "movieName")
    private String movieName;

    @Column(name = "directorName")
    private String directorName;
    
    @Column(name = "language")
    private String language;
    
    @Column(name = "Price")
    private int price;
    
    @Column(name = "theaterid")
    private Integer theaterId;
   
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private Theater theater;

	 public Movie() {
			super();
			// TODO Auto-generated constructor stub
		}
          
	 public Movie(Integer movieId)
	 {
		 
		this.movieId=movieId;
	 }
		public Movie(Integer movieId, String movieName, String directorName,String language,Integer price, Integer theaterId) {
			super();
			this.movieId = movieId;
			this.movieName = movieName;
			this.directorName = directorName;
			this.language=language;
			this.price=price;
			this.theaterId = theaterId;
			
		}

		public Integer getMovieId() {
			return movieId;
		}

		public void setMovieId(Integer movieId) {
			this.movieId = movieId;
		}

		public String getMovieName() {
			return movieName;
		}

		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}

		public String getDirectorName() {
			return directorName;
		}

		public void setDirectorName(String directorName) {
			this.directorName = directorName;
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public Integer getTheaterId() {
			return theaterId;
		}

		public void setTheaterId(Integer theaterId) {
			this.theaterId = theaterId;
		}
            	    
		public Theater getTheater() {
			return theater;
		}

		public void setTheeater(Theater theater) {
			this.theater = theater;
		}
}