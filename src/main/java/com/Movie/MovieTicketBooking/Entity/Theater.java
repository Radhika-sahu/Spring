package com.Movie.MovieTicketBooking.Entity;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="theater")
public class Theater {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String theaterName;
    private String type;
    private String address;
    private String city;
    
    //Mapping
    @OneToMany(mappedBy = "theater")
	private List<Movie> movies;
	
//	
	
	public Theater() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Theater(int id, String theaterName, String type, String address, String city) {
		super();
		this.id = id;
		this.theaterName = theaterName;
		this.type = type;
		this.address = address;
		this.city = city;
	}
	
	
	
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public List<Movie> getMovies() {
		return movies;
	}
	
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	@Override
	public String toString() {
		return "Theater [id=" + id + ", theaterName=" + theaterName + ", type=" + type + ", address=" + address
				+ ", city=" + city + "]";
	}

}
